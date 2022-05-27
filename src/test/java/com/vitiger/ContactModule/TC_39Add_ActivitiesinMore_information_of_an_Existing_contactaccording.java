package com.vitiger.ContactModule;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactInformationPage;
import com.Vitiger.ObjectRepository.ContactMoreInformationPage;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreatingEventPage;

public class TC_39Add_ActivitiesinMore_information_of_an_Existing_contactaccording  extends BaseClass{

@Test
public void tc_39Add_ActivitiesinMore_information_of_an_Existing_contactaccording()
{
	String event_Name=ExcelMethods.getDataFromExcel("Contact",2 , 5);
	ContactsPage contactsPage=new ContactsPage(driver);
	ContactInformationPage contactInformationPage=new ContactInformationPage(driver);
	ContactMoreInformationPage contactMoreInformationPage=new ContactMoreInformationPage(driver);
	CreatingEventPage creatingEventPage=new CreatingEventPage(driver);
	homePage.clickContacts();
	contactsPage.clickExistingRecord(driver);
	contactInformationPage.clickMorelink(driver, webDriverMethods);
	contactInformationPage.clickActivitieslink();
	contactMoreInformationPage.clickAddEventBtm();
	creatingEventPage.enterEventNameTxt(event_Name);
	creatingEventPage.selectStartDate();
	creatingEventPage.enterStartDate();
	creatingEventPage.selectEndDate();
	creatingEventPage.enterEndDate();
	creatingEventPage.clickSaveBtn();
}
}

