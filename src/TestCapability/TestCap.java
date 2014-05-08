package TestCapability;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCap {
	
	
	@Test
	public void TestFF() throws MalformedURLException{
		
		
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setBrowserName("firefox");
    cap.setPlatform(Platform.WIN8);
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:7890/wd/hub"), cap);
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
		
	}

}
