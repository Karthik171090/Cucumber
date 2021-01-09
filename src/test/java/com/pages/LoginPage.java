package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {

public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	WebElement txtUserName;

	@FindBy(id = "password")
	WebElement txtPass;

	@FindBy(id = "login")
	WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String txtUserName, String txtPass) {
		type(getTxtUserName(), txtUserName);
		type(getTxtPass(), txtPass);
		btnClick(getBtnLogin());

	}
	
	
}
