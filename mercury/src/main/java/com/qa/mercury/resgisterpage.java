package com.qa.mercury;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class resgisterpage {
	
	
	@FindBy(name ="firstName" )
	private WebElement firstname;
	
	
	@FindBy(name = "lastName")
	private WebElement lastname;
	
	@FindBy(name = "phone")
	private WebElement phone;
	
	@FindBy(name = "userName")
	private WebElement email;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
	private WebElement address1;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")
	private WebElement address2;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
	private WebElement city;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")
	private WebElement county;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")
	private WebElement postcode;
	
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "confirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
	private WebElement registerbuttonlink;
	
	
	public void registers() {
		
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
		registerbuttonlink.click();
		
		
		
	}
	

}
