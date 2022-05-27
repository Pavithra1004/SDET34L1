package com.Sdet32l1.GenricScript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
 * This class contains the method to retry the testscript if it is failed due to the 
 * synchronnization or network issue
 * @author anand
 *
 */
public class RetryAnalyserImplementation implements IRetryAnalyzer{
	int count=0;
	int maxRetry=4;
	@Override
	public boolean retry(ITestResult result) {
		while(count<maxRetry) {
			count++;
			return true;
		}
		return false;
	}
}