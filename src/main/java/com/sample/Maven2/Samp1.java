package com.sample.Maven2;

import org.testng.Assert;
import org.testng.annotations.Test;

import comutil.Customretry;
import comutil.Moreretry;
@Test(retryAnalyzer=Moreretry.class)
public class Samp1 {
	
	@Test(retryAnalyzer=Moreretry.class)
	public void m1() {
		System.out.println("m1 method");
	}
	
	@Test(retryAnalyzer=Moreretry.class)
	public void m2() {
		String a= "hello";
		String b= "welcome";
		Assert.assertEquals(a, b);
	}

}
