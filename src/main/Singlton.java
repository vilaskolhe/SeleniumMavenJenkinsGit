package src.main;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlton {

	private static Singlton singltonInstance = null;
	public WebDriver driver;

	private Singlton() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:/Vilas/chromedriver.exe");
			driver = new ChromeDriver();
		} catch (SessionNotCreatedException sessionNotCreatedException) {
			System.setProperty("webdriver.chrome.driver", "C:/Vilas/chromedriver77.exe");
			driver = new ChromeDriver();

		}

	}

	public static Singlton getInstance() {
		// To ensure only one instance is created
		if (singltonInstance == null) {
			singltonInstance = new Singlton();
		}
		return singltonInstance;
	}
}
