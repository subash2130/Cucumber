Feature: Login
  
  Scenario Outline: Login TestMe App
    Given I want to Enter the URL of TestMe App
    When I click on SignIn button
    Then I Enter the "<username>" and "<password>"
    
    And I click the Login Button
    Then Homepage of TestMe App is Displayed  

    Examples: 
      | username  | password    |
      | lalitha   | password123 |
	

	