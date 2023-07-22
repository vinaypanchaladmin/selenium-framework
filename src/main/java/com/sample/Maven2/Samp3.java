package com.sample.Maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Samp3 {
	
	@Parameters("browser")
	@Test
	public void launch(String browser) {
		switch(browser.toLowerCase())
		{
		case "chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver extractfils\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
		}

}
}