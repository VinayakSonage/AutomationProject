package javaSrciptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[.='✕']")).click();
Thread.sleep(2000);
 JavascriptExecutor jse = (JavascriptExecutor)driver;
 //scrollDown
 jse.executeScript("window.scrollBy(0,1000)");
 //Scrollup
 Thread.sleep(2000);
 jse.executeScript("window.scrollBy(0,-500)");
}
}
