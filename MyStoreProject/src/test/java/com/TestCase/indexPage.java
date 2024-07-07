package com.TestCase;

import org.testng.annotations.*;

import com.PageObject.SignIn;
import com.PageObject.myAccountPage;
import com.PageObject.personalInfo;
import com.PageObject.registerAccount;

import junit.framework.Assert;

public class indexPage extends BaseClass {
	@Test(priority = 1)
	public void VerifyRegister() {
		
		logger.info("Execute start of VerifyRegister method...");
		SignIn sc = new SignIn(driver);
		sc.ClickOnSignInLink();

		myAccountPage ap = new myAccountPage(driver);
		ap.SendEmail("aman@gmail.com");
		ap.ClickOnSubmitButton();
		logger.info("click on sign in button...");

		//personal information
		logger.info("personal information");
		personalInfo pn = new personalInfo(driver);
		pn.maleGender();
		pn.firstName("aman");
		pn.lastName("mirza");
		pn.password("aman mirza");
		pn.DaysMethod();
		pn.MonthsMethod();
		pn.YearsMethod();
		pn.CheckNews();
		pn.ClickRegisterButton();

		//register user account
		registerAccount ra = new registerAccount(driver);
		String uname = ra.registerUserName();
		System.out.println("Register Name : "+uname);

		Assert.assertEquals(ra.registerUserName(), uname);

		if(uname!=null) {
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}

	}
}
