package com.Crossword.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLogin_Crossword_Page 
{
	WebDriver driver;
	
	By login = By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
	
	//Login and Logout functionality
	By email = By.id("user_session_email");
	By passwrd = By.id("user_session_password");
	By loginButton = By.xpath("//*[@id=\"user_session_submit\"]");
	By logout = By.linkText("Logout");
	

	public RegisterLogin_Crossword_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//To Launch the chrome browser using the Url
	public void LaunchBrowser() 
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

	//To register the required details
	public void register() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customer_user_attributes_name")).sendKeys("ragini");
		driver.findElement(By.id("customer_user_attributes_email")).sendKeys("ragiboo@gmail.com");
		driver.findElement(By.id("customer_user_attributes_password")).sendKeys("ragi09");
		driver.findElement(By.id("customer_user_attributes_password_confirmation")).sendKeys("ragi09");
		driver.findElement(By.id("customer_user_attributes_additional_detail_dob")).sendKeys("03/02/2020");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_gender_female")).click();	
		driver.findElement(By.id("customer_submit")).click();
	}
	
	public void loginDetails(String username, String password) throws IOException, InterruptedException 
	{
		driver.findElement(email).sendKeys(username);
		driver.findElement(passwrd).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(loginButton).click();
	}
	
	public void Closepage() throws InterruptedException 
	{
		Thread.sleep(1000); //To pause the execution of current thread
		driver.close(); //To closes the current open window
	}
}
