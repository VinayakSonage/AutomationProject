package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("vinayaksonage8853@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("Sonage@2000");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
//driver.close();

}
}
