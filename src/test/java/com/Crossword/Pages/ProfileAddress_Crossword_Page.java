package com.Crossword.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.Crossword.ExcelUtility.Crossword_Excel;


public class ProfileAddress_Crossword_Page 
{

	WebDriver driver;
	
	//Updating the profile details
	By myAccount = By.linkText("My Account");
	By updateProfile = By.linkText("Update Profile");
	By mobile =By.id("customer_mobile");
	By landLine = By.id("customer_landline");
	By updateButton =By.id("customer_submit");
	
	//Add new Address
//	By myAccount= By.linkText("My Account");
	By addressBook = By.linkText("Address Book");
	By newAddress = By.id("new-addr-link");
	By addressName = By.id("address_name");
	By addressAddress = By.id("address_address");
	By addressState = By.className("state_select");
	By addressCity =By.id("address_city");
	By addressZip =By.id("address_zip");
	By addressMobile =By.id("address_mobile");
	By addressLandline = By.id("address_landline");
	By create = By.id("address_submit");

	public void LaunchBrowser() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe"); //Declaration and instantiation of objects/variables
		driver = new ChromeDriver();  //Instantiate a ChromeDriver class
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
		System.out.println(driver.getTitle()); //Get the actual value of the title
		 
		Crossword_Excel data = new Crossword_Excel();  // create a object to Read excel sheet  
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_session_email")).sendKeys(data.excel_username(1)); //Get username from the excel 
		driver.findElement(By.id("user_session_password")).sendKeys(data.excel_password(1)); //Get password from the excel
		driver.findElement(By.xpath("//*[@id=\"user_session_submit\"]")).click();
	}
	
	//To Update Profile
	public void updateProfile() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(myAccount).click();
		Thread.sleep(3000);
		driver.findElement(updateProfile).click();
		driver.findElement(mobile).sendKeys("9445600813");
		driver.findElement(landLine).sendKeys("01432655333");
		driver.findElement(updateButton).click();
	}
	
	//To Add new address
	public void newAddress() throws InterruptedException
	{
		driver.findElement(myAccount).click();
		driver.findElement(myAccount).click();
		Thread.sleep(5000);
		driver.findElement(addressBook).click();;
		driver.findElement(newAddress).click();
		driver.findElement(addressName).sendKeys("Chikum");
		driver.findElement(addressAddress).sendKeys("No:3,Bharathi Nivass");
				
		WebElement stateDropDown = driver.findElement(addressState); 
		Select dropdown = new Select(stateDropDown); 
		dropdown.selectByValue("West Bengal"); //Select value from dropdown
				
		driver.findElement(addressCity).sendKeys("Pondy");
		driver.findElement(addressZip).sendKeys("600003");
		driver.findElement(addressMobile).sendKeys("9876543210");
		driver.findElement(addressLandline).sendKeys("04135444");
		driver.findElement(create).click();
	}
	
	
	public void closePage() throws InterruptedException
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close(); //To closes the current open window
	}
}
