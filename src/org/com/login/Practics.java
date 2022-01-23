package org.com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practics {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satiz\\eclipse-workspace\\Browser\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement frstName = driver.findElement(By.xpath("//input[@type='text'][1]"));
		frstName.sendKeys("sathish");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("steve");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	     address.sendKeys("no.54,pallavan nagar,injambakkam,chennai-115");
	     
	     WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	     email.sendKeys("stevesatiz@gmail.com");
	     
	     WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	     phone.sendKeys("9586565666");
	     
	     
	     WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	     gender.click();
	     
	     WebElement hob = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	     hob.click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
