package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.bluestone.com/");
    driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
    WebElement  traget=driver.findElement(By.xpath("//a[.='Coins ']"));
   Actions act = new Actions(driver);
   act.moveToElement(traget).perform();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[.='1 gram']")).click();
   Thread.sleep(2000);
   if (driver.findElement(By.xpath("//h1[.='1 gram 24 KT Gold Coin']")).isDisplayed()) {
	   driver.close();
	
}
}
}
