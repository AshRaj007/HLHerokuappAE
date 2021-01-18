Feature: Data Table Sorting

  Background: To be on The Internet Herokuapp
    Given I am on Herokuapp website

@table1test
  Scenario Outline: Sort Table1 in Ascending and Descending

    When I click on Sortable Data Tables

    Then I can sort the table in "<order>" by "<field>"


    Examples:
      | order      | field      |
      | Ascending  | Last Name  |
      | Descending | First Name |
      | Descending | Last Name  |

  @table2test
  Scenario: Sort Table2 with ID and Class attributes using Last Name

    Given I click on Sortable Data Tables
    And I can see the following displayed:
      | Smith  | John  | jsmith@gmail.com      | $50.00  | http://www.jsmith.com    |
      | Bach   | Frank | fbach@yahoo.com       | $51.00  | http://www.frank.com     |
      | Doe    | Jason | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com      |
      | Conway | Tim   | tconway@earthlink.net | $50.00  | http://www.timconway.com |

    When I click on Due to sort
    Then I can see the following displayed:
      | Smith  | John  | jsmith@gmail.com      | $50.00  | http://www.jsmith.com    |
      | Conway | Tim   | tconway@earthlink.net | $50.00  | http://www.timconway.com |
      | Bach   | Frank | fbach@yahoo.com       | $51.00  | http://www.frank.com     |
      | Doe    | Jason | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com      |



