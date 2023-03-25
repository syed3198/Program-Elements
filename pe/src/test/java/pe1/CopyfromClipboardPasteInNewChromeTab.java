package pe1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class CopyfromClipboardPasteInNewChromeTab {

	public static void main(String[] args) throws Exception { 
		// Set ChromeDriverpath 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  
		  // Create instance of ChromeDriver 
		WebDriver driver = new ChromeDriver();
		  
		  // Navigate to webpage 
		driver.get("https://www.example.com");
		  
		  // Find element with text to copy String textToCopy =
		  driver.findElement(By.xpath("//h1[text()='Example Domain']")).getText();
		  
		  // Open new tab 
		  Actions actions = new Actions(driver);
		  actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().
		  perform();
		  // Switch to new tab
		  ((SafariDriver) driver.switchTo()).newWindow(WindowType.WINDOW);
		  
		 
		  
		  // Paste text into search bar
		  actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().
		  perform(); }


}


