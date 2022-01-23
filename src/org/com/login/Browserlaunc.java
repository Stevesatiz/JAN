package org.com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunc {
	
	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\satiz\\eclipse-workspace\\Browser\\Driver\\chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   WebElement txtUsername = driver.findElement(By.id("email"));
	   txtUsername.sendKeys("havocavi628@gmail.com");
	   
	   WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	  pass.sendKeys("5455356565656");
	   
	  WebElement but = driver.findElement(By.xpath("//button[@name='login']"));
	  but.click();
	  
	  String title = driver.getTitle();
	   System.out.println(title);
	   
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   
	   
		
		
		
		
		
	}
	
	
	

}
