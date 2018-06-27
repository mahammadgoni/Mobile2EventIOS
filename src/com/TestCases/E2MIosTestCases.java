package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Login.LoginPage;
import com.Utils.IOSsetUp;

public class E2MIosTestCases extends IOSsetUp{
	
	
	@BeforeClass
	public void setUp() throws IOException{
		
		prepareAndStartAppium();
		
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
		
	}
	
	@AfterSuite
	public void mailReport(){
		
		mailReport();
	}
	
	@Test(priority = 1)
	public void loginToAccountTest() throws IOException, InterruptedException{
			
		prepareAndStartAppium();
		
		System.out.println("Executing : Login to Account Test");
		
		new LoginPage(driver).accountLogin("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 2)
	public void forgotPasswordTest() throws InterruptedException, IOException{
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Forgot Password Test");
		
		new LoginPage(driver).forgotPassword("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 3)
	public void changePasswordTest() throws InterruptedException, IOException{
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Change Password Test");
		
		new LoginPage(driver).changePassword("brucewills@yopmail.com", "#e2m321", "#e2m321");
		
	}
	
	
	

}
