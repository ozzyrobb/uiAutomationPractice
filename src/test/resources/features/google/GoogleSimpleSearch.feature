Feature: Search Google and find results
  In order to find information online
  An internet user
  Should be able to search via Google and browse the results

  Scenario: Search for any term and print the first 'n' results
    Given I am on the Google homepage
    When I search for '<cat_food>'
    Then I should be able to view the first five pages of results


