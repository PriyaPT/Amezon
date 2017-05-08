package com.amezon.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amezon.uirepo.TryPrimeRepo;
import com.amezon.utility.BaseUtilityAmezon;

public class TryPrimeAction extends BaseUtilityAmezon {
	
  public void clickonprime()
  {
	/* WebElement  element =  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(TryPrimeRepo.prime)));
	//element.click();
	 action.moveToElement(element).moveToElement(driver.findElement(TryPrimeRepo.primeButton))
	 .click().build().perform();
	 //driver.findElement(TryPrimeRepo.primeButton).click();
     System.out.println(" Mouse hober performed");*/
	  
	 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(TryPrimeRepo.prime)));
	 action.moveToElement(ele).moveToElement(ele).click().build().perform();
  
  }
}
