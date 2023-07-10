package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTaskForFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  
	 
   driver.findElement(By.xpath("//a[@class='gb_d']")).click();
//      driver.switchTo().frame(0);
	  Thread.sleep(2000);
	  WebElement findElement = driver.findElement(By.xpath("//iframe[@name='app']"));
 
	  driver.switchTo().frame(findElement);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='MrEfLc'])[3]")).click();
	  Thread.sleep(5000);
//       driver.switchTo().parentFrame();
////    driver.switchTo().defaultContent();
//	  driver.findElement(By.xpath("(//span[@class='MrEfLc'])[4]")).click();
}
}
