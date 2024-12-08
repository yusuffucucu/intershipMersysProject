Feature: Delete messaging Functionality

  Background: : Valid login
    Given Navigate to Mersys
    When Enter username and password
    Then User should Successfully

  Scenario: Delete messaging outbox
    When Delete outbox message
    Then The deletion process should be successfuly
