Feature: Bin control Functionality
  Background: : Valid login
    Given Navigate to Mersys
    When Enter username and password
    Then User should Successfully

    Scenario: Bin control
      When Navigate to trash box
      And Restore message on the trash box
      And successfully message should be displayed
      And delete message on the trash box
      Then successfully message should be displayed
