package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;

	public SignIn(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Sign in")
	WebElement signIn;

	public void ClickOnSignInLink() {
		signIn.click();
	}

}
