Feature: Rates API for Foreign Rates for specific date

  
  Scenario: Check availability of incomplete API
    Given An incomplete API is given
    
    When API is available third
    
    Then Assert status of the response third
    
