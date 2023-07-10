package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QtalkLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://chat.qspiders.com/");
		 driver.findElement(By.name("number")).sendKeys("8605761806");
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("Sonage@2000");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[.='Submit']")).click();
		 //driver.close();
	}
}
