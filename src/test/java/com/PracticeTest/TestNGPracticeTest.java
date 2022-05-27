package com.PracticeTest;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Sdet32l1.GenricScript.ExcelMethods;import com.Sdet32l1.GenricScript.IConstantsPath;

public class TestNGPracticeTest {
	@Test(dataProvider="loginData")
	public void practiceTest(String userName,String password)
	{
		Reporter.log(userName+" ----> "+password,true);
	}
	@DataProvider
	public Object[][] loginData() throws IOException
	{
		ExcelMethods.openExcel(IConstantsPath.EXCELPATH);
		return ExcelMethods.getMultipleDataFromExcelToString("LoginData");
	}
}
