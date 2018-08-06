package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Bookmarks extends BaseSetUp{

	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Bookmark Elements
	
	By clickOnMe = By.xpath("//*[@name='Me']");
	
	By clickOnBookmarks = By.xpath("//*[@name='Bookmarks']");
		
	By clickOnSchedule = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		
	By unBookmark = By.xpath("//*[@name='Double tap to Unbookmark']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	
	
	
	public Bookmarks(WebDriver driver) {
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
		
		System.out.println("Clicking on Bookmarks");

		waitForClickabilityOf(clickOnBookmarks);

		driver.findElement(clickOnBookmarks).click();
		
	}
	
	public Bookmarks bookmarked(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Schedule");

		waitForClickabilityOf(clickOnSchedule);

		driver.findElement(clickOnSchedule).click();
		
//      Verifying Condition 
		
		boolean BookmarkStatus = driver.findElement(unBookmark).isDisplayed();
		
		if (BookmarkStatus==true) {
			
			System.out.println("Successfully Verified the Bookmark Check");
			
		} else {
			
			System.out.println("Failed to Verify the Bookmark Check");

		}
		
		
		return new Bookmarks(driver);
	}

}
