package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SocialWall extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Social Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By socialWall = By.xpath("//*[@name='Social Wall']");
	
	By addTopic = By.xpath("//*[@name='create new']");
	
	By addComment = By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeTextView");
	
	By submitComment = By.xpath("//*[@name='Double tap to submit']");
	
	By postedComment = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	
	By backBtn = By.xpath("//*[@name='Back']");
	

	public SocialWall(WebDriver driver) {
		super(driver);
		
	}
	
//	This Login Method will perform Login actions,Just need to call it in Method
	
	public void Login(String userName,String password) throws InterruptedException{
		
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
		
	}
	
	public SocialWall socialWall(String userName,String password,String Comment) throws InterruptedException{
		
		Login(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu to Expand Options");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live Option");
		
		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Social Wall");
		
		waitForClickabilityOf(socialWall);

		driver.findElement(socialWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Topic Button to add Status");
		
		waitForClickabilityOf(addTopic);

		driver.findElement(addTopic).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Status Comment"+Comment);
		
		waitForClickabilityOf(addComment);

		driver.findElement(addComment).sendKeys(Comment);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit to Add  Status Comment");
		
		waitForClickabilityOf(submitComment);

		driver.findElement(submitComment).click();
		
		Thread.sleep(4000);
		
		waitForClickabilityOf(postedComment);
		
		String PostedComment = driver.findElement(postedComment).getText();
		
		Thread.sleep(2000);
			
		if (Comment.equals(PostedComment)) {
			
			System.out.println("Successfully Posted the Comment");
			
		} else {
			
			System.out.println("Failed to Post the Comment");

		}
	
		
		return new SocialWall(driver);
		
	}

}
