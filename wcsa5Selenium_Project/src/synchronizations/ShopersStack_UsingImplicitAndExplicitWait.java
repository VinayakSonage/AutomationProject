package synchronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopersStack_UsingImplicitAndExplicitWait {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	 driver.get("https://www.shoppersstack.com/");
	 
	driver.findElement(By.xpath("//img[@alt='Men kurta']")).click();

driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']"))).click();
}
}
