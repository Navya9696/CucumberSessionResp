package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2_Testing {
  @Test
  public void Register() {
	 Assert.assertEquals(100, 100);
	 Assert.assertTrue(10>5);
	 Assert.assertFalse(5>10);
	 Assert.assertTrue("aravind".contains("aravind"));
	 Assert.assertTrue("Selenium".contains("Se"));
	 System.out.println("this is correct");
  }
  
  
}
