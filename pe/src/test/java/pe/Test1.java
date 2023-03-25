package pe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class Test1{
   public static void main(String[] args) throws
   MalformedURLException, IOException {
      System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.tutorialspoint.com/questions/index.php");
      // wait of 5 seconds
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      // establish and open connection with URL
      HttpURLConnection c=
      (HttpURLConnection)new
      URL("https://www.tutorialspoint.com/questions/index.php")
      .openConnection();
      // set the HEAD request with setRequestMethod
      c.setRequestMethod("HEAD");
      // connection started and get response code
      c.connect();
      int r = c.getResponseCode();
      System.out.println("Http response code: " + r);
      driver.close();
   }
}