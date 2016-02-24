Feature: Google

Background:
Given user open "http://leanpitch.com" in Chrome
@NotNow
Scenario: Multiple Steps
And select "CSM training" from menu
When select City as "Pune" on CSM training page
And Select month as "Jan"
Then System should display Agenda
And Also display price

@NotNow
Scenario: 2nd Multiple Steps
And select "CSD training" from menu
When select City as "Pune" on CSM training page
And Select month as "Jan"
Then System should display Agenda
And Also display price



