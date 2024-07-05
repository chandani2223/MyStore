package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class personalInfo {

	WebDriver driver;
	
	public personalInfo(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "uniform-id_gender1")
	WebElement male;
	
	@FindBy(id = "uniform-id_gender2")
	WebElement female;
	
	@FindBy(id = "customer_firstname")
	WebElement fname;
	
	@FindBy(id = "customer_lastname")
	WebElement lname;
	
	@FindBy(id = "passwd")
	WebElement infopwd;
	
	@FindBy(id = "days")
	WebElement selectDay;
	
	@FindBy(id = "months")
	WebElement selectmonths;
	
	@FindBy(id = "years")
	WebElement selectyears;
	
	@FindBy(id = "newsletter")
	WebElement checkNews;
	
	@FindBy(id = "submitAccount")
	WebElement clickRegisterButton;
	
	public void maleGender() {
		male.click();
	}
	
	public void femaleGender() {
		female.click();
	}
	
	public void firstName(String fstname) {
		fname.sendKeys(fstname);
	}
	
	public void lastName(String lstname) {
		lname.sendKeys(lstname);
	}
	
	public void password(String pwd) {
		infopwd.sendKeys(pwd);
	}
	
	public void DaysMethod() {
		Select scday = new Select(selectDay);
		scday.selectByValue("4");
	}
	
	public void MonthsMethod() {
		Select scmonth = new Select(selectmonths);
		scmonth.selectByValue("6");
	}
	
	public void YearsMethod() {
		Select scyr = new Select(selectyears);
		scyr.selectByValue("2017");
	}
	
	public void CheckNews() {
		checkNews.click();
	}
	
	public void ClickRegisterButton() {
		clickRegisterButton.click();
	}
}
