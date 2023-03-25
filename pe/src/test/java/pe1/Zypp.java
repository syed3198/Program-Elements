package pe1;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Zypp {

	public static void main(String[] args) {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "android device");
	        capabilities.setCapability("platformName", "android");
	        capabilities.setCapability("appPackage", "com.android.camera2");
	        capabilities.setCapability("appActivity", "com.android.camera.CameraActivity");
	        capabilities.setCapability("noReset", true);

	        try {
	            AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
	            driver.findElement(By.id("shutter_button")).click(); // capture image
	            Thread.sleep(2000); // wait for the image to be captured
	            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            // perform visual comparison of captured image with reference image
	            // ...
	            driver.quit();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	}


