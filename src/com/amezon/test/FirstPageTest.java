package com.amezon.test;

import org.testng.annotations.Test;

import com.amezon.utility.BaseUtilityAmezon;

public class FirstPageTest extends BaseUtilityAmezon {
  
	@Test(enabled = false)
  public void testVerifyTitle() {
		action1.lauchSite();
		action1.veriyTitle();
		System.out.println("The Fisrt Test Has been passed");
		action1.signprofile();
	   System.out.println("profile siged in sucessfully");
  }

 
}
