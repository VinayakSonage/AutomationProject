package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("http://laptop-cpj9qiie/login.do");
	 driver.findElement(By.name("username")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
	 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	 driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	 WebElement traget = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	 
	 Actions act = new Actions(driver);
	 act.doubleClick(traget).perform();
	 if (traget.isDisplayed()) {
		 Thread.sleep(2000);
		 driver.close();
	}

}
}
