package com.selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTillDayPractise {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium2\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@class='login_input']"));
		username.sendKeys("Dhamodhara");
		WebElement login = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
		login.sendKeys("lion.....");
		WebElement logbtn = driver.findElement(By.xpath("//input[@class='login_button']"));
		logbtn.click();

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select sl = new Select(location);
		sl.selectByValue("London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Hervey");

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room);
		s3.selectByValue("Super Deluxe");

		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(roomno);
		s4.selectByValue("7");

		WebElement chkin = driver.findElement(By.xpath("//input[@class='date_pick']"));
		chkin.clear();
		chkin.sendKeys("19/02/2023");

		WebElement chkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		chkout.clear();
		chkout.sendKeys("20/02/2023");

		WebElement adlroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s7 = new Select(adlroom);
		s7.selectByValue("2");
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();

		WebElement rdbtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		rdbtn.click();

		WebElement cnt = driver.findElement(By.xpath("//input[@name='continue']"));
		cnt.click();
		
		WebElement frtname = driver.findElement(By.xpath("//input[@name='first_name']"));
		frtname.sendKeys("Saravanan");
		
		WebElement lstname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lstname.sendKeys("Velayutham");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("1/31 a rice mill road");
		
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("1234567890123456");
		
		WebElement crdtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s8 = new Select (crdtype);
		s8.selectByValue("MAST");
		
		WebElement monthexp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s9 =  new Select (monthexp);
		s9.selectByValue("10");
		
		WebElement yearexp = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s11 = new Select (yearexp);
		s11.selectByValue("2022");
		
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("777");
		
		WebElement bookbtn = driver.findElement(By.xpath("//input[@name='book_now']"));
		bookbtn.click();
		
//	WebElement logout1 = driver.findElement(By.xpath("(//input[@class='reg_button'])[3]"));
//	Thread.sleep(3000);
//		logout1.click();
		
		driver.navigate().to("https://garuda-technologies.web.app/alert.html");
		
		WebElement simpbtn = driver.findElement(By.xpath("//button[@id='accept']"));
		simpbtn.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		
		WebElement cfmbtn = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		cfmbtn.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		//WebElement rcmbook = driver.findElement(By.xpath("//div[contains(@class,'a-section _video-player_')]"));
	WebElement ac = driver.findElement(By.xpath("//div[contains(@class,'-section _video-player_static-card')]"));
		Actions at = new Actions( driver);
		at.contextClick(ac).build().perform();
		
		
		
		
	
	
	
	}

	
	}


