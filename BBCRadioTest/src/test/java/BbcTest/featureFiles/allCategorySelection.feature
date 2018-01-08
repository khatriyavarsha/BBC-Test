@test

Feature: Selecing categories

Scenario: Selecting all categories navigates to all categories page
Given I can see the radio nav
When I select Categories in the radio nav
And I select the all categories link
Then I am on the all categories page