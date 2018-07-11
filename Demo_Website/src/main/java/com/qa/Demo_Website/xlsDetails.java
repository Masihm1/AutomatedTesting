package com.qa.Demo_Website;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsDetails {

	////ileInputStream file = new FileInputStream("C:/Users\\Admin/Downloads"); 
	//XSSFWorkbook workbook = new XSSFWorkbook("DemoSiteDDT.xlsx");
	
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
		XSSFCell cell = sheet.getRow(0).getCell(0);
		System.out.println(cell.getStringCellValue());

	}

}
