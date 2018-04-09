package com.paragaon.netapp.adminModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditDeletePassChange {
	
	public static void editUserdetails(WebDriver driver, String changename) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='adminDropdown']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Admin User Management']")).click();
		
		
		Thread.sleep(10000);

		WebElement wb = driver.findElement(By.xpath("//a[contains(@aria-label,'go to next page')]"));
		boolean found = false;
		while (wb.isEnabled()) {
			List<WebElement> allNames = driver
					.findElements(By.xpath(".//datatable-body-row/div[2]/datatable-body-cell[1]/div"));

			for (int i = 0; i < allNames.size(); i++) {
				Thread.sleep(1000);

				System.out.println(allNames.get(i).getText());

				if (allNames.get(i).getText().equals(changename)) {
					
			           i=i+1;
			           Thread.sleep(10000);
			           driver.findElement(By.xpath("(.//button[@class='btn btn-sm btn-primary'])["+i+"]")).click();
			           Thread.sleep(10000);
			           driver.findElement(By.name("lastName")).clear();
			          Thread.sleep(5000);
			           driver.findElement(By.name("lastName")).sendKeys("smith1");
			           Thread.sleep(5000);
			           driver.findElement(By.name("email")).clear();
			           Thread.sleep(5000);
			           driver.findElement(By.name("email")).sendKeys("smith@gmail.com");
			           Thread.sleep(5000);
					
					System.out.println("*************************data edited");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[text()='Save']")).click();
					Thread.sleep(10000);
					found = true;
					break;

				}
				
			}
			
			if (found == false) {
				wb.click();
				
			}
			else if(found==true) { break; }
		}

	}
	
	public static void passwordDetails(WebDriver driver,String changename ) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='adminDropdown']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Admin User Management']")).click();
		Thread.sleep(5000);
		
		// Clicking on pagination right button(datatable-icon-right).
		WebElement wb = driver.findElement(By.xpath("//a[contains(@aria-label,'go to next page')]"));
		boolean found = false;

		while (!found) // While Not Found.
		{
			while (wb.isEnabled()) // and 'datatable-icon-right' arrow is enabled means still item are left in
									// right side.
			{
				List<WebElement> allNames = driver.findElements(By.xpath(".//datatable-body-row/div[2]/datatable-body-cell[1]/div"));

				for (int i = 0; i < allNames.size(); i++) {
					Thread.sleep(1000);

					//System.out.println(allNames.get(i).getText());

					if (allNames.get(i).getText().equals(changename)) {
						
				           i=i+1;
				           Thread.sleep(10000);
				           driver.findElement(By.xpath("(.//*[@class='btn btn-sm btn-warning'])["+i+"]")).click();
				           Thread.sleep(5000);
				           System.out.println("*************************click on password icon");					           
				           driver.findElement(By.name("password")).sendKeys("45678");
				           Thread.sleep(5000);
				           driver.findElement(By.name("passwordConfirm")).sendKeys("45678");
				           Thread.sleep(5000);					       
				           driver.findElement(By.xpath(".//button[@class='btn btn-primary' and text()='Change Password']")).submit();
				           Thread.sleep(5000);					   	
						found = true;
						break;
					}

				}
				
				  if(found==false) {
					  wb.click(); 
				  }
				 
				else if(found==true) { break; }
				

			}

		}
	
	}
	

	public static void deleteUserdetails(WebDriver driver,String changename) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='adminDropdown']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Admin User Management']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		// Clicking on pagination right button(datatable-icon-right).
		WebElement wb = driver.findElement(By.xpath("//a[contains(@aria-label,'go to next page')]"));
		boolean found = false;

		while (!found) // While Not Found.
		{
			while (wb.isEnabled()) // and 'datatable-icon-right' arrow is enabled means still item are left in
									// right side.
			{
				List<WebElement> allNames = driver.findElements(By.xpath(".//datatable-body-row/div[2]/datatable-body-cell[1]/div"));

				for (int i = 0; i < allNames.size(); i++) {
					Thread.sleep(1000);

					//System.out.println(allNames.get(i).getText());

					if (allNames.get(i).getText().equals(changename)) {
						
				           i=i+1;
				           Thread.sleep(10000);
				           driver.findElement(By.xpath("(.//*[@class='btn btn-sm btn-danger'])["+i+"]")).click();
				           Thread.sleep(5000);
				           System.out.println("*************************click on delete icon");
				           driver.findElement(By.xpath("//button[text()='Delete']")).click();
				   		Thread.sleep(5000);
				   	
						found = true;
						break;
					}

				}
				
				  if(found==false) { wb.click(); }
				 
				else if(found==true) { break; }
				

			}

		}
		
	}
}
		
/*ResultSet rs = DatabaseManager.verifyUserinDB();
		if (rs.next()) {
			System.out.println("Something went wrong");
		} else {
			System.out.println("No Record found in Database");
		}

}*/