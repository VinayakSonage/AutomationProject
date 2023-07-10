package windowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTask {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung moblie");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
	Thread.sleep(2000);
   WebElement findElement = driver.findElement(By.xpath("//iframe[@id='DAsis']"));
   driver.switchTo().frame(findElement);
	driver.findElement(By.id("contextualIngressPt")).click();
	//WebElement target = driver.findElement(By.xpath("//div[text()='Select delivery location']"));
   // Point loc = driver.findElement(By.xpath("//div[text()='Select delivery location']")).getLocation();	  
//    JavascriptExecutor jse = (JavascriptExecutor)driver;
//    Thread.sleep(2000);
//    //jse.executeScript("window.scrollBy(0,300)");
//    // jse.executeScript("arguments[0].scrollIntoView(true)",loc);
////	Actions act = new Actions(driver);
////	act.doubleClick(target).perform();
////	driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("413221");
////	driver.findElement(By.xpath("//span[.='Apply']")).click();
//	Point target = driver.findElement(By.id("add-to-cart-button")).getLocation();
//    jse.executeScript("arguments[0].scrollIntoView(true)", target);
	//	 System.out.println(target);
//          
}
}
