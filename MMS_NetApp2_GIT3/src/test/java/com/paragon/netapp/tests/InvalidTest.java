package com.paragon.netapp.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paragaon.netapp.adminModule.InvalidScenario;
import com.paragon.netapp.projectUtils.XLUtility;



public class InvalidTest extends BaseTest {
	
	@Test(dataProvider="invalidData",priority=6)
	public void InvalidScenario(String username,String firstname,String lastname,String password,String confirmpassword,String email,String role,String enabled) throws InterruptedException {
		
		InvalidScenario.WithoutValues(driver);
		InvalidScenario.WithSomeData(driver, username, firstname, lastname);
		InvalidScenario.InValidData(driver, username, firstname, lastname, email, role, enabled);
		InvalidScenario.ExistingDataCreate(driver, username, firstname, lastname, password, confirmpassword, email, role, enabled);
		InvalidScenario.ExistingDataVerify(driver, username, firstname, lastname, password, confirmpassword, email, role, enabled);
	
		
	 }
	
	@DataProvider(name="invalidData")
	public String[][] getData1() throws Exception
	{
		String[][] data=XLUtility.getData("InvalidData","TestData.xls");
		
		return data;

	}


}
