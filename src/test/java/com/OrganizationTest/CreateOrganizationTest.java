package com.OrganizationTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreateOrganizationPage;
import com.Vitiger.ObjectRepository.CreatingNewOrganizationPage;
import com.Vitiger.ObjectRepository.OrganizationInformationPage;

public class CreateOrganizationTest extends BaseClass {
	OrganizationInformationPage organizationInformationPage;
	CreatingNewOrganizationPage creatingNewOrganizationPage;
	CreateOrganizationPage createOrganizationPage;
	String organizationName;
	@Test(groups = "sanity")
	public void createOrganizationTest() {
		organizationInformationPage=new OrganizationInformationPage(driver);
		organizationName=ExcelMethods.getDataFromExcel("Organization",2 , 1)+randNumber;
		
		creatingNewOrganizationPage=new CreatingNewOrganizationPage(driver);
		createOrganizationPage=new CreateOrganizationPage(driver);
		homePage.clickOrganizations(driver);
		creatingNewOrganizationPage.clickCreateOrganization();
		Assert.fail();
		createOrganizationPage.enterOrganizationName(organizationName);
		createOrganizationPage.saveButton();
		javaMethods.assertThroughIfconditionContains(organizationInformationPage.createOrganizationInfo(), organizationName, "Organization");

	}

}