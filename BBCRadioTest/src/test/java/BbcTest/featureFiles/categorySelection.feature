@test


Feature: Selecing all listed categories

Scenario: Selecting categories displays categories links
Given I can see the radio nav
When I select Categories in the radio nav
Then I can see the following <categories>

Examples:

|categories|
| Children’s |
| Entertainment |
| News |
| Comedy |
| Factual |
| Performances & Events |
| Documentaries |
| Learning |
| Religion & Ethics |
| Drama |
| Music |
| Sport |