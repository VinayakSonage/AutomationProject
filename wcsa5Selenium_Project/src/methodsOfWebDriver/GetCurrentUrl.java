package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");

	System.out.println(driver.getCurrentUrl());
}
}
