package com.qa.Demo_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class regUser {

	@FindBy(name = "username")
	private WebElement regUsername;

	@FindBy(name = "password")
	private WebElement regPassword;

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement clickSave;

	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement clickLogin;

	public void clickAddUser(String UserName, String password) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		regUsername.sendKeys(UserName);
		regPassword.sendKeys(password);
		clickSave.click();
		clickLogin.click();
		


	}
}
