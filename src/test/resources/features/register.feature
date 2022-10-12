Feature: Register user
  I as service, I need register a new user into page Utest

  Scenario: Register successful
    Given he user is in the web page
    When  the user his register
    Then  the user could see a successful register message