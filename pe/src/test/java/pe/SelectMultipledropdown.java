package pe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipledropdown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("BOOKS")).click();

		WebElement sortbyelement=driver.findElement(By.id("products-orderby"));
		Select select=new Select(sortbyelement);
		List<WebElement> sortbyelements =select.getOptions();
		for (int i = 0; i < sortbyelements.size(); i++) 
		{
			WebElement sortbyelement1=driver.findElement(By.id("products-orderby"));
			Select select1=new Select(sortbyelement1);
			Thread.sleep(2000);
			List<WebElement> sortbyelements1 =select1.getOptions();
			
		}
		driver.close();
		 
	}

}
