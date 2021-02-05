package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.BaseClass;



public class ITestListenersClass extends BaseClass implements ITestListener{
	@Override		
    public void onFinish(ITestContext arg0) {
		String methodName = arg0.getName().toString().trim();
        System.out.println("***********"+methodName+" Test case has been finished**********");
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub
    	String methodName = arg0.getName().toString().trim();
    	System.out.println("***********"+methodName+" Test Case has been started***********");
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	String methodName = arg0.getName().toString().trim();
        System.out.println("*********"+methodName+" Test Case Failed but is within success percentage********");		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	String methodName = arg0.getName().toString().trim();
    	System.out.println("***********"+methodName+" Test Case Failed*********");
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	String methodName = arg0.getName().toString().trim();
    	System.out.println("************"+methodName+" Test Case is Skipped*********");
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	String methodName = arg0.getName().toString().trim();
        	System.out.println("*********"+methodName+" Execution has been started************");
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	String methodName = arg0.getName().toString().trim();
        	System.out.println("***********"+ methodName+" has been passed*************");	
    }		
}
