package com.vitiger.ContactModule;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreateMailMergeWithTemplatePage;

public class TC_36CreateMailMergeTemplateWithModuleContact extends BaseClass {
	@Test
	public void tc_36CreateMailMergeTemplateWithModuleContact()
	{
		String template_File=ExcelMethods.getDataFromExcel("Contact",2 , 3);
		ContactsPage contactsPage=new ContactsPage(driver);
		CreateMailMergeWithTemplatePage createMailMergeWithTemplatePage=new CreateMailMergeWithTemplatePage(driver);
		homePage.clickContacts();
		contactsPage.clickMailMergetemplatesLink();
		createMailMergeWithTemplatePage.selectTemplateFile(template_File);
		createMailMergeWithTemplatePage.selectModuleDropdown("Contacts", webDriverMethods);
		createMailMergeWithTemplatePage.saveButton();
	}
}
