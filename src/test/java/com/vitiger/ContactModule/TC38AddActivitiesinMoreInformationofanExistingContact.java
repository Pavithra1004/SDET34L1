package com.vitiger.ContactModule;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.ContactInformationPage;
import com.Vitiger.ObjectRepository.ContactMoreInformationPage;
import com.Vitiger.ObjectRepository.ContactsPage;
import com.Vitiger.ObjectRepository.CreatingToDoPage;

public class TC38AddActivitiesinMoreInformationofanExistingContact  extends BaseClass{
	@Test
	public void tc38AddActivitiesinMoreInformationofanExistingContact()
	{
		String To_Do=ExcelMethods.getDataFromExcel("Contact",2 , 4);
		ContactsPage contactsPage=new ContactsPage(driver);
		ContactInformationPage contactInformationPage=new ContactInformationPage(driver);
		ContactMoreInformationPage contactMoreInformationPage=new ContactMoreInformationPage(driver);
		CreatingToDoPage creatingToDoPage=new CreatingToDoPage(driver);
		homePage.clickContacts();
		contactsPage.clickExistingRecord(driver);
		contactInformationPage.clickMorelink(driver, webDriverMethods);
		contactInformationPage.clickActivitieslink();
		contactMoreInformationPage.clickToDoBtm();
		creatingToDoPage.enterToDoTxt(To_Do);
		creatingToDoPage.clickSubmitBtn();	
}
}
