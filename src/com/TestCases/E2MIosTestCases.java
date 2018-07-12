package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Agenda.Exhibitors;
import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Agenda.Sponsors;
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
		
//		mailReport();
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
	@Test(priority = 4)
	public void scheduleTimeTest() throws InterruptedException, IOException{
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Time Test");
		
		new Schedule(driver).time("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Notes", "Are you adding questions through Automation?");
		
	}
	
	@Test(priority = 5)
	public void scheduleTrackTest() throws InterruptedException, IOException{
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Track Test");
		
		new Schedule(driver).tracks("brucewills@yopmail.com", "#e2m321", "This is Track Test Message", "Is this Track Session?","Track1");
		
	}
	
	@Test(priority = 6)
	public void scheduleMyAgendaTest() throws InterruptedException, IOException{
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule My Agenda Test");
		
		new Schedule(driver).myAgenda("brucewills@yopmail.com", "#e2m321", "This is My Agenda Session Testing Notes", "Is this My Agenda Session?");
		
	}

	
	@Test(priority = 7)
	public void speakerDetailsTest() throws InterruptedException, IOException{
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Speaker Details Test");
		
		new Speakers(driver).speakerDetails("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 8)
	public void exhibitorNameTest() throws InterruptedException, IOException{
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Name Test");
		
		new Exhibitors(driver).exhibitorsName("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 9)
	public void exhibitorTypeTest() throws InterruptedException, IOException{
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Type Test");
		
		new Exhibitors(driver).exhibitorType("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 10)
	public void sponsorNameTest() throws InterruptedException, IOException{
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsor Name Test");
		
		new Sponsors(driver).sponsorsName("brucewills@yopmail.com", "#e2m321");
		
	}
	
	@Test(priority = 11)
	public void sponsorTypeTest() throws InterruptedException, IOException{
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsor Type Test");
		
		new Sponsors(driver).sponsorsType("brucewills@yopmail.com", "#e2m321");
		
	}
	
	
	

}
