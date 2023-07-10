package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.shoppersstack.com/");
	Dimension size=new Dimension(500, 400);
	driver.manage().window().setSize(size);
}
}
