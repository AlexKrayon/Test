@QA_Smoke
Feature: Insider Case Study

  Scenario: Insider QA job application
    Given Go to "https://useinsider.com/" and check Insider home page is opened or not
    Then Select "Career" menu in navigation bar
    Then Check Career Page has the following blocks

      | Locations       |
      | Teams           |
      | Life at Insider |
    When Scroll to "Career Opportunities"
    Then Apply filter jobs by Location "Istanbul, Turkey" and department "Quality Assurance"
    And Check presence of jobs list
    Then Check all jobs positions contains "Quality Assurance"
    And Check all departments contains "Quality Assurance"
    And Check all locations contains "Istanbul, Turkey"
    When Click one of the positions listed
    Then Check correct position page is opened, presence of job description, requirements and "Apply for this job" button
    Then Click Apply for this job button
    And Check Application form page appears

