package pe;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkStatus {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HttpURLConnection c= (HttpURLConnection)new URL("https://demowebshop.tricentis.com/").openConnection();
		c.setRequestMethod("HEAD");
		c.connect();
		int r=c.getResponseCode();
		System.out.println("The reponse code is : " +r);
		driver.quit();
	}

	}


