package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Profile.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty"},
		
		tags = "@profile"
		//tags = "not @functional" //"@sanity"--> to run perticular one kind of group scenarios
		 
		//@sanity or @funtional
		//"not @functional" --> will execute those scenarios those are not functional
		//"(@sanity or @functional) and (not @regression)" -->either sanity or resression but not in functional

		)

public class ProfileRunner extends AbstractTestNGCucumberTests{

}
