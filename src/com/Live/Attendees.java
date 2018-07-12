package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Attendees extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Attendees Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By clickOnAttendees = By.xpath("//*[@name='Attendees']");
	
	By attendeeNameOne = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	
	By attendeeNameTwo = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]");
	
	By attendeeNameThree = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]");
	
	By attendeeName = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]");
	
	By addToContact = By.xpath("//*[@name=\"Add to Contact\"]");
	
	By sendMsg = By.xpath("//*[@name=\"Chat\"]");
	
	By addToBookmark = By.xpath("//*[@name=\"Double tap to Bookmark\"]");
	
	By viewPoints = By.xpath("//XCUIElementTypeTable/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
	
	By viewPost = By.xpath("//XCUIElementTypeTable/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
	
	By viewPhotos = By.xpath("//XCUIElementTypeTable/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
	
	By genTab = By.xpath("//*[@name=\"General\"]");
	
	By tagTab = By.xpath("//*[@name=\"Tag\"]");
	
	
	
	

	public Attendees(WebDriver driver) {
		super(driver);
		
	}
	
//	Common Login Method
	
	public void commonActivity(String userName,String password) throws InterruptedException{
		
		System.out.println("Clicking on Your Email ");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		System.out.println("Entering the Email  :" + userName);

		driver.findElement(emailId).sendKeys(userName);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn1);

		driver.findElement(proceedBtn1).click();
		
		Thread.sleep(2000);

		System.out.println("Entering the Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Attendees ");

		waitForClickabilityOf(clickOnAttendees);

		driver.findElement(clickOnAttendees).click();
		
	}
	
//	Attendees Verify Method
	
	public Attendees attendeeDetails(String userName,String password,String AttendeeNo) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
//		Storing the Attendees Name 
			
		String Attendee1 = driver.findElement(attendeeNameOne).getText();		
			
		String Attendee2 = driver.findElement(attendeeNameTwo).getText();
					
		String Attendee3 = driver.findElement(attendeeNameThree).getText();
			
		
		if (AttendeeNo.equals("Two")) {
			
			System.out.println("Clicking on Seccond Attendee");

			waitForClickabilityOf(attendeeNameTwo);

			driver.findElement(attendeeNameTwo).click();
			
		} else if (AttendeeNo.equals("Three")) {
			
			System.out.println("Clicking on Third Attendee");

			waitForClickabilityOf(attendeeNameThree);

			driver.findElement(attendeeNameThree).click();
			
		}else {
			
			System.out.println("Clicking on First Attendee");

			waitForClickabilityOf(attendeeNameOne);

			driver.findElement(attendeeNameOne).click();
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add To Contact");

		waitForClickabilityOf(addToContact);

		driver.findElement(addToContact).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Send Message");

		waitForClickabilityOf(sendMsg);

		driver.findElement(sendMsg).click();
		
//		Going Back to Attendee
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Bookmark");

		waitForClickabilityOf(addToBookmark);

		driver.findElement(addToBookmark).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Points");

		waitForClickabilityOf(viewPoints);

		driver.findElement(viewPoints).click();
		
//		Going Back to Attendee
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Post");

		waitForClickabilityOf(viewPost);

		driver.findElement(viewPost).click();
		
//		Going Back to Attendee
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Photos");

		waitForClickabilityOf(viewPhotos);

		driver.findElement(viewPhotos).click();
		
//		Going Back to Attendee
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Tag Tabs");

		waitForClickabilityOf(tagTab);

		driver.findElement(tagTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on General Tabs");

		waitForClickabilityOf(genTab);

		driver.findElement(genTab).click();
		
		Thread.sleep(2000);
		
		String Attendee = driver.findElement(attendeeName).getText();
		
//		Verifying Condition
		
		Thread.sleep(2000);
		
		if (AttendeeNo.equals("Two")) {
			
			if (Attendee.equals(Attendee2)) {
				
				System.out.println("Successfully Verified the Attendee Details");
				
			} else {
				
				System.out.println("Failed to Verify the Attendee Details");

			}
			
		} else if (AttendeeNo.equals("Three")) {
						
			if (Attendee.equals(Attendee3)) {
				
				System.out.println("Successfully Verified the Attendee Details");
				
			} else {
				
				System.out.println("Failed to Verify the Attendee Details");

			}
			
		} else {
			
			if (Attendee.equals(Attendee1)) {
				
				System.out.println("Successfully Verified the Attendee Details");
				
			} else {
				
				System.out.println("Failed to Verify the Attendee Details");

			}

		}
		
		
		
		return new Attendees(driver);
		
	}

}
