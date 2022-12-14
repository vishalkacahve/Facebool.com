package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/com/features",
		glue = "com.stepdefinition",
		plugin = "html:target",
		monochrome=true// helph for redable output
		)
public class TestRunner {

	
	
}
