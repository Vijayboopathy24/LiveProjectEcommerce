Feature: Register and verify the Aritizalp application
  
  Scenario: register and verify aritiza application 
    Given open  chromebrowser and maximize
    And clickthe signin button and click create_newAcc
    When Enter firstname lastname email click the checkbox and enter password click show 
    And Click signup
    And verify usernaame occuer in homepage
    Then quit the browser
    
