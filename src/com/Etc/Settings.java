package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Settings extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Settings Elements
	
	By clickOnEtc = By.xpath("//*[@name='Etc.']");
	
	By clickOnSettings = By.xpath("//*[@name='Settings']");
	
	By aboutApp = By.xpath("//*[@name='About App']");
	
	By aboutTitle = By.xpath("//*[@name='About App']");
	
	By refreshData = By.xpath("//*[@name='Refresh Data']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	
	

	public Settings(WebDriver driver) {
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
		
		System.out.println("Clicking on Settings");

		waitForClickabilityOf(clickOnSettings);

		driver.findElement(clickOnSettings).click();
		
	}
	
	public Settings refreshData(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Refresh Data ");

		waitForClickabilityOf(refreshData);

		driver.findElement(refreshData).click();
		
		Thread.sleep(2000);
		
		boolean Info = driver.findElement(refreshData).isDisplayed();
		
//		Verifying the Details
		
		if (Info==false) {
			
			System.out.println("Successfully Refreshed the Data");
			
		} else {
			
			System.out.println("Failed to Refresh the Data");

		}
		
		
		
		
		return new Settings(driver);
	}
	
	public Settings aboutApp(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on About App");

		waitForClickabilityOf(aboutApp);

		driver.findElement(aboutApp).click();
		
		Thread.sleep(2000);
		
		String Title = driver.findElement(aboutTitle).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Details
		
		if (Title.equals("About")) {
			
			System.out.println("Successfully Verified About App details");
			
		} else {
			
			System.out.println("Failed to verify the About App Details");

		}
		
		
		return new Settings(driver);
	}

}
