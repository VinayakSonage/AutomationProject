package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://laptop-cpj9qiie/login.do");
 driver.findElement(By.name("username")).sendKeys("admin");
 Thread.sleep(2000);
 driver.findElement(By.name("pwd")).sendKeys("manager");
 Thread.sleep(2000);
 
 driver.findElement(By.id("loginButton")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("logout")).click();
 Thread.sleep(2000);
 //driver.findElement(By.xpath("//body[@class='  ext-chrome']")).click();
 //driver.close();
}
}
