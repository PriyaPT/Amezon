package com.amezon.uirepo;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By image = new By.ByXPath("");
	public static By profileLogin = new By.ByCssSelector("a#nav-link-yourAccount>span.nav-line-1");
    
	public static By EMAIL_ID = new By.ByXPath(".//input[@id='ap_email']");
    public static By PWD = new By.ByXPath("//*[@id='ap_password']");
    public static By SUBCLICK = new By.ByXPath("//*[@id='signInSubmit']");
}
