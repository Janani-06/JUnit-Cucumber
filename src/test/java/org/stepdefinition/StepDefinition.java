package org.stepdefinition;

import java.net.MalformedURLException;

import org.baseclass.BaseClass;
import org.pojo.PojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	PojoClass p;

	@Given("Validation with Invalid credentials")
	public void validation_with_Invalid_credentials() throws MalformedURLException, InterruptedException {
		launchApp();
		Thread.sleep(7000);
		p = new PojoClass();
		closePopup(p.getClose());

	}

	@Then("User enters valid {string}")
	public void user_enters_valid(String string) throws InterruptedException {
		p = new PojoClass();
		Profile(p.getProfile());
		Thread.sleep(200);
		login(p.getLogin());
		Thread.sleep(50);
		txt(p.getMail(), string);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		closePopup(p.getCon());
	}

	@Then("User verify the invalid login error")
	public void user_verify_the_invalid_login_error() {
		
	}

}
