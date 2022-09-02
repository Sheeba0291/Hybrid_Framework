package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}
	
	public ViewLeadPage verifyCompanyName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_companyName_sp"), data);
		reportStep(data+" is matching with company name", "pass");
		return this;
	}
	
	public UpdateLeadPage clickEditButton()
	{
		click(locateElement(Locators.XPATH, "//a[text()='Edit']"));
		reportStep("Edit Button is clicked", "pass");
		return new UpdateLeadPage();
	}
	
	public MyLeadsPage clickDeleteButton()
	{
		click(locateElement(Locators.XPATH, "//a[text()='Delete']"));
		reportStep("Delete Button is clicked", "pass");
		return new MyLeadsPage();
	}
	
	public CreateLeadPage clickDuplicateLeadButton()
	{
		click(locateElement(Locators.XPATH, "//a[text()='Duplicate Lead']"));
		reportStep("Duplicate Lead Button is clicked", "pass");
		return new CreateLeadPage();
	}
	
	public ViewLeadPage verifyPageTitle()
	{
		verifyTitle("View Lead | opentaps CRM");
		return this;
	}
	
	
	
}
