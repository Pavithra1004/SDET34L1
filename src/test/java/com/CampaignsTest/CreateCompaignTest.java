
package com.CampaignsTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreateCampaignsInformationPage;
import com.Vitiger.ObjectRepository.CreateCampaignsPage;
import com.Vitiger.ObjectRepository.CreatingNewCampaignPage;

public class CreateCompaignTest extends BaseClass {

	String campaignsName;
	CreatingNewCampaignPage creatingNewCampaignPage;
	CreateCampaignsPage createCampaignsPage;
	CreateCampaignsInformationPage createCampaignsInformationPage;

	@Test(groups = "sanity")
	public void createCompaignTest() throws InterruptedException
	{
		creatingNewCampaignPage=new CreatingNewCampaignPage(driver);
		createCampaignsPage=new CreateCampaignsPage(driver);
		createCampaignsInformationPage=new CreateCampaignsInformationPage(driver);
		campaignsName=ExcelMethods.getDataFromExcel("Campaign",2 , 1)+randNumber;
		homePage.clickCampaign(driver,webDriverMethods);
		Thread.sleep(3000);
		creatingNewCampaignPage.clickCreateCampaign(driver,webDriverMethods);
		createCampaignsPage.createCampgaignName(driver, campaignsName);
		createCampaignsPage.saveButton();
		javaMethods.assertThroughIfconditionContains(createCampaignsInformationPage.createCampgaignInfo(), campaignsName, "Campaigns  ");
	}
}