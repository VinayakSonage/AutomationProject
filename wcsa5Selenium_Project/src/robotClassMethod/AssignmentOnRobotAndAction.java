package robotClassMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdrriver.chorme.driver", "./drivers/chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("https://www.bluestone.com/");
  driver.findElement(By.xpath("//span[.='Not now']")).click();
  WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
 
  Actions act = new Actions(driver);
  act.moveToElement(target).perform();
  driver.findElement(By.xpath("//a[.='Band']")).click();
  Thread.sleep(4000);
  WebElement target1 = driver.findElement(By.xpath("(//div[@class='opt-title'])[1]"));
for (int i = 0; i <2; i++) {
	act.doubleClick(target1).perform();
	act.clickAndHold(target1).perform();
}
 
  
//  Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        
        driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        if (driver.findElement(By.xpath("//span[.='1 Designs']")).isDisplayed()) {
        	Thread.sleep(2000);
        	driver.close();
		}
        else {
			System.out.println("Exception !!");
		}
}
}
