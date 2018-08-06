package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LocationAndTiming extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Location and Timing Elements
	
	By clickOnEtc = By.xpath("//*[@name='Etc.']");
	
	By clickOnLocation = By.xpath("//*[@name='Location & Timing']");
	
	By popUpBtn = By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton");
		
	By getDirection = By.xpath("//*[@name='Double tap to get direction']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	
	

	public LocationAndTiming(WebDriver driver) {
		super(driver);
		
	}
	
//	Common Login Method
	
	public void commonActivity(String userName,String password) throws InterruptedException{
		
//		System.out.println("Clicking on Your Email ");
//
//		waitForClickabilityOf(emailId);
//
//		driver.findElement(emailId).clear();
//
//		System.out.println("Entering the Email  :" + userName);
//
//		driver.findElement(emailId).sendKeys(userName);
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking on Proceed Button ");
//
//		waitForClickabilityOf(proceedBtn1);
//
//		driver.findElement(proceedBtn1).click();
//		
//		Thread.sleep(2000);
//
//		System.out.println("Entering the Pin  :" + password);
//
//		waitForClickabilityOf(pass);
//		
//		driver.findElement(pass).clear();
//
//		driver.findElement(pass).sendKeys(password);
//		
//		Thread.sleep(2000);
//		
//		System.out.println("Clicking on Proceed Button ");
//
//		waitForClickabilityOf(proceedBtn2);
//
//		driver.findElement(proceedBtn2).click();
		
		try {
			
			waitForClickabilityOf(backBtn);

			driver.findElement(backBtn).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(clickOnEtc);

		driver.findElement(clickOnEtc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Location and Timing");

		waitForClickabilityOf(clickOnLocation);

		driver.findElement(clickOnLocation).click();
		
	}

//	Location and Timing Method
	
	public LocationAndTiming locationAndTiming(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Pop Up to see the Vanue List");

		waitForClickabilityOf(popUpBtn);

		driver.findElement(popUpBtn).click();
			
		Thread.sleep(2000);
		
		boolean Location = driver.findElement(getDirection).isDisplayed();
		
//		Verifying the Details
		
		if (Location==true) {
			
			System.out.println("Successfully Verified the Loaction details");
			
		} else {
			
			System.out.println("Failed to verify the Location Details");

		}


		
		
		return new LocationAndTiming(driver);
	}



}
