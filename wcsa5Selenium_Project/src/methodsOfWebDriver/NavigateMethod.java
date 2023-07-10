package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.shoppersstack.com/");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	
}
}
