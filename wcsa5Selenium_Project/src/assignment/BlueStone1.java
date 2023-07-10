package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("https://www.bluestone.com/");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[.='Not now']")).click();
 Thread.sleep(2000);
  WebElement target = driver.findElement(By.xpath("//a[text()='Coins '] "));
  Thread.sleep(2000);
 Actions act = new Actions(driver);
  act.moveToElement(target).perform();
 driver.findElement(By.xpath("(//span[.='2 gram'])[3]")).click();
 if (driver.findElement(By.xpath("//h1[.='2 gram 24 KT Lakshmi Gold Coin']")).isDisplayed()) {
	System.out.println("2 gram 24 KT Lakshmi Gold Coin is displayed");
	Thread.sleep(2000);
	driver.quit();
}
 else {
	System.out.println("Exception!!!");
}
}
}
