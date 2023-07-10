package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Project {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver	=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-cpj9qiie/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
     driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
     driver.findElement(By.xpath("//input[@value='Create New User']")).click();
}
}
