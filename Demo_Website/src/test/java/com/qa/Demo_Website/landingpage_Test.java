package com.qa.Demo_Website;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.*;

import org.junit.Test;

public class landingpage_Test {

	WebElement element;
	WebDriver driver;

	// initialize ExtentReports with a file path
	ExtentReports extent = new ExtentReports("C:/Users/Admin/Downloads/DemoTestReport.html", true);

	ExtentTest test;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void click_addUser() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
		landingPage page = PageFactory.initElements(driver, landingPage.class);
		page.clickAddUser();

		driver.get("http://thedemosite.co.uk/addauser.php");
		regUser page1 = PageFactory.initElements(driver, regUser.class);
		page1.clickAddUser("user", "pass");

		loginPage page2 = PageFactory.initElements(driver, loginPage.class);
		page2.attemptLogin("user", "pass");

		
		// initialize / start the test
		test = extent.startTest("Add User");

		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");

		// report the test as a pass
		test.log(LogStatus.PASS, "");

		extent.endTest(test);
		extent.flush();
	}
}