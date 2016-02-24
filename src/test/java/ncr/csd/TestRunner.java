package ncr.csd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="sample.test",
tags= "~@NotNow,~@Regression")
public class TestRunner {

}
