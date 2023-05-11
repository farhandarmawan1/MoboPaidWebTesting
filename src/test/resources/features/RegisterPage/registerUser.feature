@Test
Feature: user register
  As user want to register

  Scenario: user register with valid data
    Given user already on page register
    When user input first name "Juyono"
    And user input field last name "Bambang"
    And user input field email "juyoono@gmail.com"
    And user input field password "@Berkah131"
    And user input field company name "Airlane ltd"
    And user input field phone "81551515161"
    And user select dropdown country "south africa nedbank"
    And user select dropdown state "gauteng"
    And user click terms privacy statment
    Then user click button next step
    And user succesfuly registered account