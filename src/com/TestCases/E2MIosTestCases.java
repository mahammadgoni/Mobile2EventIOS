package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Login.LoginPage;
import com.Utils.IOSsetUp;

public class E2MIosTestCases extends IOSsetUp{
	
	
	@BeforeClass
	public void setUp() throws IOException{
		
//		prepareAndStartAppium();
		
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
		
	}
	
	@AfterSuite
	public void mailReport(){
		
		mailReport();
	}
	
	@Test(priority = 1)
	public void loginToAccountTest() throws IOException, InterruptedException{
			
		prepareAndStartAppium();
		
		System.out.println("Executing : Login to Account Test");
		
		new LoginPage(driver).accountLogin("brucewills@yopmail.com", "#e2m321");
		
	}
	
//	@Test(priority = 2)
//	public void forgotPasswordTest() throws InterruptedException, IOException{
//				
////		prepareAndStartAppium();
//		
//		System.out.println("Executing : Forgot Password Test");
//		
//		new LoginPage(driver).forgotPassword("brucewills@yopmail.com", "#e2m321");
//		
//	}
//	
//	@Test(priority = 3)
//	public void changePasswordTest() throws InterruptedException, IOException{
//				
////		prepareAndStartAppium();
//		
//		System.out.println("Executing : Change Password Test");
//		
//		new LoginPage(driver).changePassword("brucewills@yopmail.com", "#e2m321", "#e2m321");
//		
//	}
//	
//	@Test(priority = 4)
//	public void scheduleTimeTest() throws InterruptedException, IOException{
//				
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Schedule Time Test");
//		
//		new Schedule(driver).time("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Notes", "Are you adding questions through Automation?");
//		
//	}
//	
//	@Test(priority = 5)
//	public void scheduleTracksLiveTest() throws InterruptedException, IOException{
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Schedule Tracks Live Test");
//		
//		new Schedule(driver).tracks("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Live Track Session Note", "Is this Live tracks Session?","Live");
//		
//	}
//	
//	@Test(priority = 6)
//	public void scheduleTracksPlatformsTest() throws InterruptedException, IOException{
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Schedule Tracks Platforms Test");
//		
//		new Schedule(driver).tracks("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Platforms Track Session Note", "Is this Platforms tracks Session?","Platforms");
//		
//	}
//	
//	@Test(priority = 7)
//	public void scheduleMyAgendaTabTest() throws InterruptedException, IOException{
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Schedule My Agenda Tab Test");
//		
//		new Schedule(driver).myAgenda("brucewills@yopmail.com", "#e2m321", "This is Automation Testing My Agenda Session Note", "Is this My Agenda Session?");
//		
//	}
//	
//	@Test(priority = 8)
//	public void speakerDetailsTest() throws InterruptedException, IOException{
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Speaker Details Test");
//		
//		new Speakers(driver).speakerDetails("brucewills@yopmail.com", "#e2m321");
//		
//	}
	
	
	

}
