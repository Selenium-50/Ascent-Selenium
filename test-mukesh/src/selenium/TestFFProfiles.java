package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TestFFProfiles {

	public static void main(String[] args) {
	
//		ProfilesIni p=new ProfilesIni();
//		FirefoxProfile fp=p.getProfile("default");
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("intl.accept_languages", "zh");
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.google.com");
	}

}
