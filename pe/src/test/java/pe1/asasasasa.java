package pe1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class asasasasa {
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

		AndroidDriver driver = new AndroidDriver(url, dc);
		Thread.sleep(3000);
		driver.findElement(By.id("com.zyppdelivery:id/imgCalender")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout//android.widget.TextView")).click();

		MobileElement element = (MobileElement) driver
				.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']"));

		MobileElement endElement = (MobileElement) driver
				.findElement(By.xpath("//android.widget.Button[@text='CANCEL']"));

		int x1 = element.getLocation().getX();
		int y1 = element.getLocation().getY();

		int x2 = endElement.getLocation().getX();
		int y2 = endElement.getLocation().getY();

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), x1, y1));

		swipe.addAction(finger.createPointerUp(0));

		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), x2, y2));

		swipe.addAction(finger.createPointerDown(0));

	}
}
