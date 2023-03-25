package pe;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteExample {

   public static void main(String[] args) throws Exception {
      // Create instance of Robot class
      Robot robot = new Robot();

      // Get system clip board
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

      // Copy text to clip board
      String textToCopy = "This is the text to be copied";
      Transferable transferable = new StringSelection(textToCopy);
      clipboard.setContents(transferable, null);
      System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://google.com");
     WebElement we=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
    // driver.findElement(By.xpath("//input[@title=\"Search\"]")).click();
  //   Actions act=new Actions(driver);
    // act.sendKeys(Keys.CONTROL,"C",Keys.ENTER);
     we.sendKeys(Keys.CONTROL+"V"+Keys.ENTER);
   
   }
}






































