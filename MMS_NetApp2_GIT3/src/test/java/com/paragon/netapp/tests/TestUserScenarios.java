package com.paragon.netapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;

import com.paragaon.netapp.adminModule.NativeUser;
import com.paragon.netapp.modules.LoginPage;
import com.paragon.netapp.projectUtils.XLUtility;

public class TestUserScenarios extends BaseTest
{

	@Test(priority=1)
	public void logintoApp() throws InterruptedException
	{
		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");
		WebElement wb=driver.findElement(By.partialLinkText("Home"));
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	
/*	@Test(priority=2,dataProvider="TestUserScenarios")
	
	public void userTest(String Action,String username,String firstname,String lastname,String password,String confirmpassword,String email,String role,String enabled) throws Exception
	{
		if(Action.equalsIgnoreCase("Create"))
		{
			NativeUser.newUserCreation(driver,username,firstname,lastname,password,confirmpassword,email,role,enabled);
		}	
		
		else if(Action.equalsIgnoreCase("Edit"))
		{
			NativeUser.editUser(driver,username,firstname,lastname,password,confirmpassword,email,role,enabled);
		}
		else if(Action.equalsIgnoreCase("Delete"))
		{
			NativeUser.deleteUser(driver, username, firstname, lastname, password, confirmpassword, email, role, enabled);
		}

	}
	*/
	
	@DataProvider(name="TestUserScenarios")
	public String[][] getData() throws Exception
	{
		String[][] data=XLUtility.getData("TestUserScenarios","TestData.xls");
		
		return data;
		
	}
	
}
