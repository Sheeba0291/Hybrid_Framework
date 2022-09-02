package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLeadLink() {
		click(locateElement(Locators.LINK_TEXT, "Create Lead"));
		reportStep("Create Lead link is clicked", "pass");
		return new CreateLeadPage();
	}

	public FindLeadsPage clickFindLeads()
	{
		click(locateElement(Locators.XPATH,"//a[text()='Find Leads']"));
		reportStep("Find Leads is clicked", "pass");
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickMergeLeads()
	{
		click(locateElement(Locators.XPATH,"//a[text()='Merge Leads']"));
		reportStep("Merge Leads is clicked", "pass");
		return new MergeLeadsPage();
	}
}
