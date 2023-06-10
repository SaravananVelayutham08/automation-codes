package com.selenium2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass2 {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browserLaunch) {
		if (browserLaunch.equalsIgnoreCase("edge")) {
			System.setProperty("webdrive.edge.driver",System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
					
		}else {
			System.out.println("invalid browser");
		}
	return driver;
		
	}
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public static void sendkeys(WebElement elementName, String Value) {
		elementName.sendKeys(Value);

	}
	public static  void dropdown(WebElement elementNmae ,String Methods ,String Value) {
		if (Methods.equalsIgnoreCase("index")) {
			Select s = new Select (elementNmae);
			s.selectByIndex(Integer.parseInt(Value));
			
		}else if (Methods.equalsIgnoreCase("value")) {
			Select s1 = new Select (elementNmae);
			s1.selectByValue(Value);
			
		} else if (Methods.equalsIgnoreCase("text")) {
			Select s2 = new Select (elementNmae);
			s2.selectByVisibleText(Value);
			
		}
		
		}
	public static void click( WebElement elementName) {
		elementName.click();
		}
	public static void clear( WebElement elementName) {
		elementName.clear();
				}
	public static void getText(WebElement elementNmae) {
		elementNmae.getText();
		System.out.println(elementNmae);
		}
	
	public static void alert(WebElement elementNmae , String value , String Methods) {
		

	}
	
		}


