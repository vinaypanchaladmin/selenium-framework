package com.sample.Maven2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basetest  {

  WebDriver driver ;
	
	
	
	@Test
	public void login() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver extractfils\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    Base b =new Base(driver);
   
    driver.get("https://www.saucedemo.com");
  
    b.enterusername("standard_user");
    b.enterpassword("secret_sauce");
    b.loginbutton();
    String item =driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
    String actual = "hello";
     if(item.equals(actual)) {
    	 Assert.assertTrue(true);
     }
     else {
    	 b.takeshot(driver, "login");
    	 Assert.assertTrue(false);
     }
	}
}