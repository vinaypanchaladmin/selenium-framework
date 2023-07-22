package com.sample.Maven2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Base4test extends Base4 {
	@Test
	public void addresult() throws IOException {
	Base4 b =new Base4();
	
	driver.get("https://www.saucedemo.com");
	  b.enterusername("standard_user");
	    b.enterpassword("secret_sauce");
	    b.loginbutton();
	    b.addToCart();
	    String expect = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).getText();
		  String actual ="Remove";
		  if(expect.equals(actual)) {
		  Assert.assertTrue(true);
		  }
		  else {
		
			  b.shot(driver, "addresult");
		  }
	
	
	
	}
}
