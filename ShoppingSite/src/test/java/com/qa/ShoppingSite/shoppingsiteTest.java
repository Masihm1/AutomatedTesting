package com.qa.ShoppingSite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class shoppingsiteTest {

	WebElement element;
	WebDriver driver;

	@Before
	public void goToSite() {

		System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void gotToSite() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		searchItem page = PageFactory.initElements(driver, searchItem.class);
		page.SearchBut("Dress");

	}
}
