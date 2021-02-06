package org.test;

import org.baseclass.JVM_Reports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Janani\\eclipse-workspace\\AppiumwithCucumber\\src\\test\\resources\\snapdeal.feature", 
glue = {"org.stepdefinition" },
plugin= {"json:C:\\Users\\Janani\\eclipse-workspace\\AppiumwithCucumber\\src\\test\\resources\\Snapdeallogin.json"})

public class TestRunner {

	@AfterClass
	public static void Snapdeal() {
		
		
		JVM_Reports.generateJVM_Reports("C:\\Users\\Janani\\eclipse-workspace\\AppiumwithCucumber\\src\\test\\resources\\Snapdeallogin.json");

	}

	
	
	}

