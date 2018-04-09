package com.paragon.netapp.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paragaon.netapp.adminModule.ApplicationProperties;
import com.paragaon.netapp.adminModule.ManualFunctions;
import com.paragaon.netapp.adminModule.NativeUser;
import com.paragaon.netapp.adminModule.PropertyPreferences;
import com.paragaon.netapp.dicoverModule.ControlRelease;
import com.paragaon.netapp.dicoverModule.Manual_discover;
import com.paragon.netapp.modules.LoginPage;
import com.paragon.netapp.projectUtils.ProjectUtility;
import com.paragon.netapp.projectUtils.XLUtility;



public class CompleteCheck {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeSuite
	public void launchBrowser() throws Exception 
	{
		String browser=ProjectUtility.getProperty("Browser");
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			ChromeOptions options=new ChromeOptions();
			options.setProxy(null);
			
			
			System.setProperty("webdriver.chrome.driver",
					".\\src\\main\\resources\\com\\paragon\\resources\\drivers\\chromedriver.exe");

		    driver = new ChromeDriver(options);
		    
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new InternetExplorerDriver();
		}
		
		wait=new WebDriverWait(driver, 30);

	}
	
	@BeforeTest
	public void launchApp() throws Exception 
	{
		String APPURL=ProjectUtility.getProperty("URL");
		driver.get(APPURL);
	}
	

	@Test (dataProvider="LoginTest",priority=1)
	public void TestCase01(String iusername,String ipassword,String username,String password) throws Exception 
	{
		LoginPage.loginToApp(driver, iusername, ipassword);
	
		driver.navigate().refresh();

		LoginPage.loginToApp(driver, username, password);
		
		WebElement wb=driver.findElement(By.partialLinkText("Home"));

		wait.until(ExpectedConditions.elementToBeClickable(wb));
		
	}

/*	@Test(dataProvider="TestUserScenarios",priority=7)
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

	}*/
	
	 @Test(priority=6)
		 
		 public void ApplicationAdmin() throws InterruptedException {
			 
			 ApplicationProperties.ApplicationProp(driver);
		 }
		 
	 @Test(priority=5)
	 
	 public void PropertyAdmin() throws InterruptedException {
		 
		 PropertyPreferences.PropertyPref(driver);
	 }
		 
 @Test(priority=4)
	 
	 public void ManualAdmin() throws InterruptedException {
		 
		ManualFunctions.ManualAdmin(driver);
	 }
		 
	 
		 
	 
	@Test(priority=2)
	 public void Control(String SourceController) throws InterruptedException {

		 ControlRelease.ControlBatch(driver, SourceController);
	 }
	 
	 @Test(dataProvider="ControllerWorkPackage",priority=3)
	 
	 public void discoverModule(String Workpack,String SourceController,String Assettag,String InstallDate ) throws InterruptedException {
		 
		 Manual_discover.Workpack(driver, Workpack, SourceController, Assettag, InstallDate);	 
	
	 }
	

	
	 
	 
	 @DataProvider(name="LoginTest")
	public String[][] getData() throws Exception
	{
		String[][] data=XLUtility.getData("loginTest","TestData.xls");
		
		return data;
		
	}
	
	@DataProvider(name="TestUserScenarios")
	public String[][] getData1() throws Exception
	{
		String[][] data=XLUtility.getData("TestUserScenarios","TestData.xls");
		
		return data;
		
	}
	
	@DataProvider(name="ControllerWorkPackage")
	public String[][] getData2() throws Exception
	{
		String[][] data=XLUtility.getData("ControllerWorkPackage","TestData.xls");
		
		return data;
	}	
	
	@AfterSuite

	 public void logout() throws InterruptedException, IOException
	  {
	         Thread.sleep(10000); 
	         driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
	 				}

}





