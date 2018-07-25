package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Notes extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Notes Elements
	
	By clickOnMe = By.xpath("//*[@name='Me']");
	
	By clickOnNotes = By.xpath("//*[@name='Notes']");
		
	By clickOn1stSession = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By addNotesBtn = By.xpath("//*[@name='Double tap to Add Note']");
	
	By addNoteDetails = By.xpath("//*[@name='Enter Note']");
	
	By saveNoteBtn = By.xpath("//*[@name='Save']");
		

	public Notes(WebDriver driver) {
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
		
		System.out.println("Clicking on Notes");

		waitForClickabilityOf(clickOnNotes);

		driver.findElement(clickOnNotes).click();
		
	}
	
	public Notes addNote(String userName,String password,String Note) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOn1stSession);

		driver.findElement(clickOn1stSession).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Note");

		waitForClickabilityOf(addNotesBtn);

		driver.findElement(addNotesBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Note");

		waitForClickabilityOf(addNoteDetails);

		driver.findElement(addNoteDetails).sendKeys(Note);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Note");

		waitForClickabilityOf(saveNoteBtn);

		driver.findElement(saveNoteBtn).click();
		
		Thread.sleep(2000);
		
//      Verifying Condition 
		
		String SentMsg = driver.findElement(By.xpath("//*[@name='"+Note+"']")).getText();
		
		if (SentMsg.equals(Note)) {
			
			System.out.println("Successfully Added One Note");
			
		} else {
			
			System.out.println("Failed to Add the Note");

		}
		
		
		return new Notes(driver);
	}

}
