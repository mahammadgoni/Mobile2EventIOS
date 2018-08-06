package com.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class IOSsetUp extends ReadAndWriteTestData{
	
	@SuppressWarnings("rawtypes")
	protected static AppiumDriver driver;
	
    String home = System.getProperty("user.dir");
    
    
    
//  Method to Start Appium  
    
	@SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium()throws IOException {
		
//		Fetching test data for Set up 
		
		String DeviceName = getCellData(1, 0);
		
		String UDID = getCellData(1, 1);
		
		String PlatformVersion =  getCellData(1, 2);
		
		String appPath = getCellData(1, 3);
		
		String BundleId = getCellData(1, 4);
		
		String XcodeOrgId = getCellData(1, 5);
				
//		Property Settings are done here
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		System.out.println("===============================================");

		System.out.println("Setting Up the Device Configuaration ");
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		
		capabilities.setCapability("autoLaunch", true);

		capabilities.setCapability(MobileCapabilityType.UDID, UDID);

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PlatformVersion);

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName);

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		
		capabilities.setCapability(MobileCapabilityType.APP, home+appPath);
		
		capabilities.setCapability("noReset", true);
		
		capabilities.setCapability("wdaLaunchTimeout", 120);
		
		capabilities.setCapability("autoAcceptAlerts", true);
		
		capabilities.setCapability("autoDismissAlerts", true);
		
		capabilities.setCapability("bundleId", BundleId);
		
//		capabilities.setCapability("showIOSLog", true);
		
//		capabilities.setCapability("showXcodeLog", true);
		
		capabilities.setCapability("clearSystemFiles", true);
		
		capabilities.setCapability("xcodeOrgId", XcodeOrgId);
		
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
				
		capabilities.setCapability("startIWDP", true);
		
		capabilities.setCapability("newCommandTimeout", 60);

		driver = new IOSDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}
	

	protected void installApp() throws IOException{
		
		System.out.println("Installing the Application ");
		
		String appPath = getCellData(1, 3);
		
		driver.installApp(home+appPath);
		
		System.out.println("Successfully Installed the Application ");
		
	}
	
	protected void uninstallApp() throws IOException{
				
		System.out.println("Uninstalling the Application the Application");
		
		String BundleId = getCellData(1, 4);
		
		driver.removeApp(BundleId);
		
		System.out.println("Successfully Uninstalled the Application");
		
		System.out.println("       ");
		
		System.out.println("===============================================");
		
	}

	
	
	public void scrollDown(){
		
		System.out.println("Scrolling Down");
			

	}
	
	
	
	

}
