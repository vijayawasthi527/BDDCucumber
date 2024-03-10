package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\login.feature"},
		
		glue = {"steps"}
		
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests
{

}
