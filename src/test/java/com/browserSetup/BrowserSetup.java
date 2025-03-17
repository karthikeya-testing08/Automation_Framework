package com.browserSetup;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	public static WebDriver driver;

	public static void setup() {
		System.out.println("Opening the chrome browser:");

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void navigate(String Url) {
		driver.navigate().to(Url);

	}

	public static void closeWebdriver() {
		driver.close();

	}

}
