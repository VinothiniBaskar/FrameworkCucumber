package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyHomePage extends ProjectSpecificMethods{
	@And("Click Leads Button")
	public MyLeadsPage clickLeadsLink() {
		click(locateElement(Locators.LINK_TEXT, "Leads"));
		reportStep("Leads link is clicked", "pass");
		return new MyLeadsPage();
	}

}
