package com.utils;

import java.io.FileInputStream;
import java.util.Properties;
import com.baseclass.BaseClass;

public class PropertiesUtils extends BaseClass {
	
	public static FileInputStream fis= null;

	public static String readproperty(String key) throws Exception {
		// Dynamic Path variables
		
	String pathString = System.getProperty("user.dir")+ "/src/main/resources/config.properties";
		Properties propertiesUtils = new Properties();
		FileInputStream fileInputStream = new FileInputStream(pathString);
		propertiesUtils.load(fileInputStream);
		return propertiesUtils.getProperty(key);
	}
}
