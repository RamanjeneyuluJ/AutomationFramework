package com.magnifyb.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Machint\\Documents\\GitHub\\AutomationFramework\\src\\test\\java\\com\\magnifyb\\featurefile\\login.feature", glue = {
		"com.magnifyb.stepdefinition" }, plugin = { "pretty",
				"html:target/cucumber-report/login.html" }, monochrome = true )
public class LoginRunner {

}
