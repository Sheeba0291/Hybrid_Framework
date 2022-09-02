package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC006_MergeLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Merge Lead";
		testDescription ="Merge the selected Leads";
		authors="Sheeba";
		category ="Sanity";
		excelFileName="MergeLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickMergeLeads()
		.clickOnFromLead()
		.clickFirstResultAndSwitch()
		.clickOnToLead()
		.clickSecondResultAndSwitch()
		.clickMergeButton()
		.verifyPageTitle();
	}

}
