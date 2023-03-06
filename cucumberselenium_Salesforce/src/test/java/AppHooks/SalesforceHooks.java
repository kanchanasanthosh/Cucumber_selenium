package AppHooks;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Salesforce_factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import utility.ConfigReader;

public class SalesforceHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty() {
		
		configReader = new ConfigReader();
	prop = configReader.init_prop();
		
	}
	
	@Before(order =1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver=driverFactory.init_driver(browserName);
		
	}
	
	@After( order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After( order = 1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot
	String screenshotName=	scenario.getName().replaceAll(" "," _ ");
	byte [] sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", screenshotName);	
			
			
			
		}
	}
	
}
