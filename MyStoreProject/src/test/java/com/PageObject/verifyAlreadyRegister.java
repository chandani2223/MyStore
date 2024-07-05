package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyAlreadyRegister {

	WebDriver driver;
	
	public verifyAlreadyRegister(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Sign in")
	WebElement signIn;

	@FindBy(id = "email")
	WebElement reUname;
	
	@FindBy(id = "passwd")
	WebElement rePass;
	
	@FindBy(id = "SubmitLogin")
	WebElement SubmitSignInButton;
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement userNamed;
	
	public void ClickOnSignInLink() {
		signIn.click();
	}
	
	public void registerUName(String rename) {
		reUname.sendKeys(rename);
	}
	
	public void registerPasswrd(String repass) {
		rePass.sendKeys(repass);
	}
	
	public void clickSubmitSignIn() {
		SubmitSignInButton.click();
	}
}
