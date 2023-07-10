package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/");
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	driver.close();
}
}
