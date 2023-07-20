package comutil;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Basicextent {
	
	//for this we first declare three variable as given below
	ExtentSparkReporter htmlreporter ;
    ExtentReports reports ;
    ExtentTest test ;
    
    //after this we have to initialize these variable and configure report for this we have to create a method
    @BeforeTest
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
    	htmlreporter.config().setTheme(Theme.STANDARD);

    	
       }
    
   }
