package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Logout extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On My Profile Elements
	
	By clickOnMe = By.xpath("//*[@name='Me']");
	
	By clickOnLogout = By.xpath("//*[@name='Log out']");
	
	By logoutBtn = By.xpath("//*[@name='Log Out']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	

	public Logout(WebDriver driver) {
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
		
		System.out.println("Clicking on Me ");

		waitForClickabilityOf(clickOnMe);

		driver.findElement(clickOnMe).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Logout");

		waitForClickabilityOf(clickOnLogout);

		driver.findElement(clickOnLogout).click();
		
	}
	
	public Logout logoutCheck(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Yes Button Logout");

		waitForClickabilityOf(logoutBtn);

		driver.findElement(logoutBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Logout from Account");
		
		
		return new Logout(driver);
	}

}
