package com.qa.mercury;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class tourtest {
	
	
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
	
	
	@Test
	
	
	
	public void test() {
		
		driver.get(constant.mercury);
		driver.manage().window().maximize();
		test = extent.startTest("Register User"); 
		test.log(LogStatus.INFO, "Start" );
		home start = PageFactory.initElements(driver, home.class);
		resgisterpage register = PageFactory.initElements(driver, resgisterpage.class);
		loginpage login = PageFactory.initElements(driver, loginpage.class);
		
		start.registerPAGE();
		register.registers();
		start.login();
		login.login();
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			
			test.log(LogStatus.PASS,"Passed" );
			
		}
		else {
			
			test.log(LogStatus.FAIL, "Fail");
		}
		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		
		
		
	}
	
	

}
