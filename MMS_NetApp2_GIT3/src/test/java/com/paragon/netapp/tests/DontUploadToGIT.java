package com.paragon.netapp.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paragon.netapp.modules.LoginPage;
import com.sun.prism.shader.AlphaTextureDifference_LinearGradient_Loader;


public class DontUploadToGIT extends BaseTest
{
	@Test
	public void test1() throws Exception
	{
		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");

		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//*[text()='Native User Management']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//a[contains(@aria-label,'go to next page')]"));
		boolean found=false;
		while(wb.isEnabled())
		{
			List<WebElement> allNames=driver.findElements(By.xpath("//datatable-body-row/div/datatable-body-cell[1]/div/span"));
			
			for(int i=0;i<allNames.size();i++)
			{
				Thread.sleep(1000);
				
				System.out.println(allNames.get(i).getText());
				
				if(allNames.get(i).getText().equals("user12"))
				{
					driver.findElement(By.xpath("//datatable-body-cell[div[span[text()='user12']]]/following-sibling::datatable-body-cell/div/button[1]")).click();
					found=true;
				}

			}
			if(found==false)
			{
				wb.click();
			}
			
		}
		

		
		
	}
}
