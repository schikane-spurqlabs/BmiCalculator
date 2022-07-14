Feature: RetirementCalculator
  Scenario: Verify retirement Calculator for 60 year
    Given User open retirement calculator
    When user enter your age as '30'
    And user enter Your Planned Retirement Age as '60'
    And user enter Your Life Expectancy as '85'
    And user enter Expected Social Security Income as '1800'
    And user enter Other Income After Retirement as '0'
    And user enter Average investment return as '6'
    And user enter Inflation Rate (Annual) as '3'
    And user enter Your Current Income as '50000'
    And user enter Income Needed After Retirement as '75'
    And user click on calculate button
    Then user see the result as '$681,225'


    Scenario:  Verify Retirement Calculator with Table
      Given User open retirement calculator
      When user enter Retirement calculator data as
      |age|RetirementAge|LifeExpectancy|SocialSecurityIncome|IncomeAfterRetirement|AverageInvestmentReturn|InflationRate|CurrentIncome|IncomeNeeded|
      |25 |65           |90            |1500                |1                    |5                      |4            |60000        |65           |
      Then user see the result as '$2,229,290'




  Scenario Outline:  Verify Retirement Calculator for multiple data
    Given User open retirement calculator
    When user enter '<age1>''<RetirementAge>''<LifeExpectancy>''<SocialSecurityIncome>''<IncomeAfterRetirement>''<AverageInvestmentReturn>''<InflationRate>''<CurrentIncome>''<IncomeNeeded>'
    Then user see my BMI index as '<Expected1>'
    Examples:
      |age1|RetirementAge|LifeExpectancy|SocialSecurityIncome|IncomeAfterRetirement|AverageInvestmentReturn|InflationRate|CurrentIncome|IncomeNeeded|Expected1|
      |35  |66           |80            |1300                |2                    |6                      |3            |55000        |55          |$418,703        |
      |45  |70           |84            |1200                |3                    |7                      |5            |75000        |45          |$799,030        |
      |20  |75           |95            |1900                |3                    |5                      |8            |500000       |25          |$194,161,395    |
  Scenario:  Verify Retirement Calculator with vertical Table
    Given User open retirement calculator
    When user enter Retirement calculator data as vertical
      | Fields                |Values|
      |age                    |25    |
      |RetirementAge          |65    |
      |LifeExpectancy         |90    |
      |SocialSecurityIncome   |1500  |
      |IncomeAfterRetirement  |1     |
      |AverageInvestmentReturn|5     |
      |InflationRate          |4     |
      |CurrentIncome          |60000 |
      |IncomeNeeded           | 65   |
    Then user see the result as '$2,229,290'