package com.TestCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.PageObject.searchProductPage;

import junit.framework.Assert;

public class searchProduct extends BaseClass {

	@Test(priority = 3)
	public void serachProducts() {
		
		searchProductPage sp = new searchProductPage(driver);
		sp.ClickOnSignInLink();
		sp.registerUName("sidhhi@gmail.com");
		sp.registerPasswrd("sidhhi mirza");
		sp.clickSubmitSignIn();
		sp.entervalueInsearchBar("T-shirts");
		sp.clickOnsearchBar();
		
		String findSearch = sp.foundsearhbar();
		System.out.println("Search List : " +findSearch);
		
		Assert.assertEquals(findSearch, sp.foundsearhbar());
		
		if(findSearch!=null) {
			Assert.assertTrue(findSearch, true);
		}else {
			Assert.assertFalse(false);
		}
	}
}
