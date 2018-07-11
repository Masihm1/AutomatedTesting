package com.qa.mercury;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	
		
		@FindBy(name ="userName" )
		private WebElement username;
		
		@FindBy(name = "password")
		private WebElement password;
		
		@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")
		private WebElement loginbuttonlink;
		
		
		
	public void login() {
			
			username.sendKeys("kylem");
			password.sendKeys("martin");
			loginbuttonlink.click();

}
}