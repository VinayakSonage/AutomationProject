package exception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectOption {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/singleSelectDropdown.html");
	 WebElement ops = driver.findElement(By.name("dropdown"));
	 Select sel = new Select(ops);
	 sel.deselectAll();
//	try {
//		sel.deselectAll();
//	} catch (UnsupportedOperationException e) {
//		
//	System.out.println(e);	
//	
//}
//	finally {
//		System.out.println("hjkdagsjg");
//		System.out.println("gagFUDYQGFYAUFGEQUYG");
//	}
}
}