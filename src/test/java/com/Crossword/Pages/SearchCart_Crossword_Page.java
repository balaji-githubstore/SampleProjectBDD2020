package com.Crossword.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Crossword.ExcelUtility.Crossword_Excel;

public class SearchCart_Crossword_Page 
{

	WebDriver driver;
	 
	//Adding books to the cart
	By bestSellers = By.xpath("//*[@id=\"content-slot\"]/div[4]/div/div/div/div[2]/div/a/img");
	By books =By.linkText("The Phoenix");
	By viewcartButton = By.xpath("//*[@id=\"hd\"]/div/div/div[2]/div[1]/div/div[2]/div[1]/a[4]");

	
	public void LaunchBrowser() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe"); //Declaration and instantiation of objects/variables
		driver = new ChromeDriver(); //Browser we want to launch
		driver.manage().window().maximize(); //To maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //Wait for mentioned time
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
	
	//Searching for the books to add cart
	public int selectBook() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(bestSellers).click();
		
		Thread.sleep(2000);
		driver.findElement(books).click();

		Thread.sleep(5000);
		
//		To get the partial link text
		List <WebElement> s= driver.findElements(By.linkText("my cart"));
		System.out.println(s.size());
		int size=s.size();
		return size;
	}
	
	//To click view cart icon
	public void viewCart() throws InterruptedException
	{
			Thread.sleep(2000);
			driver.findElement(viewcartButton).click();
	}
	
	public void closePage()
	{
		driver.findElement(By.linkText("Logout")).click(); //Logout Operation
		driver.close(); //To closes the current open window
	}
}
