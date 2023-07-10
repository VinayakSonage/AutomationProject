package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("which browser we want to open !!!");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
    	driver.close();
		}
		else if (browserValue.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.FireFox.driver", "./drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

		}
		else if (browserValue.equalsIgnoreCase("Microsoftedge")) {
			System.setProperty("webdriver.Edge.driver", "./drivers/msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

		}
		else {
			System.out.println("invalid browser");
		}
		}
}
