package popUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUpHandle {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/confirm.html");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
    driver.switchTo().alert().accept();//--->by using methods chaining
//	Alert al = driver.switchTo().alert();
//	//al.accept();
//	//al.dismiss();
//    System.out.println(al.getText()); 
//    //by using robot class
//    Robot robo = new Robot();
//    robo.keyPress(KeyEvent.VK_ENTER);
//    robo.keyRelease(KeyEvent.VK_ENTER);
}
}
