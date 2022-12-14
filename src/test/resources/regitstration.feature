Feature: Register on the Tricentis Demo WebPage

  Scenario Outline: Register

    Given the user is on the landing page
    When user clicks the register text link
    And selects their gender
    And types <first name> and <last name> and <email>
    And enters <password>
    And confirms <confirms password>
    And clicks register button
    Then user gets a registration completed message
    When user clicks on continue button
    Then user is successfully logged in with email on page

    Examples:
    | first name | last name | email | password | confirms password |
    | test | user | ontha@gmail.com | TSH_010!mav# | TSH_010!mav# |
