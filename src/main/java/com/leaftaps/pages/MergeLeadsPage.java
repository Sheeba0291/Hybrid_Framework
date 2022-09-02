package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods{

	public FindLeadsPage clickOnFromLead()
	{
		click(locateElement(Locators.XPATH, "//table[@id='widget_ComboBox_partyIdFrom']/following::a/img"));
		reportStep("From Lead is clicked", "pass");
		switchToWindow(1);
		return new FindLeadsPage();
	}

	public FindLeadsPage clickOnToLead()
	{
		click(locateElement(Locators.XPATH, "(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[2]"));
		reportStep("To Lead is clicked", "pass");
		switchToWindow(1);
		return new FindLeadsPage();
	}

	public ViewLeadPage clickMergeButton()
	{
		click(locateElement(Locators.XPATH, "//a[text()='Merge']"));
		reportStep("Merge Lead Button is clicked", "pass");
		switchToAlert();
		acceptAlert();
		return new ViewLeadPage();

	}




}
