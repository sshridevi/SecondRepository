package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Shashrik-Laptop
 *
 */
public class Browserlaunch {

	public static void main(String[] args) {
		
		WebDriver driver ;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		/*
		 * System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		 * FirefoxDriver driver1 = new FirefoxDriver();
		 * driver1.get("https://www.bestbuy.com");
		 */

	}

}
