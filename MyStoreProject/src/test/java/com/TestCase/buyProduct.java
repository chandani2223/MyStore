package com.TestCase;

import org.testng.annotations.Test;

import com.PageObject.buyProductPage;

public class buyProduct extends BaseClass{
	
	
	@Test(priority = 4)
	public void BuyProduct() {
		logger.info("Execute start of BuyProduct method...");

		buyProductPage bpp = new buyProductPage(driver);
		bpp.hoverWomen();
		bpp.clickonsubMenuT_shirt();
		bpp.hoveronProduct();
		bpp.clickonmorebutton();
		bpp.selectSize("L");
		bpp.clickonquantity();
		bpp.clickoncolor();
	}
	

}
