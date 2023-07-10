package takesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
public static void main(String[] args) throws IOException {
	System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://chat.qspiders.com/");
	 
	 EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	 File src = efw.getScreenshotAs(OutputType.FILE);
	 File drse = new File("./ScreenShot/qtalk.png");
     Files.copy(src, drse);
}
}
