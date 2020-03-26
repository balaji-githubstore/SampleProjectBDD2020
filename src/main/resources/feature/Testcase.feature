@Crossword_WebPage_RaginiBoobalan
Feature: Crossword Website

@TC01_Register_and_Login_with_ValidInvalid_details
Scenario Outline: To check if the user is able to register and login with valid & invalid details
Given The User launch the Chrome application
Then Enter the required details to register 
Then The user login using "<username>" and "<password>" with vaild and invaild deatils
And Close the browser

Examples:

|username					|password		|
|raginiboobalan@gmail.com	|ragiboo@09		|
|chikum09@gmail.com			|chikum16		|
|Bro@gmail.com				|Bro123			|
|ar@gmail.com				|AR123			|
|ragi@gmail.com				|Ragi@123		|
|mine@gmail.com				|Mine#123		|
|cts@gmail.com				|cts123			|

@TC02_Search_for_the_books_to_add_cart
Scenario: To check if the user is able to search for books to add cart (Failed Condition)
Given User launch the Chrome application
When Open the Crossword Home page and login
Then Click bestseller icon, click book and buy the book
Then View the cart book
And Close the Browser 

@TC03_WindowHandling_Functionality
Scenario: To check if the user is able to handle window handling 
Given User Launch the Chrome application
When Open the Crossword Home page and Login
Then User view the award details using window handling
And close the Browser 

@TC04_Slider_and_Scrolling_functionality
Scenario: To check if the user is able to handle slider and scroll
Given User Launch the Chrome Application
When Open the Crossword Home Page and Login
Then User slider the price range
Then User scroll the page
And close the browser 

@TC05_Update_profile_and_new_address
Scenario: To check if the user is able to update profile and add new address
Given User launch the Chrome Application
When Open the crossword Home Page and Login
Then User update the profile details
Then User add the new address
And Close The Browser 
