package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class FloorMap extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Floor Map Elements
	
	By clickOnEtc = By.xpath("//*[@name='Etc.']");
	
	By clickOnFloorMap = By.xpath("//*[@name='Floor Map']");
	
	By floorMap1stTitle = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]");
	
	By chooseFloorMap = By.xpath("//*[@name='Choose Floor Map']");
	
	By selectFloorMap = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By clickOnDone = By.xpath("//*[@name='Done']");
	
	By wayfinder = By.xpath("//*[@name='Wayfinder button']");
	
	By source = By.xpath("//*[@name='From Your Location']");
	
	By selectSource = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	
	By destination = By.xpath("//*[@name='Choose Destination']");
	
	By selectDestination = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell");
	
	By getDirection = By.xpath("//*[@name='Get Directions']");
	
	By detailRoute = By.xpath("//*[@name='Detail Route']");
	
	

	public FloorMap(WebDriver driver) {
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
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(clickOnEtc);

		driver.findElement(clickOnEtc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Floor Map");

		waitForClickabilityOf(clickOnFloorMap);

		driver.findElement(clickOnFloorMap).click();
		
	}
	
	public FloorMap viewFloorMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Floor Map to see the details");

		waitForClickabilityOf(floorMap1stTitle);
		
		boolean Info = driver.findElement(floorMap1stTitle).isDisplayed();

		driver.findElement(floorMap1stTitle).click();
		
//		Verifying the Details
		
		if (Info==true) {
			
			System.out.println("Successfully Viewed the Floor Map Details");
			
		} else {
			
			System.out.println("Failed to View the Floor Map Details");

		}
		
		
		return new FloorMap(driver);
	}
	
	public FloorMap wayFinder(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Floor Map");

		waitForClickabilityOf(floorMap1stTitle);
		
		driver.findElement(floorMap1stTitle).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Way Finder");

		waitForClickabilityOf(wayfinder);
		
		driver.findElement(wayfinder).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Source");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the Source");

		waitForClickabilityOf(selectSource);
		
		driver.findElement(selectSource).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Destination");

		waitForClickabilityOf(destination);
		
		driver.findElement(destination).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the Destination");

		waitForClickabilityOf(selectDestination);
		
		driver.findElement(selectDestination).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Get Direction");

		waitForClickabilityOf(getDirection);
		
		driver.findElement(getDirection).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Detail Route Pop Up");

		waitForClickabilityOf(detailRoute);
		
		driver.findElement(detailRoute).click();
		
		Thread.sleep(2000);
		
		String Route = driver.findElement(detailRoute).getText();
				
//		Verifying the Details
		
		if (Route.equals("Detail Route")) {
			
			System.out.println("Successfully Verified the Way Finder");
			
		} else {
			
			System.out.println("Failed to verify the Way Finder");

		}
		
		
		return new FloorMap(driver);
		
	}

}
