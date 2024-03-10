package uifeature;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;

public class AppHooks {
	
	WebDriver driver;
	@Before
	public void launchBrowser()
	{
		DriverFactory df = new DriverFactory();
		
		driver = df.initBrowser("Chrome");
		
		driver.manage().window().maximize();
		
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean hasFailed = scenario.isFailed();
		
		if(hasFailed)
		{
			String scenarioName = scenario.getName();
			String scenarioNameWithoutSpace = scenarioName.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", scenarioNameWithoutSpace);
			
		}
	}
	
	@After(order = 1)
	public void closingBrowser()
	{
		driver.quit();
	}
	
	

}