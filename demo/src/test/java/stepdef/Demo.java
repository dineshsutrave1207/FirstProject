package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webPages.OpenYoutubeUrl;
import webelements.WebDriverClass;

public class Demo {
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    
	    System.out.println("hello");
	}

	@Then("^browse the website$")
	public void browse_the_website() throws Throwable {
		System.out.println("hi");
		WebDriverClass.WebOpen();
		//OpenYoutubeUrl.OpenYoutube();
	}

	@Then("^Close$")
	public void close() throws Throwable {
		System.out.println("bye");    
	}

}
