package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Schedule extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By forgotPassBtn = By.xpath("//*[@name='Double tap to Forgot password?']");
		
	By menu = By.xpath("//*[@name='Menu']");
	
	By submitBtn = By.xpath("//*[@name='Submit']");
	
//	Schedule Elements
	
	By clickOnAgenda = By.xpath("//*[@name='Agenda']");
	
	By clickOnSchedule = By.xpath("//*[@name='Schedule']");
	
	By timeTab = By.xpath("//*[@name='Time']");
	
	By nextDate = By.xpath("//*[@name='Double tap for next']");
	
	By session1st = By.xpath("//XCUIElementTypeCell[1]");
	
	By bookmark = By.xpath("//*[@name=\"Bookmark\"]");
	
	By addToCalender = By.xpath("//*[@name='Add To Calendar']");
	
	By rate = By.xpath("//*[@name='Rate']");
	
	By addRate = By.xpath("//XCUIElementTypeCell");
	
	By addComment = By.xpath("//*[@value='Comment']");
	
	By submitCmnt = By.xpath("//*[@name='Double tap to submit']");
	
	By okBtn = By.xpath("//*[@name='OK']");
	
	By cancleRate = By.xpath("//*[@name='Double tap to close']");
	
	By takeNotes = By.xpath("//*[@name='Take Notes']");
	
	By addNote = By.xpath("//*[@name='Enter Note']");
	
	By addNotePlusBtn = By.xpath("//*[@name='Double tap to Add Note']");
	
	By saveNote = By.xpath("//*[@name='Save']");
	
	By askAQuestion = By.xpath("//*[@name='Ask A Question']");
	
	By addQuestion = By.id("et_ask");
	
	By saveQuestion = By.id("tv_ask");
	
	By vote = By.xpath("//*[@name='Vote']");
	
	By addToAgenda = By.xpath("//*[@text='Add To Agenda']");
	
	By speakersList = By.id("speaker_list_view_title");
	
	By tracksTab = By.xpath("//*[@name='Tracks']");
	
	By tracks1 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By tracks2 = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]");
	
	By select1stTrackSesn = By.xpath("//XCUIElementTypeCell[1]");
	
	By select2ndTrackSesn = By.xpath("//XCUIElementTypeCell[2]");
	
	By clickOnTrackSesn = By.xpath("//*[@type='XCUIElementTypeCell']");
	
	By bookmark1st = By.xpath("//*[@name='Bookmark']");
		
	By myAgendaTab = By.xpath("//*[@name='My Agenda']");
	
	By select1stAgendaSesn = By.xpath("/XCUIElementTypeCell[1]");
	
	By select2ndAgendaSesn = By.xpath("/XCUIElementTypeCell[2]");
	
	By clickOnResource = By.xpath("//*[@name='Resources']");
	
	By clickOn1stResource = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By clickOn2ndResource = By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
	
	By shareResource = By.xpath("//*[@name='Double tap to Share']");
	
	By addNoteToResouce = By.xpath("//*[@name='Double tap to Add Note']");
	
	By enterNote = By.xpath("//*[@name='Enter Note']");
	
	By submitNote = By.xpath("//*[@name='Submit']");
	
	By cancelBtn = By.xpath("//*[@name='Cancel']");
	
	By doneBtn = By.xpath("//*[@name='Done']");
	
	

	public Schedule(WebDriver driver) {
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
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(clickOnAgenda);

		driver.findElement(clickOnAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Schedule ");

		waitForClickabilityOf(clickOnSchedule);

		driver.findElement(clickOnSchedule).click();
		
	}
	
//	Checking Time Method
	
	@SuppressWarnings("rawtypes")
	public Schedule time(String userName,String password,String Notes,String Question) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Bookmark This Session");

		waitForClickabilityOf(bookmark);

		driver.findElement(bookmark).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add To Calender");

		waitForClickabilityOf(addToCalender);

		driver.findElement(addToCalender).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Rate");

		waitForClickabilityOf(rate);

		driver.findElement(rate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Take Notes");

		waitForClickabilityOf(takeNotes);

		driver.findElement(takeNotes).click();
		
		Thread.sleep(2000);
		
		System.out.println("Adding Notes");

		waitForClickabilityOf(addNote);

		driver.findElement(addNote).clear();
		
		driver.findElement(addNote).sendKeys(Notes);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Right Simbol to Save Note");

		waitForClickabilityOf(saveNote);

		driver.findElement(saveNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add to Agenda");

		waitForClickabilityOf(addToAgenda);

		driver.findElement(addToAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Vote");

		waitForClickabilityOf(vote);

		driver.findElement(vote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask Question");

		waitForClickabilityOf(askAQuestion);

		driver.findElement(askAQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Addding New Question");

		waitForClickabilityOf(addQuestion);

		driver.findElement(addQuestion).clear();
		
		driver.findElement(addQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask to Add Question");

		waitForClickabilityOf(saveQuestion);

		driver.findElement(saveQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");
		
		boolean CancleBtn = driver.findElement(cancleRate).isDisplayed();

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);		
		
		if (CancleBtn==true) {
			
			System.out.println("Successfully Verified All Schedule Time Elements");
			
		} else {
			
			System.out.println("Failed to Verify All Schedule Time Elements");

		}
			
		
		
		return new Schedule(driver);
		
	}

//	Checking Tracks Method
	
	@SuppressWarnings("rawtypes")
	public Schedule tracks(String userName,String password,String Notes,String Question,String Option) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Tracks Tab");

		waitForClickabilityOf(tracksTab);

		driver.findElement(tracksTab).click();
		
		if (Option.equals("Track1")) {
						
			Thread.sleep(2000);
			
			System.out.println("Clicking on First Track");

			waitForClickabilityOf(tracks1);

			driver.findElement(tracks1).click();
			
		} else {
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Second Track");

			waitForClickabilityOf(tracks2);

			driver.findElement(tracks2).click();

		}
		
		Thread.sleep(2000);
			
		System.out.println("Clicking on Session from Tracks Tab");

		waitForClickabilityOf(select1stTrackSesn);

		driver.findElement(select1stTrackSesn).click();
	
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Bookmark This Session");

			waitForClickabilityOf(bookmark);

			driver.findElement(bookmark).click();
			
		} catch (Exception e) {
			
			System.out.println("It's already Bookmarked");
			
		}
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add To Calender");

		waitForClickabilityOf(addToCalender);

		driver.findElement(addToCalender).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ok Button to Add");

		waitForClickabilityOf(okBtn);

		driver.findElement(okBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Rate");

		waitForClickabilityOf(rate);

		driver.findElement(rate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Take Notes");

		waitForClickabilityOf(takeNotes);

		driver.findElement(takeNotes).click();
		
		Thread.sleep(2000);
		
		try {
			
			boolean AddNote = driver.findElement(addNote).isDisplayed();
			
			System.out.println(AddNote);
			
			if (AddNote==true) {
				
				System.out.println("Adding Notes");

				Thread.sleep(2000);

				waitForClickabilityOf(addNote);

				driver.findElement(addNote).clear();
				
				driver.findElement(addNote).sendKeys(Notes);
				
			} else {
				
				System.out.println("Clicking On PLus Simbol to Add Note");
				
				Thread.sleep(2000);

				waitForClickabilityOf(addNotePlusBtn);

				driver.findElement(addNotePlusBtn).clear();
				
				driver.findElement(addNotePlusBtn).sendKeys(Notes);

			}
			
		} catch (Exception e) {
			
		}
						
		Thread.sleep(2000);
		
		System.out.println("Clicking On Right Simbol to Save Note");

		waitForClickabilityOf(saveNote);

		driver.findElement(saveNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add to Agenda");

		waitForClickabilityOf(addToAgenda);

		driver.findElement(addToAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Vote");

		waitForClickabilityOf(vote);

		driver.findElement(vote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		try {
			
			waitForClickabilityOf(doneBtn);

			driver.findElement(doneBtn).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask Question");

		waitForClickabilityOf(askAQuestion);

		driver.findElement(askAQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Addding New Question");

		waitForClickabilityOf(addQuestion);

		driver.findElement(addQuestion).clear();
		
		driver.findElement(addQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask to Add Question");

		waitForClickabilityOf(saveQuestion);

		driver.findElement(saveQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Question Option");
		
		boolean CancleBtn = driver.findElement(cancleRate).isDisplayed();

		driver.findElement(cancleRate).click();
			
		Thread.sleep(2000);	
		
		if (CancleBtn==true) {
			
			System.out.println("Successfully Verified All Schedule Tracks Elements");
			
		} else {
			
			System.out.println("Failed to Verify Schedule Tracks Elements");

		}
			
		
		return new Schedule(driver);
		
	}
	
//	My Agenda Method
	
	@SuppressWarnings("rawtypes")
	public Schedule myAgenda(String userName,String password,String Notes,String Question) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Agenda Tab ");

		waitForClickabilityOf(myAgendaTab);

		driver.findElement(myAgendaTab).click();
					
		Thread.sleep(2000);
			
		System.out.println("Clicking on Session from Tracks Tab");

		waitForClickabilityOf(select1stAgendaSesn);

		driver.findElement(select1stAgendaSesn).click();
				
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Bookmark This Session");

			waitForClickabilityOf(bookmark);

			driver.findElement(bookmark).click();
			
		} catch (Exception e) {
			
			System.out.println("It's already Bookmarked");
			
		}
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add To Calender");

		waitForClickabilityOf(addToCalender);

		driver.findElement(addToCalender).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ok Button to Add");

		waitForClickabilityOf(okBtn);

		driver.findElement(okBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Rate");

		waitForClickabilityOf(rate);

		driver.findElement(rate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Take Notes");

		waitForClickabilityOf(takeNotes);

		driver.findElement(takeNotes).click();
		
		Thread.sleep(2000);
		
		try {
			
			boolean AddNote = driver.findElement(addNote).isDisplayed();
			
			System.out.println(AddNote);
			
			if (AddNote==true) {
				
				System.out.println("Adding Notes");

				Thread.sleep(2000);

				waitForClickabilityOf(addNote);

				driver.findElement(addNote).clear();
				
				driver.findElement(addNote).sendKeys(Notes);
				
			} else {
				
				System.out.println("Clicking On PLus Simbol to Add Note");
				
				Thread.sleep(2000);

				waitForClickabilityOf(addNotePlusBtn);

				driver.findElement(addNotePlusBtn).clear();
				
				driver.findElement(addNotePlusBtn).sendKeys(Notes);

			}
			
		} catch (Exception e) {
			
		}
						
		Thread.sleep(2000);
		
		System.out.println("Clicking On Right Simbol to Save Note");

		waitForClickabilityOf(saveNote);

		driver.findElement(saveNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add to Agenda");

		waitForClickabilityOf(addToAgenda);

		driver.findElement(addToAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Vote");

		waitForClickabilityOf(vote);

		driver.findElement(vote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		try {
			
			waitForClickabilityOf(doneBtn);

			driver.findElement(doneBtn).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask Question");

		waitForClickabilityOf(askAQuestion);

		driver.findElement(askAQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Addding New Question");

		waitForClickabilityOf(addQuestion);

		driver.findElement(addQuestion).clear();
		
		driver.findElement(addQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask to Add Question");

		waitForClickabilityOf(saveQuestion);

		driver.findElement(saveQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");
		
		boolean CancleBtn = driver.findElement(cancleRate).isDisplayed();

		driver.findElement(cancleRate).click();
			
		Thread.sleep(2000);	
		
		if (CancleBtn==true) {
			
			System.out.println("Successfully Verified All Schedule Tracks Elements");
			
		} else {
			
			System.out.println("Failed to Verify Schedule Tracks Elements");

		}
		
		
		return new Schedule(driver);
		
	}

}
