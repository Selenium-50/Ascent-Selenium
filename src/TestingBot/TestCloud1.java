package TestingBot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCloud1 {

	
	@Test
	public void Test1() throws MalformedURLException{
	
		
	DesiredCapabilities cap= DesiredCapabilities.firefox();
	
	cap.setCapability(CapabilityType.VERSION, "25");
	
	cap.setCapability(CapabilityType.PLATFORM, "WINDOWS");
	
	cap.setCapability("name", "Running on Cloud 4");
	
	WebDriver driver=new RemoteWebDriver(new URL("http://ae4809d76da6964e01f3363f6870dc72:d82c6d8e426c486c3ea13de484ed0453@hub.testingbot.com:4444/wd/hub"), cap);
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("selenium123@gmail.comi");
	
	driver.quit();
	}
	
}
