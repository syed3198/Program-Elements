package pe;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());

		int countOfLinks = links.size();
		List<String> hrefList = new ArrayList();
		List<String> blList = new ArrayList<>();
		String s=links.get(0).getText();
		//System.out.println(s);
		try {
			for (WebElement we : links) {
				String s1=we.getAttribute("href");
					if(s1==null) {
					
					}
					else {
						hrefList.add(s1);
					}
					
				}
			
			for (int i = 0; i < hrefList.size(); i++) {

				try {
					if (links.get(i).isEnabled()) {
						URL url = new URL(hrefList.get(i));
						HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
						httpURLConnect.setConnectTimeout(5000);
						httpURLConnect.connect();
						int responseCode = httpURLConnect.getResponseCode();
						if (responseCode > 200) {
							blList.add(hrefList.get(i));
						}

					}

				} catch (Exception e2) {
					blList.add(hrefList.get(i));

				}
			}

			System.out.println("Broken links in webpage :" + blList);

		} catch (Exception e) {

			System.out.println("No broken links found");
		}

		/*
		 * List<String> hrefList = new ArrayList();
		 * 
		 * for (WebElement we : links) { hrefList.add(we.getAttribute("href"));
		 * 
		 * }
		 * 
		 * List<String> str = new ArrayList<>(); for (int i = 0; i < hrefList.size();
		 * i++) { try { if (links.get(i).isEnabled()) { URL url = new
		 * URL(hrefList.get(i)); HttpURLConnection httpURLConnect = (HttpURLConnection)
		 * url.openConnection(); httpURLConnect.setConnectTimeout(5000);
		 * httpURLConnect.connect(); int responseCode =
		 * httpURLConnect.getResponseCode(); if (responseCode >= 400) { brokenLinks++;
		 * 
		 * // System.out.println(url+"The link is broken" + responseCode);
		 * 
		 * } else { unWaken++; // System.out.println(url+"The link is not broken " +
		 * responseCode);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * } catch (Exception e) { bl++; str.add(hrefList.get(i)); //
		 * System.out.println("An error occurred while checking the link: " + //
		 * e.getMessage()); }
		 */
		/*
		 * if (httpURLConnect.getResponseCode() == 200) { System.out.println(url + " - "
		 * + httpURLConnect.getResponseMessage()); } // Fetching and Printing the
		 * response code obtained else { System.out.println(url + "is a broken link");
		 * 
		 * } } } catch (Exception e) { String url = null; System.out.println(url + ":" +
		 * "It is a broken link");
		 * 
		 * }
		 */
	}

}
