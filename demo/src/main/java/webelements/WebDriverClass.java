package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.PropertyHandler;

public class WebDriverClass {
	
	public static void main(String args[]) throws InterruptedException {
	
	WebDriver driver ;
	String driverpath= System.getProperty("user.dir")+"\\driver\\";
	
	PropertyHandler.loadpropertyfile("qaconfig");
	String browser =PropertyHandler.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",driverpath+"\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver",driverpath+"\\chromedriver.exe");
		driver = new InternetExplorerDriver();
	}
	else
	{
		System.setProperty("webdriver.gecko.driver",driverpath+"\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	
	driver.navigate().to(PropertyHandler.getProperty("url"));
	driver.manage().window().maximize();
	Thread.sleep(10);
	driver.close();
	driver.quit();
	}
	

}
