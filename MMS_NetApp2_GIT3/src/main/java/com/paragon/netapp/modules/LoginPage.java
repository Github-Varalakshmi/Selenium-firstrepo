package com.paragon.netapp.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage

{
	public static String loginToApp(WebDriver driver, String username, String password) throws InterruptedException {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("pwd1")).clear();
		driver.findElement(By.id("pwd1")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000); 
		boolean displayed;
		try {
			displayed = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed();
		}catch(Exception e) {
			displayed = false;
		}
		 if(displayed) 
		   {
			 return "Fail";

	        }
		 else {
			 return "Pass";
		 }
		}

	public static void logoutFromApp(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(10000); 

		
        driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		Thread.sleep(5000); 
		 
		driver.close();
	
	}

}
