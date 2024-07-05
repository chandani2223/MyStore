package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {

	WebDriver driver;

	public myAccountPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "email_create")
	WebElement sendmail;

	@FindBy(id = "SubmitCreate")
	WebElement submitButton;

	public void SendEmail(String email) {
		sendmail.sendKeys(email);
		System.out.println(sendmail.getText());
	}

	public void ClickOnSubmitButton() {
		submitButton.click();
	}

}
