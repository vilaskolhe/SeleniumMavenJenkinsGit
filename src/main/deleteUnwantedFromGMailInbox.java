package src.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteUnwantedFromGMailInbox {
	WebDriver driver = Singlton.getInstance().driver;
	public void loginToGMail(String sUserName, String sPassword) {
		//Click on Sigh In button
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		
		//Enter Username
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(sUserName);
		//Click next button
		driver.findElement(By.xpath("//span[text()=\"Next\")]")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sPassword);
		
		driver.findElement(By.xpath("//span[text()=\"Next\")]")).click();
		
		driver.findElement(By.xpath("//span/span[text=\"Done\")]")).click();
		
		
	}

}
