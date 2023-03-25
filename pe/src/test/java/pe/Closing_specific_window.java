package pe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_specific_window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		String m = driver.getWindowHandle();
		driver.findElement(By.className("facebook")).click();

		Set<String> w = driver.getWindowHandles();
		for (String h : w) {
			driver.switchTo().window(h);
			String s = driver.getTitle();
			if (s.equalsIgnoreCase("Facebook")) {
				System.out.println("Window title to be closed: " + driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(m);
			driver.quit();

		}
	}
}
