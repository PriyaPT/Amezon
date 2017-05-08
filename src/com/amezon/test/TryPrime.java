package com.amezon.test;

import org.testng.annotations.Test;

import com.amezon.utility.BaseUtilityAmezon;

public class TryPrime extends BaseUtilityAmezon {
	
	@Test
	public void verifyterms()
	{
		action1.lauchSite();
		action2.clickonprime();
		
	}

}
