package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	String parentwindow = driver.getWindowHandle();
	
	Set<String> allwindow = driver.getWindowHandles();
	for (String str : allwindow) {
		if (str.equals(parentwindow)) {
			Thread.sleep(2000);
			driver.close();
		}
	}
}
}
