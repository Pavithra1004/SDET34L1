package com.vtiger.CreateContactTest;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactInformationPage;
import com.Vitiger.ObjectRepository.ContactWithOrganizationPage;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreateContactPage;
import com.Vitiger.ObjectRepository.CreateOrganizationPage;
import com.Vitiger.ObjectRepository.CreatingNewOrganizationPage;
import com.Vitiger.ObjectRepository.OrganizationInformationPage;

public class CreateContactWithOrganization extends BaseClass {
	@Test(groups = {"sanity","regression"})
	public void createContactWithOrganization() throws InterruptedException
	{
		CreatingNewOrganizationPage creatingNewOrganizationPage=new CreatingNewOrganizationPage(driver);
		ContactInformationPage contactInformationPage=new ContactInformationPage(driver);
		String organizationName = ExcelMethods.getDataFromExcel("Organization", 2, 1)+randNumber;
		String LastName=ExcelMethods.getDataFromExcel("Contact",2 , 1)+randNumber;
		CreateContactPage createContactPage=new CreateContactPage(driver);
		CreateOrganizationPage createOrganizationPage=new  CreateOrganizationPage(driver);
		ContactsPage contactsPage=new ContactsPage(driver);
		ContactWithOrganizationPage contactWithOrganization=new ContactWithOrganizationPage(driver);
		OrganizationInformationPage organizationInformationPage=new OrganizationInformationPage(driver);
		
		homePage.clickOrganizations(driver);
		creatingNewOrganizationPage.clickCreateOrganization();
		createOrganizationPage.enterOrganizationName(organizationName);
		createOrganizationPage.saveButton();
		javaMethods.assertThroughIfconditionContains(organizationInformationPage.createOrganizationInfo(), organizationName, "Organization");
		homePage.clickContacts();
		contactsPage.clickContactImg();
		createContactPage.enterLastName(LastName);
		createContactPage.clickOrganizationImg();
		contactWithOrganization.selectOrganizationName(driver, organizationName, webDriverMethods);
		webDriverMethods.switchToWindowOnTitle(driver, "Contacts");
		contactsPage.saveButton();
		javaMethods.assertThroughIfconditionContains(contactInformationPage.contactInfo(), LastName, "Contacts ");
	}
}
