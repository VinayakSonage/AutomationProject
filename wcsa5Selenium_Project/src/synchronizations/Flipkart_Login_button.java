package synchronizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login_button {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath("//button[.='Login']")).click();
	
}
}
