package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class BusinessCard extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Business Cards Elements
	
	By clickOnMe = By.xpath("//*[@name='Me']");
	
	By clickOnBusinessCards = By.xpath("//*[@name='Business Card']");
	
	By businessCardImage = By.xpath("//XCUIElementTypeCell/XCUIElementTypeImage");
	
	

	public BusinessCard(WebDriver driver) {
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
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Me ");

		waitForClickabilityOf(clickOnMe);

		driver.findElement(clickOnMe).click();
		
		Thread.sleep(2000);
		
	}
	
	public BusinessCard businessCardVerify(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Business Card");

		waitForClickabilityOf(clickOnBusinessCards);

		driver.findElement(clickOnBusinessCards).click();
		
		Thread.sleep(2000);
		
//      Verifying Condition 
		
		boolean Card = driver.findElement(businessCardImage).isDisplayed();
		
		if (Card==true) {
			
			System.out.println("Successfully Verified the Business Card");
			
		} else {
			
			System.out.println("Failed to Verify the Business Card");

		}
		
		
		
		
		
		
		return new BusinessCard(driver);
		
	}
	
}
