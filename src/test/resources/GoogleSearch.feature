Feature: Google App
@NotNow
Scenario: Search Result

Given User enter "NCR Gurgaon" in search box
When click on search
Then Result should be more than "1,43,00,000"