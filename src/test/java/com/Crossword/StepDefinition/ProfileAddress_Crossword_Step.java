package com.Crossword.StepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.Crossword.Pages.ProfileAddress_Crossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileAddress_Crossword_Step 
{
	ProfileAddress_Crossword_Page MyProfileAddress = new ProfileAddress_Crossword_Page();
	
	@Given("^User launch the Chrome Application$")
	public void user_launch_the_Chrome_Application() throws Throwable
	{
		MyProfileAddress.LaunchBrowser();
	}

	@When("^Open the crossword Home Page and Login$")
	public void open_the_crossword_Home_Page_and_Login() throws Throwable 
	{
		MyProfileAddress.HomePage();
		MyProfileAddress.screenshot("src/test/resources//Screenshot//HomePage.png");
	}

	@Then("^User update the profile details$")
	public void user_update_the_profile_details() throws Throwable 
	{
		MyProfileAddress.updateProfile();
		MyProfileAddress.screenshot("src/test/resources//Screenshot//profileUpdate.png");
	}

	@Then("^User add the new address$")
	public void user_add_the_new_address() throws Throwable
	{
		MyProfileAddress.newAddress();
		MyProfileAddress.screenshot("src/test/resources//Screenshot//newAddress.png");
	}

	@Then("^Close The Browser$")
	public void close_The_Browser() throws Throwable 
	{
		MyProfileAddress.closePage();
	}
}
