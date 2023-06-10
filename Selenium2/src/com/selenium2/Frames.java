package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		WebElement framebtn = driver.findElement(By.id("Click"));
		framebtn.click();
		
		driver.switchTo().parentFrame();
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Count Frames']"));
		clickbtn.click();
		
		
	
	}
}
