package FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFileUploader {

	@Test
	public void TestR(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		driver.findElement(By.id("emailId")).sendKeys("Testesttest1@yahoo.com");
		driver.findElement(By.id("emailRe")).sendKeys("Testesttest1@yahoo.com ");
		driver.findElement(By.id("pwd")).sendKeys("testmukeshselenium ");
		driver.findElement(By.xpath(".//*[@id='formpZero']/div[4]/button")).click();
		System.out.println("Before Frame");
		driver.switchTo().frame("frmUpload");
		System.out.println("after frame");
		String script = "document.getElementById('txtcv').value=' " + "C:/Users/Mukesh_Otwani/Desktop/data.txt" + "';";
       JavascriptExecutor js=  (JavascriptExecutor)driver;
       js.executeScript(script);
	}
}
