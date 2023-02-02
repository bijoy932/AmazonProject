@regression @smoke @SKYW-15 @E2E
Feature: Amazon Search Functionality

	Scenario: Search for Blutoth
		Given Open Amazon homepage
		When Search for blutoth
		Then Item list should have only blutoth related products
		
		
	Scenario: Search for Phones
		Given Open Amazon homepage
		When Search for phones
		Then Item list should have only phones related products