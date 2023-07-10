package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/login");
	driver.findElement(By.id("id_userLoginId")).sendKeys("vinayaksonage8853@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("Sonage@2000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(2000);
	
	
	
	driver.close();
}
}
