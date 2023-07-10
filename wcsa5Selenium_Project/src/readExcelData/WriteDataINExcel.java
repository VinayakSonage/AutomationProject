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

public class WriteDataINExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fie = new FileInputStream("./data/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fie);
	Sheet sheet = wb.getSheet("IPL");
	//wb.createSheet("owner");//create a sheet
	Row row = sheet.getRow(1);
	sheet.createRow(13);
	Cell cell = row.createCell(2);
	cell.setCellValue("pune");
	FileOutputStream fio = new FileOutputStream("./data/TestData1.xlsx");
	wb.write(fio);

}
}
