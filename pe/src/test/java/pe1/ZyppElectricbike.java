package pe1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZyppElectricbike {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability(MobileCapabilityType.UDID, "RZ8T60DLKYZ");
		dc.setCapability("appPackage", "com.zyppdelivery");
		dc.setCapability("appActivity", "in.zypp.mobycy.activity.SplashActivity");	
		dc.setCapability(MobileCapabilityType.SUPPORTS_JAVASCRIPT, true);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability("browserstack.enableCameraImageInjection", "true");

		URL url = new URL(" http://localhost:4725/wd/hub ");
		
        int userInput=1990;
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		Thread.sleep(3000);
		driver.findElement(By.id("com.zyppdelivery:id/imgCalender")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout//android.widget.TextView")).click();
		AndroidElement element=(AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"2017\")"));
		//MobileElement element=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']"));
		/*
		 * org.openqa.selenium.Dimension d=element.getSize(); int height1=d.getHeight();
		 * int width1=d.getWidth(); int x=element.getLocation().getX()+(width1/2); int
		 * y=element.getLocation().getY()+(height1/2);
		 * 
		 * AndroidElement endElement=(AndroidElement) driver.findElement(MobileBy.
		 * AndroidUIAutomator("new UiSelector().text(\"2022\")")); //MobileElement
		 * endElement=(MobileElement) driver.findElement(By.xpath(
		 * "(//android.widget.TextView[@resource-id='android:id/text1'])[6]"));
		 * org.openqa.selenium.Dimension d1=element.getSize(); int
		 * height2=d1.getHeight(); int width2=d1.getWidth(); int
		 * x1=element.getLocation().getX()+(width2/2);; int
		 * y1=element.getLocation().getY()+(height2/2);
		 */
		Dimension screenSize = driver.manage().window().getSize();//Identify screen dimension
		int screenCenter = (int) (screenSize.getWidth()*0.5);//Identify center point of screen for Y axis
		int startPoint = (int) (screenSize.getHeight()*0.5);//Identify beginning point of scroll for X axis
		int endPoint = (int) (screenSize.getHeight()*0.2);//Identify ending point of scroll
		int count = 0;
		int maxSwipeCount=2;

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		//Search Element until it is available on screen. If no, then perform below operations
		while (driver.findElements(By.xpath("")).isEmpty()) {
			Sequence swipe =  new Sequence(finger, 1);

			//Move finger into starting position
			swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), screenCenter, startPoint));

			//Take out finger from screen
			swipe.addAction(finger.createPointerUp(0));

			//Finger moves to End Position
			swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), screenCenter, endPoint));

			//Finger goes up into contact with screen
			swipe.addAction(finger.createPointerDown(0));

			driver.perform(Arrays.asList(swipe));

			
			if(++count >= maxSwipeCount) {
				break;
			}
			if(count >= maxSwipeCount) {
				
			}
			
	}

	}
}
