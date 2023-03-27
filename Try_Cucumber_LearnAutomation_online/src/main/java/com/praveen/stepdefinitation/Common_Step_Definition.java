package com.praveen.stepdefinitation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.praveen.helper.ConfigurationManager;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Step_Definition {
	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		try {
			ConfigurationManager.loadProperties();
			
			
			if(driver==null) {
				lanuchBrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}



	}

	public void lanuchBrowser() {
		try {
			switch ("edge") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}


	}
}