package flightBooking.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTC {

	@Test
	public void Excel() throws IOException {
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/excel/testData.xlsx");
		FileInputStream fileInput = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("UsersDetails");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String Value = cell.getStringCellValue();
		System.out.println(Value);

	}

}
