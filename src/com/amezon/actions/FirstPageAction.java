/**
 * 
 * @author priya.tuptewar
 */

package com.amezon.actions;

import com.amezon.data.LoginData;
import com.amezon.uirepo.LoginPage;
import com.amezon.utility.BaseUtilityAmezon;

public class FirstPageAction extends BaseUtilityAmezon {
	
	
	
	public void lauchSite()
	{
		driver.get(LoginData.URL);
	}
	
	
	
	public boolean veriyTitle()
	{
	   if(driver.getTitle().equals(LoginData.LOGTITLE))
		{
		System.out.println("The page title is matching");
		return true;
		
	      }
	   else
	   {
		   System.out.println("The page title is not maching");
		   return false;
	   }
       }
	
	public void signprofile()
	{
		driver.findElement(LoginPage.profileLogin).click();
		driver.findElement(LoginPage.EMAIL_ID).sendKeys("pavan.tuptewar7@gmail.com");
		driver.findElement(LoginPage.PWD).sendKeys("123abcxyz");
		driver.findElement(LoginPage.SUBCLICK).submit();
	}
}