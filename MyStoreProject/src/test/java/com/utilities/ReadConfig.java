package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	String path="C:\\tester\\MyStoreProject\\configuration\\config.properties";
	
	public ReadConfig() {
		try {
			FileInputStream fis = new FileInputStream(path);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		if(url!=null) {
			return url;
		}else {
			throw new RuntimeException("URL not found in config properties file...");
		}
	}
	
	public String getbrowser() {
		String browser = pro.getProperty("browser");
		if(browser!=null) {
			return browser;
		}else {
			throw new RuntimeException("Browser not found in config properties file...");
		}
	}
}
