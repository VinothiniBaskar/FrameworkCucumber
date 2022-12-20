package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{
	
	@Then("HomPage should be displayed")
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//a[contains(text(),'CRM/SFA')]"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	@Given("Click CRMSFA link")
	public MyHomePage clickCrmsfaLink() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		reportStep("CRM/SFA link is clicked", "pass");
		return new MyHomePage();
	}
	
	
}
