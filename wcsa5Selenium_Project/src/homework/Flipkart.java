package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptops");
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
Thread.sleep(4000);
//driver.close();
}

}
