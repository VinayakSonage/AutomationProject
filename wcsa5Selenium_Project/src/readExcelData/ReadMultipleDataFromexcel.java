package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	//read data from ipl sheet
	
	//implementation of read the data from excel
	//Read multiple value or data from excel sheet by using for loop
	for (int i = 0; i <=10; i++) {
	
	
	
	 FileInputStream fls = new FileInputStream("./data/TestData1.xlsx");
	   Workbook create = WorkbookFactory.create(fls);
	   Sheet sheet = create.getSheet("IPL");
	   Row row = sheet.getRow(i);
	   Cell cell = row.getCell(1);
	   String data = cell.getStringCellValue();
	   Thread.sleep(2000);
	   System.out.println(data);
	//FileOutputStream output = new FileOutputStream("./data/TestData.xlsx");
	}   
}
}
