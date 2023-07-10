package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
	//System.setProperty("webdriver.FireFox.driver", "./drivers/geckodriver.exe");
WebDriver	driver=new ChromeDriver();
//WebDriver	driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement Use=driver.findElement(By.tagName("input"));
Use.sendKeys("qspider");
}
}
