package pom;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  
	@FindBy(xpath="//*[@name='username']") private WebElement usntb;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pwdtb;
	@FindBy(xpath="//*[@name='remember']") private WebElement checkbox;
	@FindBy(xpath="//*[@id='loginButton']")private WebElement loginbutton;
	
    LoginPage(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
 
    
   //Initialization
	public WebElement getUsntb() {
		return usntb;
	}

	public WebElement getPwdtb() {
		return pwdtb;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
    //operational 
   
  
}
