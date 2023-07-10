package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidInput {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("http://laptop-cpj9qiie/login.do");
  
 Flib data = new Flib();
 Flib flib = new Flib();
 int rc = data.lastRowCount("./data/ActiTime.xlsx", "invalid");
 for (int i = 1; i <=rc; i++) {
    //to check the Invalid username with valid password

//	 driver.findElement(By.name("username")).sendKeys(data.readInvalidExcelData("./data/ActiTime.xlsx", "invalid", i, 0));
//	 Thread.sleep(2000);
//	 driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx", "valid", 1, 1));
//	 Thread.sleep(2000);
//     driver.findElement(By.id("loginButton")).click();
//      WebElement invalid = driver.findElement(By.name("username"));
//	  invalid.clear();
	  
	  
	 //To check Valid username with invalid password
 
	  driver.findElement(By.name("username")).sendKeys(data.readExcelData("./data/ActiTime.xlsx", "valid", 1, 0));
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(flib.readInvalidExcelData("./data/ActiTime.xlsx", "invalid", i, 1));
		 Thread.sleep(2000);
	     driver.findElement(By.id("loginButton")).click();
	     WebElement username = driver.findElement(By.name("username"));
	     username.clear();

 }
}
}
