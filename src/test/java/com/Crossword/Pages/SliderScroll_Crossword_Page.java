package com.Crossword.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Crossword.ExcelUtility.Crossword_Excel;

public class SliderScroll_Crossword_Page 
{
	WebDriver driver;
	
	//Slider operation
	By book = By.xpath("//*[@id=\"nav-menu-915599\"]/ul/li[2]/a");
	By price = By.xpath("//*[@id=\"facet-price\"]/h6");
	By slider = By.xpath("//*[@id=\"range_as_slider\"]/div[1]/a[1]");
	
	//Scrolling the payment option page
	By payment = By.linkText("Payment Option");
	By takeMe = By.className("go-to-top");

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
	
	//Slider handling the price range
	public void slider() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(book).click();
		Thread.sleep(2000);
		driver.findElement(price).click();
		WebElement Slider = driver.findElement(slider);
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(Slider).moveByOffset(90,0).release().build();
		dragAndDrop.perform(); 
	}
		
	//Scrolling the payment option page
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(2000);
	    driver.findElement(payment).click();
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)"); //This  will scroll down the page by  1000 pixel vertical
	    
	    driver.findElement(takeMe).click();  
	}
	
	public void closePage() throws InterruptedException
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close(); //To closes the current open window
	}
	
}
