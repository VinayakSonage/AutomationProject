package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	 WebElement src1 = driver.findElement(By.xpath("//a[.=' BANK ']"));
	 WebElement src2 = driver.findElement(By.xpath("//a[.=' SALES ']"));
	 WebElement src3 = driver.findElement(By.xpath("//a[.=' 5000']"));
	 WebElement src4 = driver.findElement(By.xpath("//a[.=' 5000']"));
	 
	 WebElement traget1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	 WebElement traget2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	 WebElement traget3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	 WebElement traget4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

          Actions act = new Actions(driver);
          Thread.sleep(2000);
          act.dragAndDrop(src2, traget3).perform();
          
          Thread.sleep(2000);
          act.dragAndDrop(src3, traget4).perform();
          
          Thread.sleep(2000);
          act.dragAndDrop(src4, traget2).perform();
          
          
          
          Thread.sleep(2000);
          act.dragAndDrop(src1, traget1).perform();
          if (driver.findElement(By.xpath("//a[.='Perfect!']")).isDisplayed()) {
			System.out.println("drag and drop is done");
			 Thread.sleep(2000);
			 driver.close();
		}
          else {
			System.out.println("Exception !!");
		}
       
          
}
}
