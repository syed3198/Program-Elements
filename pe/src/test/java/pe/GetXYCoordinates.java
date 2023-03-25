package pe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetXYCoordinates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		try {
			WebElement fn=driver.findElement(By.xpath("//button[text()='Click Me']"));
			int Xvalue = fn.getLocation().getX();
			int Yvalue = fn.getLocation().getY();
			System.out.println(Xvalue);
			System.out.println(Yvalue);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error found");
		}
		driver.close();
	}

}
