package xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		Thread.sleep(2000);
	    //driver.close();
}
}
