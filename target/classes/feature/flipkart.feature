#Author: Amit Dhanke git repo

@FlipKart_TC1
Feature: Test Flipkart for E2E

  @FlipKart_TC1
  Scenario Outline: Search for product and validte the price
    Given sing in flipkart with "<mobileNo>","<password>"
    When enter "<productCatagory>","<productName>" for search

    Examples: 
      | mobileNo   | password       | status  | productCatagory | productName                                   |
      | 7387585699 | Dad.9822898593 | success | mobiles         | Redmi Note 6 Pro (Blue, 64 GB) OnlyOnFlipkart |
