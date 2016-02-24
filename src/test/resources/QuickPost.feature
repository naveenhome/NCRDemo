Feature: Quick Post
As an employee of NCR
I want to share my car
So that others can travel with me 

Scenario: Valid post
Given Employee enter valid quick post data
When Click on "Submit"
Then System display message "Post is Valid"

Scenario: Reset data
Given Employee enter valid quick post data
When Click on "Reset"
Then Clear all fields

Scenario: InValid post
Given Employee enter Invalid Email id
When Click on "Submit"
Then System display message "Post is not Valid"

