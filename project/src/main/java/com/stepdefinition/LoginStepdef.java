package com.stepdefinition;



import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.loginpage.HeaderBar;
import com.loginpage.LoginPage;
import com.page.PageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {

	WebDriver driver;
	//PageObject poObject;
	LoginPage lPage;
	HeaderBar hBar;
	
	@Given("^User sholud enter URL$")
	public void user_sholud_enter_URL() throws Throwable {
	   
	    System.setProperty("webdrive.gecko.driver", "C:\\project\\chromedriver.exe");
	    driver= new FirefoxDriver();
	    driver.get("https://www.facebook.com/login.php/");
	}

	@Then("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	Assert.assertEquals("Log in to Facebook", driver.getTitle());
		
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		//poObject.loginToApplication("vishal kachave1", "22527100");
		lPage.loginApplication("vishal kachave1", "22527100");
		hBar=lPage.headerbar1();
	}

	@Then("^User should navigate profile page$")
	public void user_should_navigate_profile_page() throws Throwable {
		Assert.assertEquals("Facebook", driver.getTitle());
	}
}