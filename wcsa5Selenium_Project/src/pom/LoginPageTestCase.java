package pom;

import java.io.IOException;

public class LoginPageTestCase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.setup();
	Flib flib = new Flib();
	LoginPage logp = new LoginPage(driver);
	
	logp.getUsntb().sendKeys(flib.readPropertyData(prop_path, "Username"));
	
	logp.getPwdtb().sendKeys(flib.readPropertyData(prop_path, "Password"));
	
	logp.getLoginbutton().click();
}
}
