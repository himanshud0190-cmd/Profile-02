package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution.feature"},
		
		glue = {"Execution"},
		
		plugin = {"pretty"}
			
		)
public class Runnerclass extends AbstractTestNGCucumberTests {

}
