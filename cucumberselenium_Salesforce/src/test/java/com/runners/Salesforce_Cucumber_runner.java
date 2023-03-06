package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/features/Salesforcefeature.feature"},
		glue= {"stepdefinitions","AppHooks"},
	
			    plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
			    tags="@test"
			    
		
		)



public class Salesforce_Cucumber_runner extends AbstractTestNGCucumberTests{
	
	

}
