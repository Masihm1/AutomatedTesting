package com.qa.Selenium;

import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class testExample {

	WebElement element;
	WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");

		driver = new ChromeDriver();

	}

	// @After
	// public void tearitDown() {
	//
	// driver.quit();

	// }

	@Test
	public void CreateUserTest() {

		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");

		WebElement userElementInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		userElementInput.sendKeys("Papi");

		WebElement passElementInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passElementInput.sendKeys("Papi007");

		WebElement SaveButtonElement = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		SaveButtonElement.click();

	}

	@Test
	public void LoginTest() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/login.php");

		WebElement LoginElementInput = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		WebElement UserloginElementInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		UserloginElementInput.sendKeys("Papi");
		WebElement UserPassElementInput = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		UserPassElementInput.sendKeys("Papi007");
		WebElement LoginButtonElement = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		LoginButtonElement.click();

	}
}
