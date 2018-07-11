package com.qa.Demo_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	@FindBy(name = "username")
	private WebElement enterUsername;

	@FindBy(name = "password")
	private WebElement enterPassword;

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement clicktestLogin;

	public void attemptLogin(String UserName, String password) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		enterUsername.sendKeys(UserName);
		enterPassword.sendKeys(password);
		clicktestLogin.click();

	}
}
