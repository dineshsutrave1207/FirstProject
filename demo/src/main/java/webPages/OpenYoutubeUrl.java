package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.PropertyHandler;
import webelements.WebDriverClass;
import webelements.WebDriverClass.xpath;

public class OpenYoutubeUrl {
	static WebDriver driver;
	public enum xpath {
		ENTERVALUES("//input[@id='search']"),
		CLICK("//button[@id='search-icon-legacy']");
	   
	    private final String xpathvalue;

	    xpath(String xpathvalue) {
	        this.xpathvalue = xpathvalue;
	    }
	    
	    public String getxpathValue() {
	        return this.xpathvalue;
	    }
	    
	}
	
	public static void OpenYoutube() throws InterruptedException {
		//WebDriver driver ;
		WebDriverClass.WebOpen();
		PropertyHandler.loadpropertyfile("qaconfig");
		driver.navigate().to("www.youtube.com");
		//driver.navigate().to(PropertyHandler.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(xpath.ENTERVALUES.getxpathValue())).sendKeys("Cucumber");
		Thread.sleep(100);
		driver.findElement(By.xpath(xpath.CLICK.getxpathValue())).click();
		Thread.sleep(300);
		driver.close();
		driver.quit();
	}

}
