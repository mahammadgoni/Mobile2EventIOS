package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Survey extends BaseSetUp{
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Survey Elements
	
	By clickOnAgenda = By.xpath("//*[@name='Agenda']");
	
	By clickOnSurvey = By.xpath("//*[@name='Survey']");
	
//	Drop down Poll Elements
	
	By dropdownPoll = By.xpath("//*[@name='Automation Dropdown Poll Testing']");
	
	By selectAnOption = By.xpath("//*[@name='Select an option']");
	
	By nextQuestion = By.xpath("//*[@name='Next Question']");
	
	By optionOne = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
	By optionTwo = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]");
	
	By optionThree = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]");
	
	By okBtn = By.xpath("//*[@name='OK']");
	
	By previousBtn = By.xpath("//*[@name='Previous Question']");
	
	By btnSubmit = By.xpath("//*[@name='Submit']");
	
	By thanksMsg = By.xpath("//*[@name='Thank You !']");
	
	By morePolls = By.xpath("//*[@name='More Polls/Surveys']");
	
//	Free Text Poll Elements
	
	By freeTextPoll = By.xpath("//*[@name='Automation Free Text Poll Testing']");
	
	By enterFreeText = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
//	Multiple Poll Elements
		
	By multiplePoll = By.xpath("//*[@name='Automation Multiple Poll Testing']");
	
	By mulOptionOne = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]");
	
	By mulOptionTwo = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]");
	
	By mulOptionThree = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]");
	
//	Single Poll Elements
	
	By singlePoll = By.xpath("//*[@name='Automation Single Poll Testing']");
	
	By singlePollOpOne = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]");
	
	By singlePollpTwo = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]");
	
	By doneBtn = By.xpath("//*[@name='Done']");
	
	By backBtn = By.xpath("//*[@name='Back']");
	
	

	public Survey(WebDriver driver) {
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
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(clickOnAgenda);

		driver.findElement(clickOnAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Survey ");

		waitForClickabilityOf(clickOnSurvey);

		driver.findElement(clickOnSurvey).click();
		
	}
	
//	Drop Down Survey Method
	
	public Survey surveyDropdownPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Drop Down Poll Survey ");

		waitForClickabilityOf(dropdownPoll);

		driver.findElement(dropdownPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(optionOne);

		driver.findElement(optionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(optionOne);

		driver.findElement(optionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Dropdown Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Dropdown Polls/Surveys");

		}
		
	
		
		return new Survey(driver);
	}
	
//	Free Text Survey Method
	
	public Survey surveyFreeTextPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Free Text Poll Survey ");

		waitForClickabilityOf(freeTextPoll);

		driver.findElement(freeTextPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Answer for this question");

		waitForClickabilityOf(enterFreeText);

		driver.findElement(enterFreeText).clear();
		
		driver.findElement(enterFreeText).sendKeys("German");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Answer for this question");

		waitForClickabilityOf(enterFreeText);

		driver.findElement(enterFreeText).clear();
		
		driver.findElement(enterFreeText).sendKeys("Germany");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Free Text Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Free Text Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Multiple Survey Method
	
	public Survey surveyMultiplePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Multiple Choice Poll Survey ");

		waitForClickabilityOf(multiplePoll);

		driver.findElement(multiplePoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Multiple Choice Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Multiple Choice Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Single Survey Method
	
	public Survey surveySinglePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Single Poll Survey ");

		waitForClickabilityOf(singlePoll);

		driver.findElement(singlePoll).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(singlePollOpOne);

		driver.findElement(singlePollOpOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(singlePollOpOne);

		driver.findElement(singlePollOpOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(4000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(4000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Single Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Single Polls/Surveys");

		}
		
		
		
		return new Survey(driver);
	}

}
