package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass2 {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = browserLaunch("edge");
		url("https://adactinhotelapp.com/");
		sendkeys(driver.findElement(By.xpath("//input[@name='username']")), "Dhamodhara");
		sendkeys(driver.findElement(By.xpath("//input[@name='password']")), "lion.....");
		click(driver.findElement(By.xpath("//input[@name='login']")));
		dropdown(driver.findElement(By.xpath("//select[@id='location']")), "value", "London");
		dropdown(driver.findElement(By.xpath("//select[@id='hotels']")), "value", "Hotel Hervey");
		dropdown(driver.findElement(By.xpath("//select[@id='room_type']")), "value", "Deluxe");
		clear(driver.findElement(By.xpath("//input[@class='date_pick']")));
		 sendkeys(driver.findElement(By.xpath("//input[@class='date_pick']")), "16/03/2023");
		 clear(driver.findElement(By.xpath("//input[@name='datepick_out']")));
		 sendkeys(driver.findElement(By.xpath("//input[@name='datepick_out']")), "18/03/2023");
		 dropdown(driver.findElement(By.xpath("//select[@name='adult_room']")), "value", "2");
		 click(driver.findElement(By.xpath("//input[@name='Submit']")));
		click(driver.findElement(By.xpath("//input[@name='radiobutton_0']")));
		click(driver.findElement(By.xpath("//input[@name='continue']")));
		sendkeys(driver.findElement(By.xpath("//input[@name='first_name']")), "saravanan");
		sendkeys(driver.findElement(By.xpath("//input[@name='last_name']")), "velayutham");
		sendkeys(driver.findElement(By.xpath("//textarea[@name='address']")), "1/31A Rice Mill Road");
		sendkeys(driver.findElement(By.xpath("(//input[@class='reg_input'])[3]")), "1234567890123456");
		dropdown(driver.findElement(By.xpath("//select[@id='cc_type']")), "value", "AMEX");
		dropdown(driver.findElement(By.xpath("//select[@name='cc_exp_month']")), "value", "10");
		dropdown(driver.findElement(By.xpath("//select[@name='cc_exp_year']")), "value", "2018");
		sendkeys(driver.findElement(By.xpath("//input[@name='cc_cvv']")), "777");
		click(driver.findElement(By.xpath("//input[@name='book_now']")));
		

		click(driver.findElement(By.xpath("//input[@name='logout']")));
		url("https://www.flipkart.com/");
		getText(driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']")));
		
	}


}
