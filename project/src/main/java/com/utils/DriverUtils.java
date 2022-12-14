package com.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.baseclass.BaseClass;

public class DriverUtils extends BaseClass {

	public static String getScreenshot(String name) throws Exception {
		
		TakesScreenshot tScreenshot = (TakesScreenshot)driver;
		File srcFile = tScreenshot.getScreenshotAs(OutputType.FILE);
		String pathString = System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
		File desFile = new File(pathString);
		
		FileUtils.copyFile( srcFile, desFile);
		return pathString;
	}

	

}
