package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_case2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vsonage2000@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sonage@2000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
}
}
