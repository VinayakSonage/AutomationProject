package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BlueStoneFrameHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.bluestone.com/");
	  //hidden division popup handle
	  driver.findElement(By.xpath("//span[.='Not now']")).click();
	  Thread.sleep(5000);
   
     //driver.switchTo().frame(5);
	  //by using frame with name or id
//	  driver.switchTo().frame("fc_widget");
//	  driver.findElement(By.id("chat-icon")).click();
	  
	  //by using xpath in frame
	  WebElement findElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	  driver.switchTo().frame(findElement);
	  driver.findElement(By.id("chat-icon")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().defaultContent();
	  
	  
	  driver.findElement(By.id("chat-fc-name")).sendKeys("vinayak");
	  driver.findElement(By.id("chat-fc-email")).sendKeys("vinayak@123gmail.com");
	  driver.findElement(By.id("chat-fc-phone")).sendKeys("8605544621");
 
     
}
}
