package OtherBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class TestHTML1 {

	@Test
	public void Testbrowser(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
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
       
       driver.findElement(By.id("emailId")).sendKeys("testautomation17@gmail.com");
       driver.findElement(By.id("emailRe")).sendKeys("testautomation17@gmail.com");
       driver.findElement(By.id("pwd")).sendKeys("testautomation17@gmail.com");
       driver.findElement(By.xpath(".//*[@id='formpZero']/div[4]/button")).click();
       
       driver.findElement(By.xpath(".//*[@id='cname']")).sendKeys("Test Automation 17");
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("scroll(0, 250)");
        System.out.println("Before Frame");
       driver.switchTo().frame(0);
       System.out.println("After Frame");
       
       	driver.findElement(By.xpath("//*[@type='file']")).click();
	}
	
}
