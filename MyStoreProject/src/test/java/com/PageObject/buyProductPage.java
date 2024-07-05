package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class buyProductPage{
	
	WebDriver driver;
	
	public buyProductPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul//li//a[@title='Women']")
	WebElement moveWomen;
	
	@FindBy(linkText = "T-shirts")
	WebElement submenuTshirt;
	
	@FindBy(xpath = "//ul//li//div[@class='product-container']")
	WebElement hoverOnProduct;
	
	@FindBy(xpath = "//div[@class='button-container']//a//span[text()='More']")
	WebElement clickmore;
	
	@FindBy(xpath = "//select[@id='group_1']")
	WebElement selectsize;
	
	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	WebElement quantity;
	
	@FindBy(xpath = "//a[@id='color_14']")
	WebElement color;
	
	public void hoverWomen() {
		Actions act = new Actions(driver);
		act.moveToElement(moveWomen).perform();
	}
	
	public void clickonsubMenuT_shirt() {
		submenuTshirt.click();
	}
	
	public void hoveronProduct() {
		Actions act = new Actions(driver);
		act.moveToElement(hoverOnProduct).perform();
	}
	
	public void clickonmorebutton() {
		clickmore.click();
	}
	
	public void selectSize(String size) {
		Select sc = new Select(selectsize);
		sc.selectByVisibleText(size);
	}
	
	public void clickonquantity() {
		quantity.click();
	}

	public void clickoncolor() {
		color.click();
	}
}
