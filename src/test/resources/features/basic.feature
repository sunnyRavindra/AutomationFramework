Feature: Application Login

Background:
	Given User starts the Browser
	
  @Smoke
  Scenario: Test case
    Given step with int 1
    When step with string "two" and "three"
    Then step with double 0.3
    And step with regex "anytypeinput"
    Then step with list input
    |index0| 
    |index1| 
    |index2| 
    |index3| 
    |index4| 
    |index5| 
    But step six

  @Regression
  Scenario Outline: Parameterized test case 
   	Given step with string "<param1>" and "<param2>"
    Examples:
    |param1|param2|
    |param1value1|param1value2|
    |param2value2|param2value2|
    
  @Smoke
  Scenario Outline: Parameterized test case 
   	Given step with string "<param1>" and "<param2>"
    Examples:
    |param1|param2|
    |param1value1|param1value2|
    |param2value2|param2value2|

    
 #Tags
  @Tag1
  Scenario: Tag1 Test 
    Given "tag" testcase 

  @Tag2
  Scenario: Tag2 Test 
    Given "tag" testcase 
    
  @Tag1 @Tag2
  Scenario: Tag1 and Tag2 Test 
    Given "tag" testcase 