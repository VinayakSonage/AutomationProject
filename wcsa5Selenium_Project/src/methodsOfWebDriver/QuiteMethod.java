package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiteMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	 
	Thread.sleep(3000);
	driver.findElement(By.xpath("\\a[text()='open a popup window']")).click();
	driver.quit();
}
}
