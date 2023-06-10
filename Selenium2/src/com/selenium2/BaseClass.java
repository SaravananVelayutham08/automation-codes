package com.selenium2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browserLaunch) {
		if (browserLaunch.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chro.driver", System.getProperty(("User.dir") +"\\Driver\\chromedriver.exe"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(options);
			
			
			
		}else  {
			System.out.println("invalid Browser");
		}
		return driver;
		
			
		
			
		}
	public static  void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void sendkeys(WebElement elementName , String value) {
	elementName.sendKeys(value);
	}
	public  static void click(WebElement elementName) {
		elementName.click();
		}
	public static void dropdown(WebElement elementName, String Methods, String Value) {
		if (Methods.equalsIgnoreCase(Methods)) {
			Select s = new Select (elementName);
			s.selectByIndex(Integer.parseInt(Value));
			}
		else if (Methods.equalsIgnoreCase(Methods)) {
			Select s1 = new Select (elementName);
			s1.selectByValue(Value);
			
		} else if (Methods.equalsIgnoreCase(Methods)) {
			Select s2 = new Select (elementName);
			s2.selectByVisibleText(Value);
			
		} 
		
		

	}
	
	}
	
	
		
	
	
		
	
	


