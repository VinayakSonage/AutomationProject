package javaSrciptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentOfJavaScriptExecutor {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://in.puma.com/in/en");
	Robot act = new Robot();
	Thread.sleep(2000);
	act.keyPress(KeyEvent.VK_TAB);
	act.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	act.keyPress(KeyEvent.VK_ENTER);
	act.keyPress(KeyEvent.VK_ENTER);
	Point loc = driver.findElement(By.xpath("(//img[@class='w-full bg-puma-black-800 aspect-1-1'])[2]")).getLocation();
	//System.out.println(loc);
	Thread.sleep(2000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 //jse.executeScript("window.scrollBy("+loc.getX()+","+loc.getY()+")");	
	 	jse.executeScript("arguments[0].scrollIntoView(true)",loc);	
	 	
	
}
}
