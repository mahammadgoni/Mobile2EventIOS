package com.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class IOSsetUp {
	
	@SuppressWarnings("rawtypes")
	protected static AppiumDriver driver;
	
    String home = System.getProperty("user.dir");
    
    
	String DeviceName = "iPhone 5";
	
//	String UDID = "38A480C3-A32F-4F9A-9474-F22B3A96A0A5";
	
	String UDID = "fb5900c501cd3effb3999fa8999f78045b07d9fe";
	
	String PlatformVersion =  "10.3";

//	String appPath =  "/App/event2mobile.app";
	
//	String appPath =  "/App/e2m.ipa";
	
	String appPath =  "/App/Local Tackle Shop.app";
	
	String appPackageName =  "";
	
	String activityName =  "";
    
//  Method to Start Appium  

    
	@SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium()throws IOException {
		
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
		
		capabilities.setCapability("autoAcceptAlerts", "true");
		
		capabilities.setCapability("autoDismissAlerts", "true");
		
		capabilities.setCapability("bundleId", "com.event2mobile.e2mbeta");
		
		capabilities.setCapability("showIOSLog", true);
		
		capabilities.setCapability("showXcodeLog", true);
		
		capabilities.setCapability("xcodeOrgId", "Md Goni");
		
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		
		capabilities.setCapability("xcodeConfigFile","/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/Configurations/ProjectSettings.xcconfig");

//		capabilities.setCapability("appPackage", appPackageName);

//		capabilities.setCapability("appActivity", activityName);
		
//		capabilities.setCapability("noResetValue", "false");

		driver = new IOSDriver (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}
	

	protected void installApp() throws IOException{
		
		System.out.println("Installing the Application ");
		
		String apkPath =  "";
		
		driver.installApp(home+apkPath);
		
		System.out.println("Successfully Installed the Application ");
		
	}
	
	protected void uninstallApp() throws IOException{
		
		String appPackageName = "";
		
		System.out.println("Uninstalling the Application the Application");
		
		driver.removeApp(appPackageName);
		
		System.out.println("Successfully Uninstalled the Application");
		
		System.out.println("       ");
		
		System.out.println("===============================================");
		
	}

	protected void gotoHome() {
		
		System.out.println("Going Back to Home");

//		driver.pressKeyCode(AndroidKeyCode.BACK);

//		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

	protected void openTheApp() throws IOException {
			
		System.out.println("Opening the App Again to Check the Changed Password");
		
		String appPackageName =  "";
		
		String activityName =  "";

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appPackage", appPackageName);

		caps.setCapability("appActivity", activityName);

	}
	
	public void scrollDown(){
		
		System.out.println("Scrolling Down");
		
		try {
			
//			driver.pressKeyCode(AndroidKeyCode.ACTION_DOWN);
			
//			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_UP);
			
//			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			
		} catch (Exception e) {
			
		}
		

	}
	
	
	
	

}
