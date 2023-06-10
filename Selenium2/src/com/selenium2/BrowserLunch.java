package com.selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLunch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

}
