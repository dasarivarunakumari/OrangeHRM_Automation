package com.OrangeHRM.Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.BaseClass.BaseClass;

public class ExcelRead extends BaseClass {

	String excelFilePath = ".//ExcelFile//ExcelTestData.xlsx" ;
	FileInputStream inputstream = new FileInputStream(excelFilePath);
	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	
	
}
