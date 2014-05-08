package SavithaDoubt;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
@Test
public void Fileupload() throws AWTException, InterruptedException{
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();

	StringSelection sel = new StringSelection("C:\\Users\\Mukesh_Otwani\\Desktop\\1.doc");

	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	System.out.println("selection" +sel);
	
	driver.get("http://my.monsterindia.com/create_account.html");
	Thread.sleep(2000);

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0,350)");
	Thread.sleep(5000);
	driver.findElement(By.id("wordresume")).click();
	Thread.sleep(2000);
	System.out.println("Browse button clicked");
	Robot robot = new Robot();
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

}

}
