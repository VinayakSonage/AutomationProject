package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidInput {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.chromedriver", "./drivers/chromedriver.exe");
	    WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-cpj9qiie/login.do");
	    
	    Flib flib = new Flib();
//	    String username = flib.validInput("./data/ActiTime.xlsx", "valid", 1, 0);
//	    String password = flib.validInput("./data/ActiTime.xlsx", "valid", 1, 1);
	//    
	    
	    driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx", "valid", 1, 0));
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx", "valid", 1, 1));
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("loginButton")).click();
	}
}
