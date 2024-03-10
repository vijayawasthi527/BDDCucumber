package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appfeatures\\AddToCart.feature"},
		glue = {"steps"},
		publish = true
		
		)


public class Cart extends AbstractTestNGCucumberTests {

}
