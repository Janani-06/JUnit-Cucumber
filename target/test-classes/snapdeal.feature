Feature: Verification of Snapdeal login

  Scenario Outline: Verify the login functionality
    Given Validation with Invalid credentials
    Then User enters valid "<Phone Number>"
    When user clicks on login button
    Then User verify the invalid login error

    Examples: 
      | Phone Number |
      | Java         |
