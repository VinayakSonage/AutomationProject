package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLanuchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.Chrome.driver", "./drivers/chormedriver.exe");
		//System.setProperty("webdriver.Edge.driver", "./drivers/msedgedriver.exe");
	WebDriver	driver=new ChromeDriver();
	//driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
    	
		
	}

}
                                                                                                                                                                                                                                       