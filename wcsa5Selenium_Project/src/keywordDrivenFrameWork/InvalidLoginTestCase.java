package keywordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	Flib flib = new Flib(); 
	int rc = flib.lastRowCount(excel_path, "invalid");
    
	
for (int i = 1; i <=rc; i++) {
		dataDrivenFrameWork.Flib flib2 = new dataDrivenFrameWork.Flib();
		driver.findElement(By.name("username")).sendKeys(flib2.readExcelData(excel_path, "invalid", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib2.readExcelData(excel_path, "invalid", i, 1));
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.name("username")).clear();
	}
     bt.closeBrowser();
}
}
