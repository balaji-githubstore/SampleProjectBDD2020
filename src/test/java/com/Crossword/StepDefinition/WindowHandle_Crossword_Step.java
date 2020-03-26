package com.Crossword.StepDefinition;

import com.Crossword.Pages.WindowHandle_Crossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WindowHandle_Crossword_Step 
{
	WindowHandle_Crossword_Page MyWindow = new WindowHandle_Crossword_Page();
	

	@Given("^User Launch the Chrome application$")
	public void user_Launch_the_Chrome_application() throws Throwable 
	{
		MyWindow.LaunchBrowser();
	}

	@When("^Open the Crossword Home page and Login$")
	public void open_the_Crossword_Home_page_and_Login() throws Throwable 
	{
		MyWindow.HomePage();
	}

	@Then("^User view the award details using window handling$")
	public void user_view_the_award_details_using_window_handling() throws Throwable 
	{
		MyWindow.windowHandle();
	}

	@Then("^close the Browser$")
	public void close_the_Browser() throws Throwable 
	{
		MyWindow.closePage();
	}
	
}
