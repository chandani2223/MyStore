package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerAccount {

	WebDriver driver;

	public registerAccount(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement registerUser;
	
	public String registerUserName() {
		String registerName = registerUser.getText();
		return registerName;
	}
}
