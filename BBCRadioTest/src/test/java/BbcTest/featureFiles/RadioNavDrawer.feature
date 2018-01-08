@test

Feature: Selecting  three categories

Scenario Outline: Opening a drawer should close the other drawers
Given I can see the radio nav
When I select <section> in the radio nav
Then the <section> drawer is open and the other drawers are closed
Examples: of sections
  |section |
| Stations |
| Categories |
| Schedules |