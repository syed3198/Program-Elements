package pe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.example.com");
		java.util.List<WebElement> images = driver.findElements(By.tagName("img"));
		int brokenImageCount = 0;

		// Loop through the image elements and check if they are broken
		for (WebElement image : images) {
			String src = image.getAttribute("src");
			if (src != null && !src.isEmpty()) {
				int statusCode = getStatusCode(src);
				if (statusCode != 200) {
					brokenImageCount++;
				}
			}
		}

		// Print the number of broken images
		System.out.println("Number of broken images: " + brokenImageCount);

		driver.quit();
	}

	private static int getStatusCode(String url) {
		try {
			java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new java.net.URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			return connection.getResponseCode();
		} catch (Exception e) {
			return -1;
		}
	}

}