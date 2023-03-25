package pe;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// This line will print the number of links and the count of links.
	    int size=links.size();
	    //System.out.println(size);

		List<String> hrefList = new ArrayList();
		List<String> text = new ArrayList();

		for (WebElement we : links) {
			hrefList.add(we.getAttribute("href"));
		text.add(we.getText());

		}
		System.out.println("the size of the link is "+size+" and  "+"Link text is "+text);
		

		/*
		 * for (int i = 0; i < hrefList.size(); i++) {
		 * 
		 * 
		 * 
		 * if (httpURLConnect.getResponseCode() == 200) { System.out.println(url + " - "
		 * + httpURLConnect.getResponseMessage()); } // Fetching and Printing the
		 * response code obtained else { System.out.println(url + "is a broken link");
		 * 
		 * } } } catch (Exception e) { String url = null; System.out.println(url + ":" +
		 * "It is a broken link");
		 * 
		 * }
		 * 
		 * }
		 */

	}
}
