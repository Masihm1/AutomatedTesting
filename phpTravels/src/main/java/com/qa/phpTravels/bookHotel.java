package com.qa.phpTravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class bookHotel {

	@FindBy(id = "s2id_autogen8")
	private WebElement countrysearchBox;

	@FindBy(id = "s2id_autogen8")
	private WebElement countryText;

	public void homePage(WebDriver driver) {

		Actions action = new Actions(driver);

		action.moveToElement(countrysearchBox).clickAndHold().moveByOffset(0, 300).perform();

	}
}
