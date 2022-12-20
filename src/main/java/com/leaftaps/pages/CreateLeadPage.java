package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods{
	
//	And Enter the Company name as <companyname>
//	And Enter the First name as <firstname>
//	And Enter the Last name as <lastname>
//	When Click create lead button
	@When("Enter the companyName as (.*)$")
	public CreateLeadPage enterCompanyName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@id='createLeadForm_companyName']"),data );
		reportStep(data+" company name is entered successfully","pass");
		return this;
	}
	@And("Enter the firstName as (.*)$")
	public CreateLeadPage enterFirstName(String data) {
		clearAndType(locateElement(Locators.ID, "createLeadForm_firstName"), data);
		reportStep(data+" first name is entered successfully","pass");
		return this;
	}
	@And("Enter the LastName as (.*)$")
	public CreateLeadPage enterLastName(String data) {
		clearAndType(locateElement(Locators.ID, "createLeadForm_lastName"),data);
		reportStep(data+" last name is entered successfully","pass");
		return this;
	}
	@And("Click on the CreateLeads Button")
	public ViewLeadPage clickCreateLeadButton() {
		click(locateElement(Locators.NAME, "submitButton"));
		reportStep("Create Lead button is clicked successfully", "pass");
		return new ViewLeadPage();
	}

}
