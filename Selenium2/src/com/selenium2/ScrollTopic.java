package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTopic {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement je = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("arguments[0].scrollIntoView(true)", je);
	String text = je.getText();
	System.out.println(text);
	
	Actions ae = new Actions(driver);
	WebElement bob = driver.findElement(By.xpath("(//img[@class='product-image'])[88]"));
	ae.doubleClick(bob).build().perform();

		

		


	}

}
