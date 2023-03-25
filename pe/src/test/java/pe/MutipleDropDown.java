package pe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		WebElement d = driver.findElement(By.id("multiselect1"));
		Select s = new Select(d);
		List<WebElement> t = s.getOptions();
		
		
		if (s.isMultiple()) {
			for (int i = 0; i <t.size(); i++) {
				WebElement d1= driver.findElement(By.id("multiselect1"));
				Select s1 = new Select(d);
				s1.selectByIndex(i);
				Thread.sleep(1000);
			}
			
		}
		else {
			System.out.println("single Silect");
		}
		}
//		System.out.println("Options are: ");
//		for (WebElement i : t) {
//			//Thread.sleep(8000);
//			i.click();
//			System.out.println(i.getText());
//		}
		/*Boolean b = s.isMultiple();
		System.out.println("Boolen value for drodown: " + b);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByVisibleText("Wait Commands");
		Thread.sleep(1000);
		WebElement f = s.getFirstSelectedOption();
		System.out.println("First selected option is: " + f.getText());
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectAll();
		driver.close();*/

	}


