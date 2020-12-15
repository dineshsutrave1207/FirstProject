package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.ConfigConnection;

public class Demo {
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    
	    System.out.println("hello");
	}

	@Then("^browse the website$")
	public void browse_the_website() throws Throwable {
		System.out.println("hi");  
		ConfigConnection.loadPropertyFile();
	}

	@Then("^Close$")
	public void close() throws Throwable {
		System.out.println("bye");    
	}

}
