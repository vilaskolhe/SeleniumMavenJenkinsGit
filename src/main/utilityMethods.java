package src.main;

import org.openqa.selenium.WebDriver;

public class utilityMethods {
	WebDriver driver=Singlton.getInstance().driver;
	public void launchBrowser(String sURL) {driver.get(sURL);}
	public void maximizeBrowser() {driver.manage().window().fullscreen();}

}
