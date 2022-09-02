package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC005_DuplicateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		
		testcaseName = "Duplicate Lead";
		testDescription ="Duplicate the selected Lead";
		authors="Sheeba";
		category ="Smoke";
		excelFileName="DuplicateLead";

	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String firstName) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeads()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickDuplicateLeadButton()
		.clickCreateLeadButton()
		.verifyFirstName(firstName);
		
	}

}
