package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class Exhibitors extends BaseSetUp{
	
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By forgotPassBtn = By.xpath("//*[@name='Double tap to Forgot password?']");
		
	By menu = By.xpath("//*[@name='Menu']");
	
	By submitBtn = By.xpath("//*[@name='Submit']");
	
//	Exhibitors Elements
	
	By clickOnAgenda = By.xpath("//*[@name='Agenda']");
	
	By clickOnExhibitor = By.xpath("//*[@name='Exhibitor']");
	
	By clickOnType = By.xpath("//*[@text='Type']");
	
	By clickOnSaveToContact = By.xpath("//*[@content-desc='Save to contacts']");
	
	By exhibitorOne = By.xpath("//android.view.View[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
	
	By exhibitorName = By.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	
	By exhibitorTypeName = By.xpath("//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
	
	By exhibitorOneName = By.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	
	By clickOnBookmark = By.xpath("//*[@content-desc='Add bookmark']");
	
	By clickOnWebsite = By.xpath("//*[@content-desc='Website']");
	
	By exhibitorType = By.xpath("//*[@bounds='[237,462][826,511]']");
	
	

	public Exhibitors(WebDriver driver) {
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
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(clickOnAgenda);

		driver.findElement(clickOnAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Exhibitors ");

		waitForClickabilityOf(clickOnExhibitor);

		driver.findElement(clickOnExhibitor).click();
		
	}
	
//	Exhibitor Name Test Method
	
	public Exhibitors exhibitorsName(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		String ExbtrOne = driver.findElement(exhibitorName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Exhibitor");

		waitForClickabilityOf(exhibitorName);

		driver.findElement(exhibitorName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Exhibitor Details ");
		
		String ExbtrOne1 = driver.findElement(exhibitorOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Bookmark Exhibitor");

		waitForClickabilityOf(clickOnBookmark);

		driver.findElement(clickOnBookmark).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Clicking on Exhibitor Website");

			waitForClickabilityOf(clickOnWebsite);

			driver.findElement(clickOnWebsite).click();
			
//			Going Back to Exhibitor
			
			Thread.sleep(2000);
			
			driver.navigate().back();
					
		} catch (Exception e) {
			
		}
		
//		Thread.sleep(2000);
				
//		String ExbtrType = driver.findElement(exhibitorType).getText();	
		
		Thread.sleep(2000);
				
		System.out.println("Exhibitor Name  : "+ExbtrOne1);
		
//		System.out.println("Exhibitor Type  : "+ExbtrType);
		
//		Verifying the Exhibitors Details
		
		if (ExbtrOne.equals(ExbtrOne1)) {
			
			System.out.println("Successfully Verified the Exhibitors Name");
			
		} else {
			
			System.out.println("Failed to Verify the Exhibitors Name");

		}

		
		
		return new Exhibitors(driver);
		
	}
	
//	Exhibitor Type Test Method
	
	public Exhibitors exhibitorType(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Exhibitor Type");

		waitForClickabilityOf(clickOnType);

		driver.findElement(clickOnType).click();
		
		Thread.sleep(2000);
		
		String ExbtrOne = driver.findElement(exhibitorTypeName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Exhibitor");

		waitForClickabilityOf(exhibitorTypeName);

		driver.findElement(exhibitorTypeName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Exhibitor Details");
		
		String ExbtrOne1 = driver.findElement(exhibitorOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Bookmark Exhibitor");

		waitForClickabilityOf(clickOnBookmark);

		driver.findElement(clickOnBookmark).click();
		
//		Thread.sleep(2000);
			
//		String ExbtrType = driver.findElement(exhibitorType).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Exhibitor Website");

		waitForClickabilityOf(clickOnWebsite);

		driver.findElement(clickOnWebsite).click();
		
//		Going Back to Exhibitor
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		Thread.sleep(2000);
		
		System.out.println("Exhibitor Name  : "+ExbtrOne1);
		
//		System.out.println("Exhibitor Type  : "+ExbtrType);
		
//		Verifying the Exhibitors Details
		
		if (ExbtrOne.equals(ExbtrOne1)) {
			
			System.out.println("Successfully Verified the Exhibitors Type");
			
		} else {
			
			System.out.println("Failed to Verify the Exhibitors Type");

		}
		
		
		return new Exhibitors(driver);
	}


}
