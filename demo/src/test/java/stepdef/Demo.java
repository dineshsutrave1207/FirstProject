package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demo {
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    
	    System.out.println("hello");
	}

	@Then("^browse the website$")
	public void browse_the_website() throws Throwable {
		System.out.println("hi");   
	}

	@Then("^Close$")
	public void close() throws Throwable {
		System.out.println("bye");    
	}

}
