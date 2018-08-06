package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class PhotoWall extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@type='XCUIElementTypeTextField']");
	
	By pass = By.xpath("//*[@value='Password']");
	
	By proceedBtn1 = By.xpath("//*[@name='Double tap to Proceed']");
	
	By proceedBtn2 = By.xpath("//*[@name='Double tap to Proceed']");
			
	By menu = By.xpath("//*[@name=\"Menu\"]");
	
//	Photo Wall Elements
	
	By clickOnLive = By.xpath("//*[@name='Live']");
	
	By clickOnPhotoWall = By.xpath("//*[@name='PhotoWall']");
	
	By clickOnCamera = By.xpath("//*[@name='double tap to upload new Photo']");
	
	By takePhoto = By.xpath("//*[@name='Take Photo']");
	
	By existingPhoto = By.xpath("//*[@name='Choose Existing photo']");
	
	By dismiss = By.xpath("//*[@name='Cancel']");
	
	By select1stPhoto = By.xpath("//android.widget.GridView/android.widget.FrameLayout[1]/android.widget.ImageView");
	
	By cropPhoto = By.xpath("//*[@name='Crop']");
	
	By rotatePhoto = By.xpath("//*[@name='Rotate']");
	
	By resetPhoto = By.id("tv_reset");
	
	By proceedBtn = By.id("tv_rightButton");
	
	By imageCaption = By.id("et_image_caption");
	
	By uploadBtn = By.id("tv_rightButton");
	
	By listView = By.xpath("//*[@content-desc='List view']");
	
	By justNow = By.xpath("//*[@name='Just now']");
	
	By likeImage = By.xpath("//*[@content-desc='Like']");
	
	By commentOnImage = By.xpath("//*[@content-desc='Comment']");
	
	By addComments = By.id("ed_add_comments");
	
	By postComment = By.id("btn_send");
	
	By backBtn = By.xpath("//*[@name='Back']");
	
	
	

	public PhotoWall(WebDriver driver) {
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
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Photo Wall");

		waitForClickabilityOf(clickOnPhotoWall);

		driver.findElement(clickOnPhotoWall).click();
		
	}
	
	public PhotoWall photoUpload(String userName,String password,int NoRotaion,String Caption) throws InterruptedException{
		
		commonActivity(userName, password);
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Camera Symbol");

		waitForClickabilityOf(clickOnCamera);

		driver.findElement(clickOnCamera).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Existing Photo");

		waitForClickabilityOf(existingPhoto);

		driver.findElement(existingPhoto).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Photo from Gallery");

		waitForClickabilityOf(select1stPhoto);

		driver.findElement(select1stPhoto).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Crop Image");

		waitForClickabilityOf(cropPhoto);

		driver.findElement(cropPhoto).click();
		
		Thread.sleep(2000);
		
		System.out.println("Rotating the Image "+NoRotaion+" Times");
		
		for (int i = 0; i < NoRotaion; i++) {
			
			waitForClickabilityOf(rotatePhoto);

			driver.findElement(rotatePhoto).click();
			
			Thread.sleep(2000);
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Reset the Image");

		waitForClickabilityOf(resetPhoto);

		driver.findElement(resetPhoto).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Image Caption");

		waitForClickabilityOf(imageCaption);

		driver.findElement(imageCaption).clear();
		
		driver.findElement(imageCaption).sendKeys(Caption);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Upload Button");

		waitForClickabilityOf(uploadBtn);

		driver.findElement(uploadBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On List View");

		waitForClickabilityOf(listView);

		driver.findElement(listView).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Uploaded Image");

		waitForClickabilityOf(justNow);

		driver.findElement(justNow).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Like Button");

		waitForClickabilityOf(likeImage);

		driver.findElement(likeImage).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Comment");

		waitForClickabilityOf(commentOnImage);

		driver.findElement(commentOnImage).click();
		
		Thread.sleep(2000);
		
		System.out.println("Adding Comment On the Image");

		waitForClickabilityOf(addComments);

		driver.findElement(addComments).clear();
		
		driver.findElement(addComments).sendKeys(Caption+" Comment");
		
		Thread.sleep(2000);
		
		System.out.println("Posting the Comment");

		waitForClickabilityOf(postComment);

		driver.findElement(postComment).click();
		
		Thread.sleep(2000);
		
//		Getting the Added comment
		
		waitForClickabilityOf(By.xpath("//*[@text='"+Caption+" Comment']"));
		
		String Comment = driver.findElement(By.xpath("//*[@text='"+Caption+" Comment']")).getText();
		
		Thread.sleep(2000);
				
		if (Comment.equals(Caption+" Comment")) {
			
			System.out.println("Successfully Uploaded the Photo");
			
		} else {
			
			System.out.println("Failed to Upload the Photo");

		}
		
		
		return new PhotoWall(driver);
	}

}
