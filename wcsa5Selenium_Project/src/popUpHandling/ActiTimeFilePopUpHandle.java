package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeFilePopUpHandle {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-cpj9qiie/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//td[@class='aligned_radio_button_cell'])[5]")).click();
	Thread.sleep(2000);
	WebElement target = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	Runtime.getRuntime().exec("./AutoItPrograms/fileupload.exe");
	  Thread.sleep(5000);
	    Runtime.getRuntime().exec("./AutoItPrograms/upload1234  .exe");
		
	
}	
}
