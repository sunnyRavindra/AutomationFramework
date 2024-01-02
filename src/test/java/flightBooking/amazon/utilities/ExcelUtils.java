package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) throws IOException {


		FileInputStream excelFile = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//excel//amazonData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

//		XSSFSheet worksheet = workbook.getSheet("TestCase1");

//		System.out.println(worksheet.getActiveCell());

	}
}
