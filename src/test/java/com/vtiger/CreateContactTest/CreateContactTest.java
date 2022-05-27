package com.vtiger.CreateContactTest;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactInformationPage;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreateContactPage;
import com.Vitiger.ObjectRepository.HomePage;

public class CreateContactTest  extends BaseClass
{		@Test(groups = "sanity")
	public void createContactTest() {
	String LastName=ExcelMethods.getDataFromExcel("Contact",2 , 1)+randNumber;
	HomePage hp=new HomePage(driver);
	ContactsPage contactsPage=new ContactsPage(driver);
	CreateContactPage createContactPage=new CreateContactPage(driver);
	ContactInformationPage contactInformationPage=new ContactInformationPage(driver);
	hp.clickContacts();
	contactsPage.clickContactImg();
	createContactPage.enterLastName(LastName);
	contactsPage.saveButton();
	javaMethods.assertThroughIfconditionContains(contactInformationPage.contactInfo(), LastName, "Contacts ");
}

}
