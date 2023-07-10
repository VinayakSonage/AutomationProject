package synchronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWate {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.instagram.com/?hl=en");
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8605761807");
	
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sonage");

	 driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	 driver.close();
}
}
