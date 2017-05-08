/**
 *  @author Priyav Tuptewar
 *  This is the base class of Amezon application.
 */


package com.amezon.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.amezon.actions.FirstPageAction;
import com.amezon.actions.TryPrimeAction;

public class BaseUtilityAmezon {
	//The object of first page action class created
	public static FirstPageAction action1 = new FirstPageAction();
	
	public static TryPrimeAction action2 = new TryPrimeAction();
	
	// The is the instance of driver
	public static WebDriver driver;
	
	// this is the instance of WebDriverwait
	public static WebDriverWait wait;
	
	//this is the instance of action
	public static Actions action;

    @Parameters({"BrowseType"})
	@BeforeTest
	public void SelectBrowser(String BrowseType)
	{
		
		switch(BrowseType)
		{
		case "ff":
			driver = new FirefoxDriver();
			WebElement elemnt=  driver.findElement(By.xpath(""));
			e.manage().window().maximize();
			wait = new WebDriverWait(driver, 20);
			action = new Actions(driver);
		    break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 20);
			action = new Actions(driver);
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
			wait = new WebDriverWait(driver, 20);
			action = new Actions(driver);
			break;
		
		}
	}

    
    /*@AfterTest
    public void tearDown()
    {
    	driver.close();
    	driver.quit();
    }*/
}
