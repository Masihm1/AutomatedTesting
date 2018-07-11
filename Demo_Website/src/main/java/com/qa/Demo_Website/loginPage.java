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

	public void attemptLogin(String user, String Pass) {

		enterUsername.sendKeys("Papi");
		enterPassword.sendKeys("Papi0007");
		clicktestLogin.click();

	}
}
