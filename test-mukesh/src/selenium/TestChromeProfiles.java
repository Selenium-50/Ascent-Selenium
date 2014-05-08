package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestChromeProfiles {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Servers\\driver2.9\\chromedriver.exe");
	ChromeOptions CP=new ChromeOptions();
	CP.addArguments("--user-data-dir=C:\\Users\\Mukesh_Otwani\\AppData\\Local\\Google\\Chrome\\TestSelenium\\");
	//CP.addArguments("--user-data-dir=C:\\MyChrome");
	
//	CP.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(CP);
	driver.get("https://www.facebook.com");
	}

}
