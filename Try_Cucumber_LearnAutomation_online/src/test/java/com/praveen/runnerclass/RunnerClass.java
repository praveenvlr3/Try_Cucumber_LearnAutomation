package com.praveen.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Login\\Login.feature", glue="com.praveen.stepdefinitation", dryRun=!true,
monochrome=true)


public class RunnerClass {

}
