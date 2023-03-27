package com.praveen.stepdefinitation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^To lanuch the browser$")
	public void to_lanuch_the_browser() throws Throwable {
	   System.out.println("To lanuch the browser");
	}

	@When("^To lanuch the Url$")
	public void to_lanuch_the_Url() throws Throwable {
	  System.out.println("To lanuch the Url");
	}

	@When("^To enter the username of the login$")
	public void to_enter_the_username_of_the_login() throws Throwable {
	   System.out.println("To enter the username of the login");
	}

	@When("^To enter the password of the login$")
	public void to_enter_the_password_of_the_login() throws Throwable {
	  System.out.println("To enter the password of the login");
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
	    System.out.println("Click login button");
	}
}
