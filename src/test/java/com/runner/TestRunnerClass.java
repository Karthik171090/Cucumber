package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"com.stepdefinition"}, plugin= {"pretty", "json:src\\test\\resources\\Reports\\out.json"})
public class TestRunnerClass {
@AfterClass
public static void reportgeneration() {
	JVMReport.generateJVMReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\out.json");

}
	
	
}
