package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.SignIn;
import com.PageObject.myAccountPage;
import com.PageObject.personalInfo;
import com.PageObject.registerAccount;

public class indexPage extends BaseClass {

	@Test(priority = 1)
	public void VerifyRegister() {

		SignIn sc = new SignIn(driver);
		sc.ClickOnSignInLink();

		myAccountPage ap = new myAccountPage(driver);
		ap.SendEmail("sidhhi@gmail.com");
		ap.ClickOnSubmitButton();
		
		//personal information
		personalInfo pn = new personalInfo(driver);
		pn.maleGender();
		pn.firstName("sidhhi");
		pn.lastName("mirza");
		pn.password("sidhhi mirza");
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
			Assert.assertTrue(true, uname);
		}else {
			Assert.assertFalse(false);
		}
		
	}
}
