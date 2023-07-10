package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	
	//to perform back operation
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	//driver.close();
	
	Thread.sleep(2000);
	
}
}
//"https://www.shoppersstack.com/"