package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Puma {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://in.puma.com/in/en");
	driver.findElement(By.xpath("//a[@data-link-name='Men']")).click();
    driver.findElement(By.xpath("(//img[@class='w-full bg-puma-black-800 aspect-1-1'])[17]")).click();
    driver.findElement(By.xpath("//span[.='×']")).click();
    
}

}
