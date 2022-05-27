package com.vitiger.ContactModule;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactInformationPage;
import com.Vitiger.ObjectRepository.ContactMoreInformationPage;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreatingEventPage;
import com.Vitiger.ObjectRepository.HomePage;

public class TC_40Add_ActivitiesinMore_information_of_an_Existing_contactaccordingtoAddEventwithinvaliddate extends BaseClass {
	@Test
	public void tc_40Add_ActivitiesinMore_information_of_an_Existing_contactaccordingtoAddEventwithinvaliddate()
	{
		String event_Name=ExcelMethods.getDataFromExcel("Contact",2 , 5);
		HomePage homePage=new HomePage(driver);
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
		javaMethods.assertThroughIfcondition(webDriverMethods.getAlertText(driver), "Start Date & Time should be greater than or equal to Current date & time for Activities with status as Planned", "Allert msg displayed");
		webDriverMethods.allertaccept(driver);

	}
}
