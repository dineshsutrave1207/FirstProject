package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {
	
	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(10);
	driver.close();
	driver.quit();
	}
	

}
