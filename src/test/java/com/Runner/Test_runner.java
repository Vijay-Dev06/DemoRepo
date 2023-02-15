package com.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\eclipse workspace\\FirstCode\\Resource\\Figma.feature" ,
				glue = "com.step_definition",
				monochrome = true ,
				plugin = {"html:report"})
public class Test_runner {
  
}


