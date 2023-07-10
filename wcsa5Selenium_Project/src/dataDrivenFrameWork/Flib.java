package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//Read  the Excel Data for valid
public String readExcelData(String filepath ,String sheetName,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rownumber);
	Cell cell = row.getCell(cellnumber);
	String username = cell.getStringCellValue();
	
	
	return username; 
}
//Read the Invalid  excel Data 
public String readInvalidExcelData(String filepath,String sheetName,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rownumber);
	Cell cell = row.getCell(cellnumber);
	String Invalidusername = cell.getStringCellValue();
	return Invalidusername;
}
//to get the last row count of excel sheet

public int lastRowCount(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	
	
	int lastRowNum = sheet.getLastRowNum();
	return lastRowNum;
}

//to write the in excel file

public void writeDataToExcel(String filepath,String sheetName,int rownumber,int cellnumber,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	
	Row row = sheet.getRow(rownumber);
	Cell cell = row.getCell(cellnumber);
	cell.setCellValue(data);

     FileOutputStream fos = new	FileOutputStream(filepath);
       wb.write(fos);
	
	
}
public String readPropertyData(String proppath,String key) throws IOException {
	FileInputStream fis = new FileInputStream(proppath);
	
	Properties prop = new Properties();
	prop.load(fis);
	
	String data = prop.getProperty(key);
	return data;
}


}
