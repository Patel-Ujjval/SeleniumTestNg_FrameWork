package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Base_Class {

	public WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		// To read the data of properties files

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\Resources\\data.properties");

		prop = new Properties();

		prop.load(fis); // it contains whole list anmd getproperty will search specific contain from
						// that list

		prop.getProperty("browser"); // It will search the specific key only and return the value

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

	}

	@BeforeClass
	public void launchBrowser() throws IOException {

		initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	public String generateRandomEmailID() {

		return System.currentTimeMillis() + "@gmail.com";

	}

}
