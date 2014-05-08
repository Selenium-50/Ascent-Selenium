package OtherBrowser;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.math.Rational;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

import org.monte.screenrecorder.ScreenRecorder;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class TestHTML {
	private ScreenRecorder screenRecorder;
	@Test
	public void Testbrowser() throws AWTException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		TestHTML obj=new TestHTML();
		
		driver.get("http://www.naukri.com");
       List<WebElement>	links=	driver.findElements(By.tagName("a"));
       List<WebElement>	iframes=	driver.findElements(By.tagName("iframe"));
       List<WebElement>	textboxes=	driver.findElements(By.tagName("input"));
       List<WebElement>	submits=	driver.findElements(By.tagName("hidden"));
       System.out.println(driver.getTitle());
       System.out.println("Number of Hyber Links "+links.size());
       System.out.println("Number of Hyber Links "+iframes.size());
       System.out.println("Number of Hyber Links "+textboxes.size());
       System.out.println("Number of Hyber Links "+submits.size());
       
       driver.findElement(By.id("emailId")).sendKeys("testautomation21@gmail.com");
       driver.findElement(By.id("emailRe")).sendKeys("testautomation21@gmail.com");
       driver.findElement(By.id("pwd")).sendKeys("testautomation21@gmail.com");
       driver.findElement(By.xpath(".//*[@id='formpZero']/div[4]/button")).click();
       
       driver.findElement(By.xpath(".//*[@id='cname']")).sendKeys("Test Automation 17");
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("scroll(0, 250)");
        System.out.println("Before Frame");
       driver.switchTo().frame(0);
       System.out.println("After Frame");
       WebElement cv=driver.findElement(By.xpath("//*[@type='file']"));
      // jse.executeScript("arguments[0].setAttribute('style','arguments[0].setAttribute('style','border: solid 2px red')')",cv);
       jse.executeScript("arguments[0].setAttribute('style','border: solid 2px red; background: pink ')",cv);
       	cv.click();
       	StringSelection path=new StringSelection("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\feb7\\TestShivaProject\\src\\JavaBasics\\Test1.java");
       	
       	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
       	
       	Robot rb=new Robot();
       	rb.keyPress(KeyEvent.VK_ENTER);
     	rb.keyRelease(KeyEvent.VK_ENTER);
     	rb.keyPress(KeyEvent.VK_CONTROL);
     	rb.keyPress(KeyEvent.VK_V);
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	rb.keyRelease(KeyEvent.VK_V);
    	rb.keyPress(KeyEvent.VK_ENTER);
     	rb.keyRelease(KeyEvent.VK_ENTER);
       	}
	
	
	
	
	
}
