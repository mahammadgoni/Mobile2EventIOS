package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;




public class PlayCenter extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Play Center Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By clickOnPlayCenter = By.xpath("//*[@name='Play Center']");
	
	By clickOnQuizMap = By.xpath("//*[@name='Quiz Map']");
	
	By howToPlay = By.xpath("//*[@name='How to play']");
	
	By clickOnProceed = By.xpath("//*[@name='Proceed']");
	
	By selectAnswer = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By selectQuiz = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By progressStatus = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By clickOnMkFriendMap = By.xpath("//*[@name='Making Friend Map']");	
	
	By clickOnLocationMap = By.xpath("//*[@name='Location Map']");
	
	By submitBtn = By.xpath("//*[@name='Double tap to Submit']");
	
	By tryBtn = By.xpath("//*[@name='Double tap to Try Again']");
	
	

	public PlayCenter(WebDriver driver) {
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
		
		System.out.println("Scrolling till Play Center");
							
		Thread.sleep(2000);
		
		System.out.println("Clicking on Play Center");

		waitForClickabilityOf(clickOnPlayCenter);

		driver.findElement(clickOnPlayCenter).click();
		
	}
	
//	Play Quiz Method 
	
	public PlayCenter quizMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Quiz Map");

		waitForClickabilityOf(clickOnQuizMap);

		driver.findElement(clickOnQuizMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Selecting Quiz");

			waitForClickabilityOf(selectQuiz);

			driver.findElement(selectQuiz).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
		Thread.sleep(2000);
		
		System.out.println("Select the Answer");

		waitForClickabilityOf(selectAnswer);

		driver.findElement(selectAnswer).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit Button");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
		
		Thread.sleep(2000);
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(tryBtn).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Quiz Map");
			
		} else {
			
			System.out.println("Failed to Verify the Quiz Map");

		}
			
		
		return new PlayCenter(driver);
		
	}
	
//	Making Friend Method
	
	public PlayCenter makingFriendMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Making Friend");

		waitForClickabilityOf(clickOnMkFriendMap);

		driver.findElement(clickOnMkFriendMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(progressStatus).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Making Friend Map");
			
		} else {
			
			System.out.println("Failed to Verify the Making Friend Map");

		}
		
		
		
		return new PlayCenter(driver);
		
	}
	
	public PlayCenter locationMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Making Friend");

		waitForClickabilityOf(clickOnMkFriendMap);

		driver.findElement(clickOnMkFriendMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(progressStatus).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Location Map");
			
		} else {
			
			System.out.println("Failed to Verify the Location Map");

		}
				
		
		
		return new PlayCenter(driver);
		
	}

}
