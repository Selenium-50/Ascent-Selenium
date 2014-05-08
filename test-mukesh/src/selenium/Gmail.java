

package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gmail{
	
	@Test
	public void TestAndroid(){
		DesiredCapabilities ds=DesiredCapabilities.android();
		
		WebDriver driver=new AndroidDriver();	
		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost:8080/wd/hub/status"), ds);
		//driver.
		driver.get("http://www.facebook.com");
		
		
		
	}
	
	
}