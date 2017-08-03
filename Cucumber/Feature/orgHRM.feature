Feature: OrangeHRM Login and Logout Test 

	Scenario: Login Test
		Given Browser Launched and navigated to url
		When User enters username and password 
		And clicks on login
		Then welcome admin message displyed
		
	Scenario: Logout Test
		When Tester clicks on welcome admin
		And also clicks on logout
		Then Login page displayed	