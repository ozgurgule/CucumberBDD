Feature: Crm app login
  User Story: As a different type of user
  I should be able to login and dashboard should be displayed.

  Background: user is on login page
    Given user is on login page

  @student
  Scenario: Login as a hr employee
    When Hr enters username
    And Hr enters password
    And Hr clicks login button
    Then Hr should see dashboard