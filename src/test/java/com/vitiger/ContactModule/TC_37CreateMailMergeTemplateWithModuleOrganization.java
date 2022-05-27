package com.vitiger.ContactModule;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreateMailMergeWithTemplatePage;

public class TC_37CreateMailMergeTemplateWithModuleOrganization extends BaseClass {
	@Test
	public void tc_37CreateMailMergeTemplateWithModuleOrganization()
	{
		ContactsPage contactsPage=new ContactsPage(driver);
		CreateMailMergeWithTemplatePage createMailMergeWithTemplatePage=new CreateMailMergeWithTemplatePage(driver);
		homePage.clickContacts();
		contactsPage.clickMailMergetemplatesLink();
		createMailMergeWithTemplatePage.selectModuleDropdown("Contacts", webDriverMethods);
		createMailMergeWithTemplatePage.saveButton();
		webDriverMethods.allertaccept(driver);
		
	}
}
