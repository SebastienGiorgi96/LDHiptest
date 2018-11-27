package com.example.test.livingdoc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "json:target/cucumber.json" }, features = { "src/test/resources/" }, strict = true)

public class TestCucumber {

}
