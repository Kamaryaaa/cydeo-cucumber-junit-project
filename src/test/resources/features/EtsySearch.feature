Feature: Etsy search functionality

  Scenario: Etsy title verification
    Given user is on the etsy home page
    Then user sees title as expected


  @wip
  Scenario: Etsy search functionality title verification
    Given user is on the etsy home page
    Then user types Wooden Spoon in search box
    And user clicks search button
    Then user sees the Wooden Spoon in the title

  @wipWithParama
  Scenario: Etsy search functionality title verification
    Given user is on the etsy home page
    Then user types "Baby cloth" in search box
    And user clicks search button
    Then user sees the "Baby cloth" in the title
