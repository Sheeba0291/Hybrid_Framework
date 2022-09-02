package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC004_DeleteLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		
		testcaseName = "Delete Lead";
		testDescription ="Delete the selected Lead";
		authors="Sheeba";
		category ="Sanity";
		excelFileName="DeleteLead";

	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String phoneNumber, String deletionMessage) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.captureLeadID()
		.clickFirstResult()
		.clickDeleteButton()
		.clickFindLeads()
		.enterCapturedLeadID()
		.clickFindLeadsButton()
		.verifyDeletionMessage(deletionMessage);

	}

}
