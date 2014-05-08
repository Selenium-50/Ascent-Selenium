package TestDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Testupload {
	
	
	
	@Test
	public void TestD() throws AWTException, InterruptedException{
		
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("browser.download.dir","C:\\Users\\Mukesh_Otwani\\Desktop");
		fp.setPreference("browser. download. folderList", "2");
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mukesh_Otwani/Desktop/Upload.html");
		StringSelection files=new StringSelection("C:\\Users\\Mukesh_Otwani\\Desktop\\1.doc");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(files, null);
		
		driver.findElement(By.xpath(".//*[@id='resume']")).click();
		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
