package assignment;

import java.time.Duration;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToRemoveDuplicateValu {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/DuplicateDropdown.html");
	driver.manage().window().maximize();
	WebElement DropDownOption = driver.findElement(By.id("i20"));
	Select sel = new Select(DropDownOption);
	List<WebElement> opts = sel.getOptions();

//	HashSet<String> hs = new HashSet<String>();
	
	LinkedHashSet<String> hsWithFifo = new LinkedHashSet<String>();
	
	for(int i=0;i<opts.size(); i++){
		System.out.println(opts.get(i).getText());
	//	hs.add(opts.get(i).getText());
		hsWithFifo.add(opts.get(i).getText());
	}
	
	System.out.println("---------------------------------------------------------");
	for(String value:hsWithFifo) {
		System.out.println(value);
	}
//	System.out.println("FIFO---------------------------------------------------------");
//	for(String value:hsWithFifo) {
//		System.out.println(value);
//	}
	
}

}
