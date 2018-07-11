package com.qa.phpTravels;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class hotelTest {

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

	@After
	public void teardown() {

		extent.endTest(test);
		extent.flush();
		driver.quit();
	}

	public void test() {
		fail("Not yet implemented");
	}

}
