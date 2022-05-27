package com.PracticeTest;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticeTest1 extends PracticeTest {
	@BeforeSuite
	public void beforeSuite3()
	{
		Reporter.log("BeforeSuite3",true);
	}
@Test(groups = "sanity")
public void test8()
{
	Reporter.log("Test8",true);
}
@Test(groups = {"sanity","regression"})
public void test9()
{
	Reporter.log("Test9",true);
}
@Test(groups = "sanity")
public void test10()
{
	Reporter.log("Test10",true);
}
@Test(groups = {"sanity","regression"})
public void test11()
{
	Reporter.log("Test11",true);
}
@AfterSuite(groups = "regression")
public void afterSuite() {
	Reporter.log("afterSuite2",true);
}
}
