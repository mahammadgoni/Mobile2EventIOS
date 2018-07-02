package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class LoginPage extends BaseSetUp{

	
	By logoutBtn = By.xpath("//*[@name='log out']");
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By forgotPassBtn = By.xpath("//*[@name='Double tap to Forgot password?']");
		
	By menu = By.xpath("//*[@name='Menu']");
	
	By submitBtn = By.xpath("//*[@name='Submit']");
	
	By oKBtn = By.xpath("//*[@name='OK']");
		
//	Change Password Elements
	
	By clickOnMe = By.xpath("//*[@name='Me']");
	
	By myProfile = By.xpath("//*[@name='My Profile']");
	
	By changePassword = By.xpath("//*[@name='Change password']");
	
	By oldPassword = By.xpath("//*[@name='Enter Old password']");
	
	By newPassword = By.xpath("//*[@name='Enter New Password']");
	
	By confirmPassword = By.xpath("//*[@name='Enter Confirm Password']");
	
	By successMessage = By.xpath("//*[@name='Success - you've changed your password']");
	
	By saveBtn = By.xpath("//*[@name='Save']");
	
//	Verify Home Page Elements 
	
	By noOfOptions = By.id("ws.e2m.main:id/item_image");
	

	public LoginPage(WebDriver driver) {
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
		
		
	}
	
//	Login to Account Method
	
	public LoginPage accountLogin(String userName,String password) throws InterruptedException{

		commonActivity(userName, password);

		Thread.sleep(2000);
		
		waitForClickabilityOf(menu);
				
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Successfully Logged in to your Account");
			
		} else {
			
			System.out.println("Failed to Login to your Account");

		}
		
			
		return new LoginPage(driver);
		
	}
	
//	Forgot Password Method
	
	public LoginPage forgotPassword(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Forgot Password Button ");

		waitForClickabilityOf(forgotPassBtn);

		driver.findElement(forgotPassBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering the New Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(menu);
				
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Successfully Logged in to with New Password");
			
		} else {
			
			System.out.println("Failed to Login with New Password");

		}
	
		
		
		return new LoginPage(driver);
		
	}
	
//	Change Password Method
	
	public LoginPage changePassword(String userName,String password,String NewPassword) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Menu Option ");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Me Option ");
		
		waitForClickabilityOf(clickOnMe);

		driver.findElement(clickOnMe).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Profile ");
		
		waitForClickabilityOf(myProfile);

		driver.findElement(myProfile).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Change Password");
		
		waitForClickabilityOf(changePassword);

		driver.findElement(changePassword).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Old Password");
		
		waitForClickabilityOf(oldPassword);

		driver.findElement(oldPassword).clear();
		
		driver.findElement(oldPassword).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Password");
		
		waitForClickabilityOf(newPassword);

		driver.findElement(newPassword).clear();
		
		driver.findElement(newPassword).sendKeys(NewPassword);
		
		Thread.sleep(2000);
		
		System.out.println("Entering Confirm Password");
		
		waitForClickabilityOf(confirmPassword);

		driver.findElement(confirmPassword).clear();
		
		driver.findElement(confirmPassword).sendKeys(NewPassword);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
				
		waitForClickabilityOf(successMessage);
		
		if (driver.findElement(successMessage).isDisplayed()==true) {
			
			System.out.println("Successfully Changed the Password");
			
		} else {
			
			System.out.println("Failed to Change the Password");

		}
				
		
		return new LoginPage(driver);
		
	}
	
//	Verify Home Page Method
	
	public LoginPage homePageVerify(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(4000);
		
		waitForClickabilityOf(menu);
		
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Home Page is Loaded and Verified Properly");
			
		} else {
			
			System.out.println("Failed to Load and Verify the Home Page");

		}
				
		
		return new LoginPage(driver);
		
	}
	
	
	
//	Logout from Account Method
	
	public LoginPage accountLogout(){
		
		System.out.println("Logging out From Account");
		
		waitForClickabilityOf(menu);
		
		driver.findElement(menu).click();
		
		waitForClickabilityOf(logoutBtn);
		
		driver.findElement(logoutBtn).click();
		
		
		return new LoginPage(driver);
		
	}

}
