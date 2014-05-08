package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.jetty.http.handler.SetResponseHeadersHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ResumeUplaod {

	@Test
	public void TestUpload() throws Exception{
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Servers\\IE2.40\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		driver.findElement(By.id("emailId")).sendKeys("testselenium23march7780@gmail.com");
	
		driver.findElement(By.id("emailRe")).sendKeys("testselenium23march7780@gmail.com");
		
		driver.findElement(By.id("pwd")).sendKeys("testpassword23marcuuuh69");
		driver.findElement(By.xpath(".//*[@id='formpZero']/div[4]/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='cname']")).sendKeys("test selenium");
		((JavascriptExecutor)driver).executeScript("scroll(0,250)");
		//driver.findElement(By.id("month")).sendKeys("Jan");
		
		
		
		
		// Direct pass
		//driver.findElement(By.id("browsecv")).sendKeys("C:\\Users\\Mukesh_Otwani\\Desktop\\1.docx");
		
	
		StringSelection path=new StringSelection("C:\\Users\\Mukesh_Otwani\\Desktop\\1.doc");
		// Copy  on ClipBorad
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
          System.out.println("Copied To ClipBoard	");

      
          driver.switchTo().frame(0);
          driver.findElement(By.id("browsecv")).click();
		
        Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.id("submitbtn")).click();
	}
	
}
