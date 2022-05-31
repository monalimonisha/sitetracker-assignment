Feature: Sitetracker Salesforce requirements

Scenario: Cucumber setup

    Given browser is launched and salesforce site is open
    And the Component Reference tab is opened
    And <Search> is searched in quick find
    And <Option> is clicked
    And <Dropdown Option> is selected under Examples tab in the main pane
    And Run button is clicked
    When the values in <Row> row is updated with <Label>, <Website>, <PhoneNumber>, <Date>, <Time>, <Balance>
    Then the details for <Row> should display as <Label>, <Website>, <PhoneNumber>, <Date>, <Time>, <Balance>
    
    Examples:
    | Search    | Option    |    Dropdown Option         |  Row  | Label       |  Website           |  PhoneNumber  | Date | Time      | Balance  |
    | datatable | datatable | Datatable from Inline Edit |   3   | Larry Page  | https://google.com | (555)-755-6575|Today | 12.57PM   | 770.54   |