package com.Crossword.StepDefinition;

import org.junit.Assert;

import com.Crossword.Pages.SearchCart_Crossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCart_Crossword_Step 
{

	SearchCart_Crossword_Page MyCart = new SearchCart_Crossword_Page();
	
	@Given("^User launch the Chrome application$")
	public void user_launch_the_Chrome_application() throws Throwable
	{
		MyCart.LaunchBrowser();
	}

	@When("^Open the Crossword Home page and login$")
	public void open_the_Crossword_Home_page_and_login() throws Throwable 
	{
		MyCart.HomePage();
	}

	@Then("^Click bestseller icon, click book and buy the book$")
	public int click_bestseller_icon_click_book_and_buy_the_book() throws Throwable 
	{
		MyCart.selectBook();
		int book=MyCart.selectBook();
		System.out.println("Total number of Android books Available: "+book);
		Boolean b;
		if(book==0)
		{
			b=false;
			Assert.assertTrue(b);
			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
		}
		else
		{
			System.out.println("OUT OF STOCK");
		}
		MyCart.screenshot("src/test/resources//Screenshot//cart.png");
		return book;
	}

	@Then("^View the cart book$")
	public void view_the_cart_book() throws Throwable 
	{
		MyCart.viewCart();
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable 
	{
		MyCart.closePage();
	}

}
