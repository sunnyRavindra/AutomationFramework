package com.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebUtil {
	
	public void takeScreenShot(WebDriver driver, String FileName) {
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

        Date currentDate = new Date();

        String timestamp = dateFormat.format(currentDate);

        System.out.println("Timestamp: " + timestamp);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File(System.getProperty("user.dir") + "//src//test//resources//screenShots//" + FileName + timestamp +".png");

		try {
		    FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
