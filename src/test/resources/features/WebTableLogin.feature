Feature: WebTable Login Scenarios


  @WebTableLogin1
  Scenario: Login Scenario#1
    Given user on the webTable login page
    Then user enter username Test
    And user enter password Tester
    And user click the login button
    Then user see the url ends with orders

  @WebTableLogin2
  Scenario: Login Scenario#2
    Given user on the webTable login page
    Then user enter username "Test"
    And user enter password "Tester"
    And user click the login button
    Then user see the url ends with orders

  @WebTableLogin3
  Scenario Outline: Login Scenario#3
    Given user on the webTable login page
    Then user enter username "<username>"
    And user enter password "<password>"
    And user click the login button
    Then user see the url ends with orders

    Examples:
      | username | password |
      | Test     | Tester   |
