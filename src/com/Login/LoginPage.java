package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LoginPage extends BaseSetUp{
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
	By profile = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	By logoutBtn = By.xpath("//*[@text='Log out']");
	
//	Change Password Elements
	
	By clickOnMe = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	By myProfile = By.xpath("//android.widget.ImageView[@content-desc='My Profile']");
	
	By changePassword = By.id("ws.e2m.main:id/tv_chang_pass");
	
	By oldPassword = By.xpath("//*[@bounds='[66,492][696,591]']");
	
	By newPassword = By.xpath("//*[@bounds='[66,723][696,822]']");
	
	By confirmPassword = By.xpath("//*[@bounds='[66,954][696,1053]']");
	
	By successMessage = By.xpath("//*[@bounds='[147,528][933,918]']");
	
	By saveBtn = By.xpath("//android.widget.Button[@content-desc='Save']");
	
//	Verify Home Page Elements 
	
	By noOfOptions = By.id("ws.e2m.main:id/item_image");
	

	public LoginPage(WebDriver driver) {
		super(driver);
		
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

}
