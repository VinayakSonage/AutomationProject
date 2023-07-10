package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	

static WebDriver  driver;
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the browser !!");
	String browser = sc.nextLine();
	if(browser .equalsIgnoreCase("chrome"))
	{		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
		 driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.easemytrip.com/");
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--disable-notifications");
		WebDriver	 driver = new ChromeDriver(fo);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.easemytrip.com/");
	}
	else if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		ChromeOptions eo = new ChromeOptions();
		eo.addArguments("--disable-notifications");
		WebDriver	 driver = new ChromeDriver(eo);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.easemytrip.com/");
	}
	else {
		System.out.println("in valid browser!!");
	}
	 
	 
}
}
