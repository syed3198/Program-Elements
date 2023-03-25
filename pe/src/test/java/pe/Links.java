package pe;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());
		List<String> hrefList = new ArrayList();
		for (WebElement we : links) {
			hrefList.add(we.getAttribute("href"));
			
		}
		System.out.println(hrefList);
	}
}
