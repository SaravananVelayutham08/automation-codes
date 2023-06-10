package com.selenium2;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTpoic {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://garuda-technologies.web.app/");
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	//File destfile = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\screenshot");
	//FileUtils.copyFile(screenshotAs, destfile);
		
		
		WebElement workspace = driver.findElement(By.xpath("//a[@href='workspace.html']"));
		workspace.click();
		
		WebElement alert = driver.findElement(By.xpath("//a[@href='alert.html']"));
		alert.click();
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='to']"));
		alert1.click();
		Alert switchTo = driver.switchTo().alert();
				switchTo.accept();
				
				WebElement confrimbtn = driver.findElement(By.xpath("//button[@class='too']"));
				confrimbtn.click();
				Alert switchTo2 = driver.switchTo().alert();
				switchTo2.dismiss();
				Thread.sleep(5000);
				
				WebElement promtbtn = driver.findElement(By.xpath("//button[@class='to3']"));
				promtbtn.click();
			Alert switchTo3 = driver.switchTo().alert();
			switchTo3.sendKeys("hii");
			Thread.sleep(5000);
			switchTo3.accept();
				
				
				
				
				
				
		
		
		;
	}

}
