package com.Crossword.StepDefinition;

import com.Crossword.Pages.SliderScroll_Crossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SliderScroll_Crossword_Step 
{

	SliderScroll_Crossword_Page MySliderScroll = new SliderScroll_Crossword_Page();
	
	@Given("^User Launch the Chrome Application$")
	public void user_Launch_the_Chrome_Application() throws Throwable
	{
		MySliderScroll.LaunchBrowser();
	}

	@When("^Open the Crossword Home Page and Login$")
	public void open_the_Crossword_Home_Page_and_Login() throws Throwable 
	{
		MySliderScroll.HomePage();
	}

	@Then("^User slider the price range$")
	public void user_slider_the_price_range() throws Throwable
	{
		MySliderScroll.slider();
		MySliderScroll.screenshot("src/test/resources//Screenshot//slider.png");
	}

	@Then("^User scroll the page$")
	public void user_scroll_the_page() throws Throwable
	{
		MySliderScroll.scroll();
		MySliderScroll.screenshot("src/test/resources//Screenshot//scroll.png");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable 
	{
		MySliderScroll.closePage();
	}
	
}
