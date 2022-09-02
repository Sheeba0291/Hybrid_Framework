package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class UpdateLeadPage extends ProjectSpecificMethods{

	public UpdateLeadPage updateCompanyName(String data)
	{
		clearAndType(locateElement(Locators.ID, "updateLeadForm_companyName"), data);
		reportStep(data+ " is entered", "pass");
		return this;

	}

	public ViewLeadPage clickUpdate()
	{
		click(locateElement(Locators.XPATH, "//input[@value='Update']"));
		reportStep("Update button is clicked successfully", "pass");
		return new ViewLeadPage();
	}


}
