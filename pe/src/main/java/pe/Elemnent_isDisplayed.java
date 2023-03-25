package pe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemnent_isDisplayed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		WebElement element =driver.findElement(By.xpath("dfghjkl"));
		System.out.println(element.isDisplayed());
	}

}
