Feature: Sitetracker Salesforce requirements

Scenario: Cucumber setup

    Given browser is launched and salesforce site is open
    When the Component Reference tab is opened
    And datatable is searched in quick find
    And datatable is clicked under Lightning Web Components
    And Datatable from Inline Edit is selected under Examples tab in the main pane
    And Run button is clicked
    And
    Then run should be successful