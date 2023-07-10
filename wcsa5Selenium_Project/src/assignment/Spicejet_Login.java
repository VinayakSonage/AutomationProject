package assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Spicejet_Login {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9874561230");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sonage@2000");
	    
	    Thread.sleep(2000);
	   
	   WebElement traget = driver.findElement(By.xpath("//div[@data-testid='login-submit-btn']"));
       Actions act = new Actions(driver) ;
       act.doubleClick(traget).perform();
	}

}
