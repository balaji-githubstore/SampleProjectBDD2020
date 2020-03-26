package com.Crossword.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Crossword.Pages.RegisterLogin_Crossword_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class RegisterLogin_Crossword_Step 
{

	WebDriver driver; 
	
	public RegisterLogin_Crossword_Page MyRegisterLogin = new RegisterLogin_Crossword_Page(driver); 
	
	@Given("^The User launch the Chrome application$")
	public void the_User_launch_the_Chrome_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe"); //Declaration and instantiation of objects/variables
		driver = new ChromeDriver(); //Browser we want to launch
		MyRegisterLogin = new RegisterLogin_Crossword_Page(driver);
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize(); //To maximize the window	
	}

	@Then("^Enter the required details to register$")
	public void enter_the_required_details_to_register() throws Throwable 
	{
		MyRegisterLogin.register();
		MyRegisterLogin.screenshot("src/test/resources//Screenshot//Register.png");
	}
	
	@Then("^The user login using \"([^\"]*)\" and \"([^\"]*)\" with vaild and invaild deatils$")
	public void the_user_login_using_and_with_vaild_and_invaild_deatils(String username, String password) throws Throwable 
	{
		MyRegisterLogin.loginDetails(username,password);
		Thread.sleep(4000);
		MyRegisterLogin.screenshot("src/test/resources//Screenshot//login.png");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable
	{
		MyRegisterLogin.Closepage();
	}
}
