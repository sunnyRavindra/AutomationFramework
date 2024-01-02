# This is login Feature file.
Feature: Login Feature
  In order to perform login sucessfully 
  As a user 
  I have to enter correct username and password

  Scenario: Login to the souceDemo website
    Given goTo "LoginPage" with url "https://www.saucedemo.com/"
    When validate title with "Swag Labs"
    And enter username "standard_user"
    And enter password "secret_sauce"
    And click on "signin" button
    Then validate title with "Swag Labs"
