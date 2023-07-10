package popUpHandling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Way2FileHandlingPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	WebElement uploadfile = driver.findElement(By.xpath("//input[@id='uploadfile']"));
	Actions act = new Actions(driver);
	act.doubleClick(uploadfile).perform();
	File file = new File("./AutoItPrograms/omayo.exe");
	Thread.sleep(2000);
	
	
}
}
