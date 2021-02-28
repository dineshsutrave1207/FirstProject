package runner;

import org.junit.runner.RunWith;
import org.junit.*;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Feature",
				glue = {""},
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
				tags = {"@demo"},
				monochrome = true
				)


public class CucumberRunner {
	private CucumberRunner()
	{
		
	}
	
	@AfterClass
	public static void writeExtentReport()
	{
		Reporter.loadXMLConfig("src/main/resources/ReportConfig/extent-config.xml");
	}

}
