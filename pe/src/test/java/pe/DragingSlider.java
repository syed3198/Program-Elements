package pe;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragingSlider {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://salesdiary.hdfclife.com/TEBTParPortal/portal.do?_pageid=sec_calculatorPage&_portalid=sec#");
       
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(500,500)");
		Thread.sleep(2000);
		
		
		  WebElement slider=driver.findElement(By.
		  xpath("(//div[@class=\"noUi-handle noUi-handle-lower\"])[2]"));
		  Thread.sleep(2000);
		 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement startingElement=driver.findElement(By.xpath("(//label[@class='min'])[1]"));
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement endingElement=driver.findElement(By.xpath("(//label[@class='max'])[1]"));
		
		System.out.println(startingElement.getLocation());
		System.out.println(endingElement.getLocation());
		driver.close();
	}

}
