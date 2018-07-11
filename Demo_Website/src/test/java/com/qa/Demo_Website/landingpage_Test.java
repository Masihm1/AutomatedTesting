package com.qa.Demo_Website;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class landingpage_Test {

	private static final XSSFCell UserName = null;
	
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

		// interacting with the spreadsheet
		// path test data and file test data are defined in the constant class
		// also handles exception wit try and catch block
		// and gets cell 0 (top left) goes to the first cell ready to pick up data

		FileInputStream file = null;
		{
			try {
				file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
			} catch (FileNotFoundException a) {
			}
			XSSFWorkbook workbook = null;
			try {
				workbook = new XSSFWorkbook(file);
			} catch (IOException e) {
			}
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {

			// getting row number and cell number from spreadsheet - for example row 1 and
			// cell 1

			XSSFCell user = sheet.getRow(i).getCell(0); // username ref
			XSSFCell pass = sheet.getRow(i).getCell(1); // password ref
			
			String newuser = user.getStringCellValue();
			String Password = pass.getStringCellValue();
	
			driver.manage().window().maximize();
			driver.get("http://thedemosite.co.uk/");
			
			landingPage page = PageFactory.initElements(driver, landingPage.class);
			page.clickAddUser();

			driver.get("http://thedemosite.co.uk/addauser.php");

			regUser page1 = PageFactory.initElements(driver, regUser.class);
			page1.clickAddUser(user.getStringCellValue(), "");

			loginPage page2 = PageFactory.initElements(driver, loginPage.class);
			page2.attemptLogin(user.getStringCellValue(), "");

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

}
}