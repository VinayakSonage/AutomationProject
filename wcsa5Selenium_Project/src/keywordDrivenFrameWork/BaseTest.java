package keywordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class BaseTest extends Flib implements IautoConstant{
	static	WebDriver driver;
	public void openBrowser() throws IOException, InterruptedException {

		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(prop_path, "Browser");
		String actiurl = flib.readPropertyData(prop_path, "Url");

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_key, chrome_path);
			driver=new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(firefox_key, firefox_path);
			driver=new FirefoxDriver();

		}
		else if (browserValue.equalsIgnoreCase("edge")) {
			System.setProperty(edge_key, edge_path);
			driver=new EdgeDriver();

		} 
		
		else {
			System.out.println("Enter the valid browser!!  ");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(actiurl);
		

	}
	public void closeBrowser() {
		driver.quit();
	}
}
