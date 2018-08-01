package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Resources extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Clicking On Resources Elements
	
	By clickOnEtc = By.xpath("//*[@name='Etc.']");
	
	By clickOnResources = By.xpath("//*[@name='Resources']");
	
	By file1 = By.xpath("(//XCUIElementTypeStaticText[@name='1 File'])[1]");
	
	By clickOnPdf = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
	
	By addNote = By.xpath("//*[@name='Double tap to Add Note']");
	
	By noteListBtn = By.xpath("//*[@content-desc='Note list']");
	
	By noteDetails = By.xpath("//*[@name='Enter Note']");
	
	By saveBtn = By.xpath("//*[@name='Submit']");
	
	By backBtn = By.xpath("(//XCUIElementTypeOther[@name='Back'])[2]");
	
	By okBtn = By.xpath("//XCUIElementTypeButton[@name='OK']");
	
	By shareBtn = By.xpath("//*[@name='Double tap to Share']");
	
	By sharePresentation = By.xpath("//*[@name='Share Presentation']");
	
	By shareNotes = By.xpath("//*[@name='Share presentation notes']");
	
	By sharePreAndNotes = By.xpath("//*[@name='Share presentation with notes']");
	
	
	

	public Resources(WebDriver driver) {
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
		
		System.out.println("Clicking on Resources");

		waitForClickabilityOf(clickOnResources);

		driver.findElement(clickOnResources).click();
		
	}
	
	
	
	public Resources resources(String userName,String password,String Note) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		boolean File = driver.findElement(file1).isDisplayed();
		
		if (File==true) {
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Folder");

			waitForClickabilityOf(file1);

			driver.findElement(file1).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on PDF File");

			waitForClickabilityOf(clickOnPdf);

			driver.findElement(clickOnPdf).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Add Note Button");

			waitForClickabilityOf(addNote);

			driver.findElement(addNote).click();
			
			Thread.sleep(2000);
			
			boolean NoteDetails = driver.findElement(noteDetails).isDisplayed();
			
			if (NoteDetails==true) {
				
				Thread.sleep(2000);
				
				System.out.println("Entering the Note Details");

				waitForClickabilityOf(noteDetails);

				driver.findElement(noteDetails).clear();
				
				driver.findElement(noteDetails).sendKeys(Note);
				
			} else {
				
				Thread.sleep(2000);
				
				System.out.println("Clicking on Add Button");

				waitForClickabilityOf(addNote);

				driver.findElement(addNote).click();
				
				Thread.sleep(2000);
				
				System.out.println("Entering the Note Details");

				waitForClickabilityOf(noteDetails);

				driver.findElement(noteDetails).clear();
				
				driver.findElement(noteDetails).sendKeys(Note);

			}
						
			Thread.sleep(2000);
			
			System.out.println("Clicking on Save Button to Add Note");

			waitForClickabilityOf(saveBtn);

			driver.findElement(saveBtn).click();
						
			Thread.sleep(2000);
			
			System.out.println("Clicking on Back Button");

			waitForClickabilityOf(backBtn);

			driver.findElement(backBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
						
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Presentation");

			waitForClickabilityOf(sharePresentation);

			driver.findElement(sharePresentation).click();
			
			Thread.sleep(2000);
			
			try {
				
				System.out.println("Clicking on OK Button");

				waitForClickabilityOf(okBtn);

				driver.findElement(okBtn).click();
				
			} catch (Exception e) {
				
			}
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Notes");

			waitForClickabilityOf(shareNotes);

			driver.findElement(shareNotes).click();
			
			Thread.sleep(2000);
			
			try {
				
				System.out.println("Clicking on OK Button");

				waitForClickabilityOf(okBtn);

				driver.findElement(okBtn).click();
				
			} catch (Exception e) {
				
			}
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Presentation and Notes");

			waitForClickabilityOf(sharePreAndNotes);

			driver.findElement(sharePreAndNotes).click();
			
			Thread.sleep(2000);
			
			try {
				
				System.out.println("Clicking on OK Button");

				waitForClickabilityOf(okBtn);

				driver.findElement(okBtn).click();
				
			} catch (Exception e) {
				
			}
			
		} else {
			
			System.out.println("There is No Resource file to open");

		}
		
		Thread.sleep(2000);

		waitForClickabilityOf(addNote);

		driver.findElement(addNote).click();
		
		Thread.sleep(2000);
		
		String AddedNote = driver.findElement(By.xpath("//*[@name='"+Note+"']")).getText();
		
		Thread.sleep(2000);
		
		if (AddedNote.equals(Note)) {
			
			System.out.println("Successfully Verified Resource details");
			
		} else {
			
			System.out.println("Failed to verify the Resource Details");

		}
		
		
		
		return new Resources(driver);
	}

}
