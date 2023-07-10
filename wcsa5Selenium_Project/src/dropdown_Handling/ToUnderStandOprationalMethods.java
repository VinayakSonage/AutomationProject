package dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderStandOprationalMethods {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
     driver.get("file:///C:/Users/vinay/OneDrive/Desktop/wcsa5Workspace/WebElemets/dropdown.html");
      WebElement multipleSelectDD= driver.findElement(By.id("menu")); 
      Select sel = new Select(multipleSelectDD);
     //isMultiple Method
      boolean result = sel.isMultiple();
      System.out.println(result);
     
      //getOPtions Method
      List<WebElement> ops = sel.getOptions();
      for(WebElement we: ops)
      {
    	  System.out.println(we.getText());
      }  
      System.out.println();
      for(int i=0;i<ops.size();i++) {
    	 System.out.println(ops.get(i).getText()); 
    	 
      }
}
}
