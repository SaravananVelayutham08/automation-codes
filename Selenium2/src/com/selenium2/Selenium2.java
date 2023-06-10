package com.selenium2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://garuda-technologies.web.app/");
		WebElement workspace = driver.findElement(By.xpath("//a[@href='workspace.html']"));
		workspace.click();
		WebElement forms = driver.findElement(By.xpath("//a[@href='allinone.html']"));
		forms.click();
		WebElement namedb = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		String text = namedb.getAttribute("placeholder");
	System.out.println(text);
	
	WebElement last = driver.findElement(By.xpath("//div[@class='allin3'][2]"));
	String text2 = last.getText();
	System.out.println(text2);
	WebElement workspace1 = driver.findElement(By.xpath("//a[@href='workspace.html']"));
	workspace1.click();
	WebElement forms1 = driver.findElement(By.xpath("//a[@href='button.html']"));
	forms1.click();
	WebElement disable = driver.findElement(By.xpath("//button[@class='to5']"));
	boolean enabled = disable.isEnabled();
	System.out.println(enabled);
		
	}

}
