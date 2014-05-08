package TestDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class TestDow {
	
	
	
	@Test
	public void TestD(){
		
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("browser.download.dir","C:\\Users\\Mukesh_Otwani\\Desktop");
		fp.setPreference("browser. download. folderList", "2");
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://filehippo.com/download_firefox");
		driver.findElement(By.xpath(".//*[@id='program-header']/div[4]/a[1]")).click();
		
	}

}
