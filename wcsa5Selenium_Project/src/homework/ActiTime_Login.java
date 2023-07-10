package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime_Login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver	=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://laptop-cpj9qiie/login.do");


	System.out.println("test is pass");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
     driver.findElement(By.xpath("//a[@id='loginButton']")).click();


}
}

