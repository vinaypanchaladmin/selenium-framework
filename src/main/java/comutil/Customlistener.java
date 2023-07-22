package comutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.sample.Maven2.Base;
import com.sample.Maven2.Base2;

public class Customlistener implements ITestListener {
	
	
	

	ExtentSparkReporter htmlreporter ;
    ExtentReports reports ;
    ExtentTest test ;
    
    //after this we have to initialize these variable and configure report for this we have to create a method
   
    
  
    public void startreport() {
    	
    	htmlreporter = new ExtentSparkReporter("ExtentReporterDemo.html");
    	reports = new ExtentReports();
    	//after initialize these two we have to attach htmlreporter with reports
    	
    	reports.attachReporter(htmlreporter);
    	
    	//add environment details
    	reports.setSystemInfo("Machine", "Local");
    	reports.setSystemInfo("OS", "Window10");
    	reports.setSystemInfo("Browser", "Chrome");
    	reports.setSystemInfo("QA", "Admin");
    	
    	//configuration to look and feel
    	htmlreporter.config().setDocumentTitle("Extent Report Demo");
    	htmlreporter.config().setReportName("Test Report");
    	htmlreporter.config().setTheme(Theme.DARK);

    	
       }
    

    
   	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("name of test method pass :"+ result.getName());
		test =reports.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("name of pass test :"+result.getName(),ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		

		System.out.println("name of test method fail :"+ result.getName());
		test =reports.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("name of fail test case is :"+result.getName(), ExtentColor.RED));
		
	
	  
		
		String screenpath =System.getProperty("user.dir")+"\\screenshot\\"+result.getName()+".png";
	       File shotfile= new File(screenpath);
	       if(shotfile.exists()) {
	    	   test.fail("capture screenshot is above :"+test.addScreenCaptureFromPath(screenpath));
	       }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		startreport();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test execution stop now");
		reports.flush();
		
	
	}

	 
}
