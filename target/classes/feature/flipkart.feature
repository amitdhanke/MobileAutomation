#Author: Amit Dhanke
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@FlipKart_TC1
Feature: Test Flipkart for E2E

  @FlipKart_TC1
  Scenario Outline: Search for product and validte the price
    Given sing in flipkart with "<mobileNo>","<password>"
    When enter "<productCatagory>","<productName>" for search

    Examples: 
      | mobileNo   | password       | status  | productCatagory | productName                                   |
      | 7387585699 | Dad.9822898593 | success | mobiles         | Redmi Note 6 Pro (Blue, 64 GB) OnlyOnFlipkart |
