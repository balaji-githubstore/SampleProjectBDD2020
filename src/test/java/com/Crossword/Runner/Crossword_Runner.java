package com.Crossword.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@TC01_Register_and_Login_with_ValidInvalid_details, @TC02_Search_for_the_books_to_add_cart,"
				+ " @TC03_WindowHandling_Functionality, @TC04_Slider_and_Scrolling_functionality, "
				+ "@TC05_Update_profile_and_new_address"},
		glue = {"com.Crossword.StepDefinition"},
		monochrome = true
		)

public class Crossword_Runner 
{
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.141.59");
	    Reporter.setSystemInfo("Maven", "4.0.0");
	    Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}
}