Feature: verify Login of the Aritizalp application
  
  Scenario: Login and verify aritiza application 
    Given open  chromebrowser and maximize
    And clickthe signin button 
    When Enter email click and password 
    And click signin
    And verify usernaame occuer in homepage
    Then quit the browser
    
