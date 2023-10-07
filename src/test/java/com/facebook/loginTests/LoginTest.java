package com.facebook.loginTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest {
	LoginPage loginpage;
	PropertiesReader propertiesReader;
	
	@BeforeMethod
	public void openFacebook() {
		openApp();
	}

	@Test
	public void loginTest() {
		propertiesReader = new PropertiesReader();
		loginpage = new LoginPage(driver);
		loginpage.userNameMethod(propertiesReader.getUserName());
		loginpage.passWordMethod(propertiesReader.getPassword());
		loginpage.logingButton();

	}
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApp();
	}
	

}
