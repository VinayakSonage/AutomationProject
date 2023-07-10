package homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class WithoutUsingSelectClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
   
	driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/dropdown.html");
    
	 List<WebElement> res = driver.findElements(By.id("menu"));
	 
    for(WebElement obj:res) {
    	if (obj.getText().equals(By.id("menu"))) {
    	System.out.println(obj.getText());	
		}
  
    	
    }
    
    	
    	
   
    }
}
