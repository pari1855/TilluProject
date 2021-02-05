package Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Utility.BaseClass;

public class IRetryClass extends BaseClass implements IRetryAnalyzer{
	int count=0;
	int retryLimit = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(count<=retryLimit) {
		return true;
		}
		return false;
	}

}
