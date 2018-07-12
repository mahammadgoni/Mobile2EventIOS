package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Sponsors extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name='Menu']");
	
//	Sponsors Elements
	
	By clickOnAgenda = By.xpath("//*[@name='Agenda']");
	
	By clickOnSponsors = By.xpath("//*[@name='Sponsors']");
	
	By clickOnType = By.xpath("//*[@name='Type']");
	
	By clickOnSaveToContact = By.xpath("//*[@name=\"Save to Contacts\"]");
		
	By sponsorsName = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	
	By sponsorsTypeName = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
		
	By sponsorsOneName = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	
	By clickOnBookmark = By.xpath("//*[@name=\"Bookmark\"]");
	
	By clickOnWebsite = By.xpath("//*[@name=\"Website\"]");
	
	By cancelBtn = By.xpath("//*[@name='Cancel']");
	
	By oKBtn = By.xpath("//*[@name='OK']");
	
	

	public Sponsors(WebDriver driver) {
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
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(clickOnAgenda);

		driver.findElement(clickOnAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors ");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();
		
	}
	
//	Sponsors Name Test 
	
	public Sponsors sponsorsName(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		String SpsnsOne = driver.findElement(sponsorsName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Sponsor");

		waitForClickabilityOf(sponsorsName);

		driver.findElement(sponsorsName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Sponsors Details ");
		
		String SpsnsOne1 = driver.findElement(sponsorsOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on OK Button");

		waitForClickabilityOf(oKBtn);

		driver.findElement(oKBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(oKBtn);

		driver.findElement(oKBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Bookmark Sponsors");

		waitForClickabilityOf(clickOnBookmark);

		driver.findElement(clickOnBookmark).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Clicking on Sponsors Website");

			waitForClickabilityOf(clickOnWebsite);

			driver.findElement(clickOnWebsite).click();
			
//			Going Back to Sponsors
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Cancel Button");

			waitForClickabilityOf(cancelBtn);

			driver.findElement(cancelBtn).click();
					
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
				
		System.out.println("Sponsors Name  : "+SpsnsOne1);
		
//		Verifying the Sponsors Details
		
		if (SpsnsOne.equals(SpsnsOne1)) {
			
			System.out.println("Successfully Verified the Sponsors Name");
			
		} else {
			
			System.out.println("Failed to Verify the Sponsors Name");

		}
	
		
		return new Sponsors(driver);
	}
	
//	Exhibitor Type Test Method
	
	public Sponsors sponsorsType(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors Type");

		waitForClickabilityOf(clickOnType);

		driver.findElement(clickOnType).click();
		
		Thread.sleep(2000);
		
		String SpsnsOne = driver.findElement(sponsorsTypeName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Sponsors");

		waitForClickabilityOf(sponsorsTypeName);

		driver.findElement(sponsorsTypeName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Sponsors Details");
		
		String SpsnsOne1 = driver.findElement(sponsorsOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on OK Button");
		
		waitForClickabilityOf(oKBtn);

		driver.findElement(oKBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(oKBtn);

		driver.findElement(oKBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Bookmark Sponsors");

		waitForClickabilityOf(clickOnBookmark);

		driver.findElement(clickOnBookmark).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors Website");

		waitForClickabilityOf(clickOnWebsite);

		driver.findElement(clickOnWebsite).click();
		
//		Going Back to Sponsors
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		Thread.sleep(2000);
			
		System.out.println("Clicking on Cancel Button");

		waitForClickabilityOf(cancelBtn);

		driver.findElement(cancelBtn).click();
		
		System.out.println("Exhibitor Name  : "+SpsnsOne1);
		
//		Verifying the Sponsors Details
		
		if (SpsnsOne.equals(SpsnsOne1)) {
			
			System.out.println("Successfully Verified the Sponsors Type");
			
		} else {
			
			System.out.println("Failed to Verify the Sponsors Type");

		}
		
		
		return new Sponsors(driver);
		
		
	}


}
