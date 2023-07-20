package com.sample.Maven2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 {
	
	public static WebDriver driver ;
	
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver extractfils\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	    this.driver= driver ;
	}
	
	public void takeshot(WebDriver driver,String testname) throws IOException {
	
		File f= ((TakesScreenshot)Base2.driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshot\\"+testname+".png");
		
		FileUtils.copyFile(f, destination);
	}
	
	

	By username =By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.name("login-button");
	
	
	public void enterusername(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void enterpassword(String userpassword) {
		driver.findElement(password).sendKeys(userpassword);
	}
	
	public void loginbutton() {
		driver.findElement(loginbtn).click();
	}
	
	
	By cart =By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	public void addToCart() {
		driver.findElement(cart).click();
	}
	
	
	
	
	
	
	
	
	
}
