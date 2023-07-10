package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
public static void main(String[] args) throws IOException {
	//read the data from config.properties
	FileInputStream fis = new FileInputStream("./data/config.properties");
	
	//Create object for Properties class
	Properties prop = new Properties();
	
	//To ready the read in properties file
	prop.load(fis);
//	String data = prop.getProperty("Browser");
//	System.out.println(data);
	System.out.println(prop.getProperty("Browser"));
	System.out.println(prop.getProperty("Url"));
	System.out.println(prop.getProperty("Username"));
	System.out.println(prop.getProperty("Password"));
}
}
