package com.Crossword.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Crossword.ExcelUtility.Crossword_Excel;

public class WindowHandle_Crossword_Page 
{

	WebDriver driver;
	
	//Window handling operation
	By award = By.xpath("//*[@id=\"nav-menu-915599\"]/ul/li[6]/a");
	By aboutTheAward = By.xpath("//*[@id=\"header\"]/div/div/div[2]/ul/li[2]/a");
	By arrowClick = By.xpath("/html/body/div[2]/section/div[2]/div[2]/div[2]/div/button[2]");
	By author = By.xpath("//*[@id=\"MultiCarousel2\"]/div/div[6]/div/p[1]");
	
	public void LaunchBrowser() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	//To take the screenshot
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts =((TakesScreenshot)driver); //Convert web driver object to TakeScreenshot
		File SrcFile = ts.getScreenshotAs(OutputType.FILE); //Call getScreenshotAs method to create image file
		FileUtils.copyFile(SrcFile, new File(path)); //Copy file at destination
	}
	
	//Using webdriver get visting the testing Website and login
	public void HomePage() throws IOException 
	{
		driver.get("https://www.crossword.in/"); //Launch Chrome and direct it to the URL
		System.out.println(driver.getTitle()); //Gett the actual value of the title
		
		Crossword_Excel data = new Crossword_Excel();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_session_email")).sendKeys(data.excel_username(1)); 
		driver.findElement(By.id("user_session_password")).sendKeys(data.excel_password(1));
		driver.findElement(By.xpath("//*[@id=\"user_session_submit\"]")).click();
	}
	
	//window handling operation 
	public void windowHandle() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(award).click();
			
		Set<String> winHandles = driver.getWindowHandles(); //To handle all new opened window
		System.out.println("The number of windows handles are" +winHandles.size());
		for(String winHandle:winHandles)
		{
			driver.switchTo().window(winHandle); //Switching to Child window
		}
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		Thread.sleep(2000);
		driver.findElement(aboutTheAward).click();
		driver.findElement(arrowClick).click();
		driver.findElement(arrowClick).click();
		driver.findElement(arrowClick).click();
		driver.findElement(author).click();
			
		Set<String> winHandles2 = driver.getWindowHandles();
		System.out.println("The number of windows handles are" +winHandles2.size());
		for(String winHandle2:winHandles2)
		{
			driver.switchTo().window(winHandle2); //Switching to Child window
			driver.close(); // Closing the Child Window
		}
	}
	
	public void closePage() throws InterruptedException
	{
		Thread.sleep(2000);
//		driver.close(); 
	}
}
