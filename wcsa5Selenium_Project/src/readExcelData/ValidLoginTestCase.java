package readExcelData;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-cpj9qiie/login.do");
	
	FileInputStream fin = new FileInputStream("./data/ActiTime.xlsx");
	Workbook wb= WorkbookFactory.create(fin);
	Sheet sheet = wb.getSheet("valid");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String valid = cell.getStringCellValue();
	
	Thread.sleep(2000);
	
	FileInputStream fin1 = new FileInputStream("./data/ActiTime.xlsx");
	Workbook wb1= WorkbookFactory.create(fin1);
	Sheet sheet1 = wb1.getSheet("valid");
	Row row1 = sheet1.getRow(1); 
	Cell cell1= row1.getCell(1);
	String password = cell1.getStringCellValue();
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys(valid);
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys(password);
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("loginButton")).click();
}
}
