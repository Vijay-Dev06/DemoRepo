Feature: Figma 
  Scenario: Figma workflow
    Given SetUp the given application 
    When User clicks on the login button
    And User will login using the email and password
    Then Verify that home page is displayed
    When User clicks on the New design file option in the home page
    Then Verify that design page is opened
    When User draws a rectangle on the canvas
    And User changes the color of the rectangle
    