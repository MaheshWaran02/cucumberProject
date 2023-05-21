@Browser

Feature: this feature file will used to test login functiobality of simplilearn application

  Background: 
    Given I have launched the application
    And I have clicked on Login Link

  @WIP
  Scenario: Validate the Login succes scenario
    When I enter username
    And I enter password
    And I click on login button
    Then I shoud land on home page

  @Sanity
  Scenario: Validate the Login faliure scenario
    When I enter username
    And I enter password
    And I click on login button
    Then I shoud get the error message

  @Sanity
  Scenario: Validate the Login faliure scenario
    When I enter username is "Mahesh@google.com"
    And I enter password is "Nickols@3597"
    And I click on login button
    Then I shoud get the error message is "The email or password you have entered is invalid."

  @regressions @Sanity
  Scenario Outline: Validate the Login faliure scenario
    When I enter username is "<UserNames>"
    And I enter password is "<Password>"
    And I click on login button
    Then I shoud get the error message is "The email or password you have entered is invalid."

    Examples: 
      | UserNames       | Password   |
      | Mahe@Amazon.com | Sms@123098 |
      | Magesh@meta.com | Mahe@0987  |
