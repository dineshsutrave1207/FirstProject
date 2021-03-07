package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.PropertyHandler;

public class WebDriverClass {

	public enum xpath {
		ENTERVALUES("//input[@id='search']"), CLICK("//button[@id='search-icon-legacy']");

		private final String xpathvalue;

		xpath(String xpathvalue) {
			this.xpathvalue = xpathvalue;
		}

		public String getxpathValue() {
			return this.xpathvalue;
		}

	}

	public static void WebOpen() throws InterruptedException {

		WebDriver driver;
		String driverpath = System.getProperty("user.dir") + "\\driver\\";

		PropertyHandler.loadpropertyfile("qaconfig");
		String browser = PropertyHandler.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverpath + "\\chromedriver88.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", driverpath + "\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", driverpath + "\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		
		  driver.navigate().to(PropertyHandler.getProperty("url"));
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath(xpath.ENTERVALUES.getxpathValue())).sendKeys("Cucumber"); 
		  Thread.sleep(100);
		  driver.findElement(By.xpath(xpath.CLICK.getxpathValue())).click();
		  Thread.sleep(300); 
		  driver.close(); 
		  driver.quit();
		 

	}

}
