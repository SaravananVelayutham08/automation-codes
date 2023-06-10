package com.selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> ckhbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement webElement : ckhbox) {
			webElement.click();
			if (webElement != ckhbox ) {
				
			}
			
			
		}
		
		
		

}
}