package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class EventQA extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Event QA Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By clickOnEventQA = By.xpath("//*[@name='Event QA']");
	
	By typeAQuestion = By.xpath("//*[@name='Type a question']");
	
	By btnSubmit = By.xpath("//*[@name='submit']");
	
	By okBtn = By.xpath("//*[@name='OK']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	

	public EventQA(WebDriver driver) {
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
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Event QA");

		waitForClickabilityOf(clickOnEventQA);

		driver.findElement(clickOnEventQA).click();
		
	}
	
	public EventQA eventQA(String userName,String password,String Question) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Question");

		waitForClickabilityOf(typeAQuestion);

		driver.findElement(typeAQuestion).clear();
		
		driver.findElement(typeAQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Ok Button");

		waitForClickabilityOf(okBtn);

		driver.findElement(okBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Posted the Question");
		
		
		
		return new EventQA(driver);
	}

}
