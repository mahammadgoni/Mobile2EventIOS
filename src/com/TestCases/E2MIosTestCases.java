package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Agenda.Exhibitors;
import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Agenda.Sponsors;
import com.Agenda.Survey;
import com.Etc.AllEvents;
import com.Etc.FloorMap;
import com.Etc.Home;
import com.Etc.LocationAndTiming;
import com.Etc.Resources;
import com.Etc.Settings;
import com.Etc.UsefullInfo;
import com.Live.Attendees;
import com.Live.EventQA;
import com.Live.LeaderBoard;
import com.Live.OneToOneMessage;
import com.Live.PlayCenter;
import com.Live.SocialWall;
import com.Login.LoginPage;
import com.Me.Bookmarks;
import com.Me.BusinessCard;
import com.Me.Logout;
import com.Me.MyProfile;
import com.Me.Notes;
import com.Utils.GetScreenShot;
import com.Utils.IOSsetUp;

//Listener to take screen shot

//@Listeners({GetScreenShot.class})

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
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
			
		prepareAndStartAppium();
		
		System.out.println("Executing : Login to Account Test");
		
		new LoginPage(driver).accountLogin(userName, password);
		
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
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Time Test");
		
		new Schedule(driver).time(userName,password, "This is Automation Testing Notes", "Are you adding questions through Automation?");
		
	}
	
	@Test(priority = 5)
	public void scheduleTrackTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Track Test");
		
		new Schedule(driver).tracks(userName,password, "This is Track Test Message", "Is this Track Session?","Track1");
		
	}
	
	@Test(priority = 6)
	public void scheduleMyAgendaTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule My Agenda Test");
		
		new Schedule(driver).myAgenda(userName,password, "This is My Agenda Session Testing Notes", "Is this My Agenda Session?");
		
	}

	
	@Test(priority = 7)
	public void speakerDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Speaker Details Test");
		
		new Speakers(driver).speakerDetails(userName,password);
		
	}
	
	@Test(priority = 8)
	public void exhibitorNameTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Name Test");
		
		new Exhibitors(driver).exhibitorsName(userName,password);
		
	}
	
	@Test(priority = 9)
	public void exhibitorTypeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Type Test");
		
		new Exhibitors(driver).exhibitorType(userName,password);
		
	}
	
	@Test(priority = 10)
	public void sponsorNameTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsor Name Test");
		
		new Sponsors(driver).sponsorsName(userName,password);
		
	}
	
	@Test(priority = 11)
	public void sponsorTypeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsor Type Test");
		
		new Sponsors(driver).sponsorsType(userName,password);
		
	}
	
	@Test(priority = 12)
	public void dropdownPollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Drop Down Polls/Survey Test");
		
		new Survey(driver).surveyDropdownPoll(userName,password);
		
	}
	
	
	@Test(priority = 13)
	public void freeTextPollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Free Text Polls/Survey Test");
		
		new Survey(driver).surveyFreeTextPoll(userName,password);
		
	}
	
	
	@Test(priority = 14)
	public void multiplePollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Multiple Polls/Survey Test");
		
		new Survey(driver).surveyMultiplePoll(userName,password);
		
	}
	
	
	@Test(priority = 15)
	public void singlePollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Single Polls/Survey Test");
		
		new Survey(driver).surveySinglePoll(userName,password);
		
	}
	
	@Test(priority = 16)
	public void attendeeDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
				
		prepareAndStartAppium();
		
		System.out.println("Executing : Attendee Details Test");
		
		new Attendees(driver).attendeeDetails(userName,password, "One");
		
	}
	
	@Test(priority = 17)
	public void socialWallTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Social Wall Posting Test");
		
		new SocialWall(driver).socialWall(userName,password, "This is Automation IOS Testing Comment");	
		
	}
	
	@Test(priority = 18)
	public void oneToOneMsgTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : One To One Message Test");
		
		new OneToOneMessage(driver).oneToOneMsg(userName,password, "We will meet soon");
		
	}	
	
	@Test(priority = 19)
	public void leaderBoardTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Leader Board Test");
		
		new LeaderBoard(driver).leaderBoardDetails(userName,password);
					
	}
	
	@Test(priority = 20)
	public void eventQATest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Event QA Test");
		
		new EventQA(driver).eventQA(userName,password,"Is this Ios Automation?");
					
	}
	
	@Test(priority = 21)
	public void quizMapTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Quiz Map Test");
		
		new PlayCenter(driver).quizMap(userName,password);
					
	}
	
	@Test(priority = 22)
	public void locationMapTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Location Map Test");
		
		new PlayCenter(driver).locationMap(userName,password);
					
	}
	
	@Test(priority = 23)
	public void makingFriendMapTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Making Friend Map Test");
		
		new PlayCenter(driver).makingFriendMap(userName,password);
					
	}
	
	@Test(priority = 24)
	public void bookmarkTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Bookmark Test");
		
		new Bookmarks(driver).bookmarked(userName,password);
					
	}
	
	@Test(priority = 25)
	public void addNoteTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Add Note Test");
		
		new Notes(driver).addNote(userName,password,"IOS Delivery Note");
					
	}
	
	@Test(priority = 26)
	public void myProfileTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : My Profile Test");
		
		new MyProfile(driver).editMyProfile(userName,password, "Manager", "Spiders Inc", "8687657890", "IOS Description for My Profile");
					
	}
	
	@Test(priority = 27)
	public void logoutTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : log Out Test");
		
		new Logout(driver).logoutCheck(userName,password);
					
	}
	
	@Test(priority = 28)
	public void businessCardTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Business Card Verify Test");
		
		new BusinessCard(driver).businessCardVerify(userName,password);
					
	}
	
	@Test(priority = 29)
	public void locationAndTimingTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Location And Timing Test");
		
		new LocationAndTiming(driver).locationAndTiming(userName,password);
					
	}
	
	@Test(priority = 30)
	public void resourceTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Resource Test");
		
		new Resources(driver).resources(userName,password,"This is Mac reporting through Automation");
					
	}
	
	@Test(priority = 31)
	public void usefullInfoTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Usefull Info Test");
		
		new UsefullInfo(driver).viweUsefulInfo(userName,password);
					
	}
	
	@Test(priority = 32)
	public void viewFloorMapTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : View Floor Map Test");
		
		new FloorMap(driver).viewFloorMap(userName,password);
					
	}
	
	@Test(priority = 33)
	public void wayFinderTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Way Finder Test");
		
		new FloorMap(driver).wayFinder(userName,password);
					
	}
	
	@Test(priority = 34)
	public void aboutAppTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : About App Test");
		
		new Settings(driver).aboutApp(userName,password);
					
	}
	
	@Test(priority = 35)
	public void refreshTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Refresh the App Test");
		
		new Settings(driver).refreshData(userName,password);
					
	}
	
	@Test(priority = 36)
	public void homeTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : Home Verify Test");
		
		new Home(driver).home(userName,password);
					
	}
	
	@Test(priority = 37)
	public void allEventsTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);

		prepareAndStartAppium();
		
		System.out.println("Executing : All Events Test");
		
		new AllEvents(driver).allEvents(userName,password);
					
	}
	
	
	

}
