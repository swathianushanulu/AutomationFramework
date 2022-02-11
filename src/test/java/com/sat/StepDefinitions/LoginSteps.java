package com.sat.StepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.sat.Pages.LoginPage;
import com.sat.config.ConfigFileReader;
import com.sat.testbase.TestBase;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginSteps {
	
	private LoginPage loginpage = new LoginPage(TestBase.getDriver());
	private Properties prop;
	private ConfigFileReader config;
	@Given("User navigates to CRM login page")
	public void user_navigates_to_CRM_login_page() {
		TestBase.getDriver().get(config.getApplicationUrl());
		
	  
	}
	//@And ("Verify title of login page")
	

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String userid) {
		loginpage.enteruserid(userid);
	   
	}

	@And("Click on Next button")
	public void click_on_Next_button() {
		loginpage.clickonNext();

	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String pwd) {
		loginpage.enterpassword(pwd);
	    
	}

	@And("click on signin")
	public void clicks_on_signin() {
		loginpage.clickonsignin();
	    
	}
	
	@And("Click on yes")
	public void click_on_yes() {
		loginpage.clickonYes();
	    
	}


	@Then("user is navigated to {string} page")
	public void user_is_navigated_to_page(String exceptedtitle) {
		String title = loginpage.GetLoginPageTitle();
		Assert.assertTrue(title.contains(exceptedtitle));
  
				
	}
	
	@Then("user selects App {string}")
	public void user_selects_App(String appname) {
		loginpage.GetApp(appname);
	}
	}
	    
	



