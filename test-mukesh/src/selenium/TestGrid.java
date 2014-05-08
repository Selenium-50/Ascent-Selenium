package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGrid {

	
	
	@Test
	public void TestG(){
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		
		WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			driver.get("http://www.google.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
