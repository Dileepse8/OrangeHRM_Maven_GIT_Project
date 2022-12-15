package com.OrangeHRM.TestLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_OHRM040 {

	WebDriver driver;

	public Login_page_OHRM040(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Elements_Using Method POM-1637904
	@FindBy(id = "txtUsername")
	WebElement txtUsername;
	@FindBy(id = "txtPassword")
	WebElement txtPassword;
	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	@FindBy(linkText = "Admin")
	WebElement lnkAdmin;
	@FindBy(id = "spanMessage")
	WebElement errmsg;

	// Action Methods-Login
	
	public void getUserCredentials(String userName, String password) {
		txtUsername.sendKeys(userName);
		txtPassword.sendKeys(password);

	}

	public void getClickLogIn() {
		btnLogin.click();
	}

	public boolean isAdminDisplayed() {
		String exptRes = "Admin";
		String actRes = lnkAdmin.getText();

		if (exptRes.equals(actRes)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isEMPDisplayed() {
		String exptRes = "Admin";
		String actRes = lnkAdmin.getText();

		if (!exptRes.equals(actRes)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean errSpanmsgDisplyed() {
		String exptRes = "Invalid credentials";
		String actRes = errmsg.getText();
		if (exptRes.equals(actRes)) {
			return true;
		} else {
			return false;
		}
	}
}
