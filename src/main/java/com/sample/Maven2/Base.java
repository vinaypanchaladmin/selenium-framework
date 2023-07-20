package com.sample.Maven2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import comutil.Shot;

public class Base  {
	
	public  WebDriver driver ;
	
	public Base(WebDriver driver) {
		this.driver =driver ;
		
	}

	By username =By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.name("login-button");
	
public void takeshot(WebDriver driver,String testname) throws IOException {
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshot\\"+testname+".png");
		
		FileUtils.copyFile(f, destination);
	}
	
	
	public void enterusername(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void enterpassword(String userpassword) {
		driver.findElement(password).sendKeys(userpassword);
	}
	
	public void loginbutton() {
		driver.findElement(loginbtn).click();
	}
}
