package com.praveen.helper;

import java.io.FileReader;
import java.util.Properties;

public class ConfigurationManager {
	static FileReader reader= null;
	public static void loadProperties() throws Throwable{

		try {
			FileReader reader = new FileReader("Config.properties");


		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		Properties properties = new Properties(); 
		
		try {
			properties.load(reader);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		String property = properties.getProperty("url");	
		String property2 = properties.getProperty("browser");
		String property3 = properties.getProperty("userName");
		String property4 = properties.getProperty("passWord");
		
	}
}
}
