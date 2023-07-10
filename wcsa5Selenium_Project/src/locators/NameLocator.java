package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocator {
public static void main(String[] args) {
	
	System.setProperty("webdriver.FireFox.driver", "./drivers/geckodriver.exe");

WebDriver	driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement pwd=driver.findElement(By.name("pass"));
pwd.sendKeys("qspider");
}
}
