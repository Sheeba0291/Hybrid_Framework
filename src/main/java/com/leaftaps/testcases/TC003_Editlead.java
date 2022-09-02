package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC003_Editlead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Edit Lead";
		testDescription ="Edit the Company Name";
		authors="Sheeba";
		category ="Sanity";
		excelFileName="EditLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String companyName, String firstName) throws InterruptedException {
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
		.clickEditButton()
		.updateCompanyName(companyName)
		.clickUpdate()
		.verifyCompanyName(companyName);

	}

}
