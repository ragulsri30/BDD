package com.steps;

import java.io.IOException;

import com.pages.FB_Login_page;
import com.reusable.Reuseble;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps extends Reuseble {

	public FB_Login_page l;

	@Given("to launch the browser")
	public void to_launch_the_browser() throws IOException {

		browser_launch();

	}

	@When("To enter the user name")
	public void to_enter_the_user_name() {

		l = new FB_Login_page(driver);

		enter_value(l.getUser_name(), "ragul123@gmail.com");

	}

	@When("To enter the password")
	public void to_enter_the_password() {

		enter_value(l.getPassword(), "1234567890");

	}

	@When("To click the login button")
	public void to_click_the_login_button() {

		to_Click(l.getLogin_Btn());

	}
	@Then("validate the next page")
	public void validate_the_next_page() {

	}

}
