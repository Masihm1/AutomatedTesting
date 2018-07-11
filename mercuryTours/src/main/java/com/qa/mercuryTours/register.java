package com.qa.mercuryTours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class register {
	
	@FindBy(name ="name" )
	private WebElement firstname;
	
	
	@FindBy(name = "lastName")
	private WebElement lastname;
	
	@FindBy(name = "phone")
	private WebElement phone;
	
	@FindBy(name = "userName")
	private WebElement email;
	
	@FindBy(name = "lastName")
	private WebElement address1;
	
	@FindBy(name = "lastName")
	private WebElement address2;
	
	@FindBy(name = "lastName")
	private WebElement city;
	
	@FindBy(name = "lastName")
	private WebElement county;
	
	@FindBy(name = "lastName")
	private WebElement postcode;
	
	@FindBy(name = "lastName")
	private WebElement username;
	
	@FindBy(name = "lastName")
	private WebElement password;
	
	@FindBy(name = "lastName")
	private WebElement confirmpassword;
	
	
	private void register() {
		
		firstname.sendKeys("Kyle");
		lastname.sendKeys("Martin");
		phone.sendKeys("01785245658");
		email.sendKeys("kyle@hotmail.com");
		address1.sendKeys("");
		address2.sendKeys("");
		city.sendKeys("Manchester");
		county.sendKeys("Lancashire");
		postcode.sendKeys("M50 7AA");
		username.sendKeys("kylem");
		password.sendKeys("martin");
		confirmpassword.sendKeys("martin");
		
		
		
	}

}
