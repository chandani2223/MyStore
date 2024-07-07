package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.registerAccount;
import com.PageObject.verifyAlreadyRegister;

public class verifyLogin extends BaseClass {

	@Test(priority = 2)
	public void verifylogin() {
		logger.info("Execute start of verifylogin method...");
		verifyAlreadyRegister var = new verifyAlreadyRegister(driver);
		var.ClickOnSignInLink();
		var.registerUName("jamana@gmail.com");
		var.registerPasswrd("jamana mirza");
		var.clickSubmitSignIn();
		
		//register user account
		registerAccount ra = new registerAccount(driver);
		String unamed = ra.registerUserName();
		System.out.println("Registered UserName : "+ unamed);
		
		Assert.assertEquals(ra.registerUserName(), unamed);
		
		if(unamed!=null) {
			Assert.assertTrue(true, unamed);
		}else {
			Assert.assertFalse(false);
		}
		
		
	}
}
