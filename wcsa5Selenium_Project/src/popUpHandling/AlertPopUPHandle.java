package popUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUPHandle {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/alert.html");
	driver.findElement(By.xpath("//button[@type='button']")).click();
//	Robot act = new Robot();
//	Thread.sleep(2000);
//	act.keyPress(KeyEvent.VK_ENTER);
//	act.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(2000);
	
	//handle the popup by using switchTo()
	//driver.switchTo().alert().accept();---->method chaining
	Alert al = driver.switchTo().alert();
//	Thread.sleep(2000);
//	//al.accept();
//	Thread.sleep(2000);
//	al.dismiss();
	
	//System.out.println(al.getText());
}
}
