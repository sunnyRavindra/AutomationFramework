# This is test for facade login
Feature: Facade Login Feature

 Scenario: Login to the souceDemo website with facade credentials
   Given login to soucedemo
   When validate title with "Swag Labs"
