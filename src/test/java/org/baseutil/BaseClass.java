package org.baseutil;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser) {

		switch (browser){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			break;
		}
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
