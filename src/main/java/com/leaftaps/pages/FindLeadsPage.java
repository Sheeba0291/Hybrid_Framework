package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{

	public static String leadID = "";

	public FindLeadsPage enterFirstName(String data)
	{
		clearAndType(locateElement(Locators.XPATH,"(//input[@name='firstName'])[3]"),data);
		reportStep(data+ " is entered", "pass");
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
		click(locateElement(Locators.XPATH, "//button[text()='Find Leads']"));
		reportStep("Find Leads Button is clicked", "pass");
		Thread.sleep(5000);
		return this;
	}

	public ViewLeadPage clickFirstResult()
	{
		click(locateElement(Locators.XPATH, "//table[@class='x-grid3-row-table']//a[1]"));
		reportStep("First Resulting Lead is clicked", "pass");
		return new ViewLeadPage();
	}

	public FindLeadsPage clickPhoneTab()
	{
		click(locateElement(Locators.XPATH, "//span[text()='Phone']"));
		reportStep("Phone tab is Selected", "pass");
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String data)
	{
		clearAndType(locateElement(Locators.XPATH,"//input[@name='phoneNumber']"),data);
		reportStep( data+" is entered", "pass");
		return this;
	}

	public FindLeadsPage captureLeadID()
	{
		leadID = getElementText(locateElement(Locators.XPATH,"(//table[@class='x-grid3-row-table']//a)[1]"));
		//leadID = leadID.replaceAll("[a-zA-Z()\\s]", "");
		leadID = replaceExpression(leadID, "[a-zA-Z()\\s]", "");
		System.out.println("Lead ID "+leadID+" is Captured.");
		return this;
	}

	public FindLeadsPage enterCapturedLeadID()
	{
		clearAndType(locateElement(Locators.XPATH,"//input[@name='id']"),leadID);
		reportStep( leadID+" is entered", "pass");
		return this;
	}

	/*
	 * Verify message "No records to display" in the Lead List. 
	 * This message confirms the successful deletion
	 */
	public FindLeadsPage verifyDeletionMessage(String data)
	{
		verifyExactText(locateElement(Locators.XPATH,"//div[contains(text(),'No records to display')]"), data);
		reportStep("Deletion message is verified", "pass");
		return this;
	}
	
	public MergeLeadsPage clickFirstResultAndSwitch()
	{
		click(locateElement(Locators.XPATH, "//table[@class='x-grid3-row-table']//a[1]"));
		reportStep("First Resulting Lead is clicked", "pass");
		switchToWindow(0);
		return new MergeLeadsPage();	
	}
	
	public MergeLeadsPage clickSecondResultAndSwitch()
	{
		click(locateElement(Locators.XPATH, "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[2]//a"));
		reportStep("Second Resulting Lead is clicked", "pass");
		switchToWindow(0);
		return new MergeLeadsPage();
	}

}
