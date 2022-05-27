package com.DocumentsTest;

import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.BaseClass;
import com.Sdet32l1.GenricScript.ExcelMethods;
import com.Vitiger.ObjectRepository.CreatingNewDocumentPage;
import com.Vitiger.ObjectRepository.DocumentInformationPage;

public class CreateDocumentTest extends BaseClass {
	CreatingNewDocumentPage documentPage;
	DocumentInformationPage documentInformationPage;
	String documentTitle;
	String documentDescription;
	String documentPath;
	@Test(groups = "regression")
	public void createDocumentTest()
	{
		documentTitle = ExcelMethods.getDataFromExcel("Document",2,1)+randNumber;
		documentDescription =  ExcelMethods.getDataFromExcel("Document",2,2);
		documentPath =  ExcelMethods.getDataFromExcel("Document",2,3);

		documentPage=new CreatingNewDocumentPage(driver);
		documentInformationPage=new DocumentInformationPage(driver);
		homePage.clickDocuments(driver);
		documentPage.clickDocumentImg();
		documentPage.clickDocumentIitle(documentTitle);
		documentPage.switchToFrame(driver,webDriverMethods);
		documentPage.documentDescriptionTxt(documentDescription, driver);
		webDriverMethods.switchBackHome(driver);
		documentPage.italicBoldClick();
		documentPage.fileNameTxt(documentPath);
		documentPage.saveBtn();
		javaMethods.assertThroughIfconditionContains(documentInformationPage.createDocumentInfo(), documentTitle, "Document ");
	}

}
