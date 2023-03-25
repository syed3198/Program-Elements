package pe1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZyppPilot {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.UDID,"RZ8T60DLKYZ");
		dc.setCapability("appPackage","com.zyppdelivery");
		dc.setCapability("appActivity","in.zypp.mobycy.activity.SplashActivity");
		dc.setCapability("browserstack.user", "rsyedabuthakir_jI7aVk");
		dc.setCapability("browserstack.key", "cQEy6xrzrrrGosnRwufB");
		dc.setCapability("setWebContentsDebuggingEnabled", true);
		/* dc.setCapability("autoGrantPermissions",true); */
		dc.setCapability("autoAcceptAlert",true);
		dc.setCapability(MobileCapabilityType.SUPPORTS_JAVASCRIPT,true);
		dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability("browserstack.enableCameraImageInjection", "true");
		URL url=new URL(" http://localhost:4725/wd/hub ");
		AndroidDriver driver= new AndroidDriver(url,dc);
		Thread.sleep(3000);
		driver.findElement(By.id("com.zyppdelivery:id/btnContinue")).click();
		//dc.setCapability("browserstack.enableCameraImageInjection", "true");
		try {
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			/*
			js.executeScript
			("browserstack_executor: {\"action\":\"cameraImageInjection\", \"arguments\": {\"imageUrl\" : \"media://03c14825ec8327b35e511fcee963047f48668fe8\"}}");
			*/
			driver.executeScript("browserstack_executor: {\"action\":\"cameraImageInjection\", \"arguments\": {\"imageUrl\" : \"media://03c14825ec8327b35e511fcee963047f48668fe8\"}}");
			
			
		}catch(

	Exception e)
	{
		e.printStackTrace();
	}

}}
