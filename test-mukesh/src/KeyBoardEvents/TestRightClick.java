package KeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRightClick {

	@Test
	public void TestRigjt() throws Exception{
		
		System.setProperty("webdriver.ie.driver", "C:\\Servers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	
	  WebElement  ele=driver.findElement(By.linkText("Gujarati"));
      JavascriptExecutor js=	(JavascriptExecutor)driver;
    
    js.executeScript("arguments[0].setAttribute('style','border: solid 2px red; background: pink ')",ele);


		//WebDriver  driver=new FirefoxDriver(); 
		
		Actions act=new Actions(driver);
		
		act.contextClick(driver.findElement(By.linkText("Gujarati"))).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
