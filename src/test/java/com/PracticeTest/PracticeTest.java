package com.PracticeTest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTest {
	@BeforeSuite(groups = "Baseclass")
	public void beforeSuite() {
		Reporter.log("beforeSuite1",true);
	}
	@BeforeSuite(groups = "Baseclass")
	public void beforeSuite1() {
		Reporter.log("beforeSuite2",true);
	}
	@AfterSuite(groups = "Baseclass")
	public void afterSuite() {
		Reporter.log("afterSuite1",true);
	}
	@BeforeTest(groups = "Baseclass")
	public void beforeTest()
	{
		Reporter.log("beforeTest1",true);
	}
	@AfterTest(groups = "Baseclass")
	public void afterTest()
	{
		Reporter.log("afterTest1", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Test2", true);
	}
	@Test(groups = "Baseclass")
	public void test3()
	{
		Reporter.log("Test3", true);
	}
	@Test
	public void test1()
	{
		Reporter.log("Test1", true);
	}
	@BeforeClass(groups = "Baseclass")
	public void beforeClass1()
	{
		Reporter.log("beforeClass1", true);
	}
	@BeforeClass(groups = "Baseclass")
	public void beforeClass2()
	{
		Reporter.log("beforeClass2", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("afterclass1", false);
	}
	@BeforeMethod(groups = "Baseclass")
	public void beforeMethod1()
	{
		Reporter.log("beforeMethod1", true);
	}
	@BeforeMethod(groups = "Baseclass")
	public void beforeMethod2()
	{
		Reporter.log("beforeMethod2", true);
	}
	@AfterMethod(groups = "Baseclass")
	public void afterMethod1()
	{
		Reporter.log("afterMethod1", true);
	}
}
