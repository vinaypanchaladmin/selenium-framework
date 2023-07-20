package com.sample.Maven2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(comutil.Customlistener.class)
public class Base2test extends Base2 {


   public  WebDriver driver ;


	

     
    @Test
    public void login() throws IOException {
   
    Base2 b =new Base2();
		
	   b.launch();
	   
	    b.enterusername("standard_user");
	    b.enterpassword("secret_sauce");
	    b.loginbutton();
	    this.driver =Base2.driver;
	    String item =driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
	    String actual = "hello";
	     if(item.equals(actual)) {
	    	 Assert.assertTrue(true);
	     }
	     else {
	  this.driver = Base2.driver;
	    b.takeshot(driver, "login");
	    Assert.assertTrue(false);
	       
	     }
    }
    
	   
	     
		}
	

