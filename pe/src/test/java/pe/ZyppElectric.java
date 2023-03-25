package pe;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZyppElectric {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// dc.setCapability(MobileCapabilityType.UDID, "RZ8T60DLKYZ");
		dc.setCapability("appPackage", "com.zyppdelivery");
		dc.setCapability("appActivity", "in.zypp.mobycy.activity.SplashActivity");
		dc.setCapability(MobileCapabilityType.SUPPORTS_JAVASCRIPT, true);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability("browserstack.enableCameraImageInjection", "true");

		URL url = new URL(" http://localhost:4725/wd/hub ");

		int userInput = 1990;


		/*
		 * do { l.add(driver.findElement(By.xpath(
		 * 
		 * 
		 * 
		 * 
		 * } while (!(l.contains(userInput)));
		 */
		/* waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) */
	}

}
