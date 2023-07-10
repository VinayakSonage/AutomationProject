package javaSrciptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextBox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/disable.html");
    
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("driver.getElementById('i2').value='manager'");
}
}
