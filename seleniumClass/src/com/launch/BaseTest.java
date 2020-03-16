package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static Properties p;
	public static WebDriver driver;
	public static String projectpath =System.getProperty("user.dir");
	
	public static void init() throws IOException {
		//FileInputStream fis = new FileInputStream("C:\\Users\\Shashrik-Laptop\\Documents\\Shridevi\\Selenium\\workspace\\seleniumClass\\data.properties");
		FileInputStream fis = new FileInputStream( projectpath+ "//data.properties");
		p = new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser) {
		
		if(p.getProperty(browser).equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", projectpath +"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}
				/*else if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		driver.get("https:/bestbuy.com");
			
		}*/
	}
	
	public static void navigate(String url) {
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
	}
	

}
