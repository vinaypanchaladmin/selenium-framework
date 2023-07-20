package com.sample.Maven2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Base3test extends Base2{
	@Test
	public void addcart() throws IOException {
		Base2 b= new Base2();
		b.launch();
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
			  b.takeshot(driver, "addcart");
		  }
		  
	}

}
