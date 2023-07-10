package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.zomato.com/india");
	 driver.findElement(By.linkText("Sign up")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("agufguya");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("JFUDYVJ");
	 Thread.sleep(2000);
	 
}
}
