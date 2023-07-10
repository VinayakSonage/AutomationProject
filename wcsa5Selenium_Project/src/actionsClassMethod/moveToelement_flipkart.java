package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToelement_flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[.='✕']")).click();
    driver.findElement(By.xpath("(//img[@class='_396cs4'])[2]")).click();
     WebElement traget = driver.findElement(By.xpath("//span[.='Men']"));
     Actions act = new Actions(driver);
     act.moveToElement(traget).perform();
}
}
