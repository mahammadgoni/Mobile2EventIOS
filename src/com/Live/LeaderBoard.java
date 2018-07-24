package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LeaderBoard extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Leader Board Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By clickOnLeaderBoard = By.xpath("//*[@name='Leaderboard']");
	
	By usersTab = By.xpath("//*[@name='Users']");
	
	By usersPoints = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
	
	By groupTab = By.xpath("//*[@name='Group']");
	
	By groupPoints = By.id("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
	
	By myAchievementsTab = By.xpath("//*[@name='MyAchievements']");
	
	By myPoints = By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCell/XCUIElementTypeStaticText[2]");
	
	By activityNo1 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	
	By activityNo2 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]");
	
	By activityName1 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
	
	By activityName2 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
	

	public LeaderBoard(WebDriver driver) {
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
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board");

		waitForClickabilityOf(clickOnLeaderBoard);

		driver.findElement(clickOnLeaderBoard).click();
		
	}
	
	public LeaderBoard leaderBoardDetails(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
				
		waitForClickabilityOf(usersPoints);
		
		String UserPoints = driver.findElement(usersPoints).getText();
		
		System.out.println("Users Point : "+UserPoints);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Group Tab");
		
		waitForClickabilityOf(groupTab);

		driver.findElement(groupTab).click();
		
		Thread.sleep(2000);
		
		try {
			
			waitForClickabilityOf(groupPoints);
			
			String GroupPoints = driver.findElement(groupPoints).getText();
			
			System.out.println("Groups Point : "+GroupPoints);
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Achievements Tab");

		waitForClickabilityOf(myAchievementsTab);
		
		driver.findElement(myAchievementsTab).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(myPoints);
		
		String MyPoints = driver.findElement(myPoints).getText();
		
		System.out.println("My Achievements Point : "+MyPoints);
		
		Thread.sleep(2000);
		
		try {
			
			waitForClickabilityOf(activityNo1);
			
			String Activity1 = driver.findElement(activityNo1).getText();
			
			System.out.println("My Activity : "+Activity1);
			
			Thread.sleep(2000);
			
			waitForClickabilityOf(activityNo2);
			
			String Activity2 = driver.findElement(activityNo2).getText();
			
			System.out.println("My Activity  : "+Activity2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		String Total = UserPoints+" Points";
		
//		Verify the Condition
		
		if (Total.equals(MyPoints)) {
			
			System.out.println("Successfully Verified Leader Board Details");
			
		} else {
			
			System.out.println("Failed to Verify Leader Board Details");

		}
		
		
		
		return new LeaderBoard(driver);
		
	}

}
