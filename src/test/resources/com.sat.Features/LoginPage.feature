Feature: Testing Login Functionality

 Scenario: Test CRM Login with valid credentials
    Given User navigates to CRM login page
    When user enters valid username "TP_HCLPO-AK@sovereign.org.uk"
    And Click on Next button
    When user enter valid password "Sov3rdPartyAccount"
    And click on signin
    And Click on yes
    Then user is navigated to "Apps - Dynamics 365" page
        
    Scenario Outline: Test navigation for Tenancy Management
    Given User navigates to CRM login page
    When user enters valid username "TP_HCLPO-AK@sovereign.org.uk"
    And Click on Next button
    When user enter valid password "Sov3rdPartyAccount"
    And click on signin
    And Click on yes
    Then user selects App "<App_Name>"
    
    Examples:
   	|App_Name|
   	|Customer Service Hub|