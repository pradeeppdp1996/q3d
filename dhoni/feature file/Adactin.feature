Feature: To login into adactin hotel app and book room
Description:to test adacin hotel website.

Background: To login into adacin hotel application
Given User launch the adactin application

Scenario: Verify the user login funtionality with invalid crendentails
Given User launch the adactin application
Then User enter the username in the login module
And User enter the password in the login module
Then User click on the login button

Scenario:  Book a hotel
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
And User selects the hotel location
And User selects the hotel 
And User selects the roomtype
And User selects the no of room
And User enters the in date
And User enters the out date
And user enters number of adults
And user enters the children per room
Then User click on search button

Scenario:  validate the loaction of hotel
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
And User selects the hotel location
And User selects the hotel 
And User selects the roomtype
And User selects the no of room
And User enters the in date
And User enters the out date
And user enters number of adults
And user enters the children per room
And User click on search button
Then user validate the location of hotel

Scenario:  validate the dates of booking
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
And User selects the hotel location
And User selects the hotel 
And User selects the roomtype
And User selects the no of room
And User enters the in date
And User enters the out date
And user enters number of adults
And user enters the children per room
And User click on search button
Then user validate the dates of booking

Scenario:  validate the room type and no of room
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
And User selects the hotel location
And User selects the hotel 
And User selects the roomtype
And User selects the no of room
And User enters the in date
And User enters the out date
And user enters number of adults
And user enters the children per room
And User click on search button
Then user validate the no of room and room type

Scenario:  validate the room type and no of room
Then User enter the username in the login module
And User enter the password in the login module
And User click on the login button
And User selects the hotel location
And User selects the hotel 
And User selects the roomtype
And User selects the no of room
And User enters the in date
And User enters the out date
And user enters number of adults
And user enters the children per room
And User click on search button
And user go to booking final page
Then user validate the cost including gst

