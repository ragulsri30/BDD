package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static WebDriver driver;

	public void browser_launch() throws IOException {
		File f = new File(
				"C:\\Users\\JOSHI FRANKLIN\\eclipse-workspace\\BDD_Framework\\src\\test\\resources\\ConfigProperties\\Config.Properties");

		FileInputStream input = new FileInputStream(f);

		Properties p = new Properties();

		p.load(input);

		if (p.getProperty("Browser").equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get(p.getProperty("Url"));
		}

		else if (p.getProperty("Browser").equalsIgnoreCase("Edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			driver.get(p.getProperty("Url"));

		}

		else {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			driver.get(p.getProperty("Url"));
		}

		driver.manage().window().maximize();

	}

	
}
