Feature: DataTable Functionality

  Background:   Given Navigate to Mersys
    When Enter username and password
    Then User should Successfully

    Scenario: Delete send messages

      And Click on the MainMenuPage
      |HamburgerMenu|
      |messaging    |
      |outBox |
      |trashIcon|
      |confirmDelete|
      Then The deletion process should be successful
