Feature: Some of the general functionalities verification

@webTableDropdown
  Scenario: DropDown option verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

@webTableRadioButton
  Scenario: Payment option verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees visa as enabled payment option
    Then user sees MasterCard as enabled payment option
    Then user sees American Express as enabled payment option