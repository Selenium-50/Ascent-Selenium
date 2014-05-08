package JavaScriptExecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

public class JS1 {

	@Test
	public void Test1(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		
	//	WebElement ele=driver.findElement(By.id("u_0_n"));
	//	js.executeScript("arguments[0].click();",ele);
	//	js.executeScript("arguments[0].setAttribute('test java script',ele);");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;   
		WebElement ele=	driver.findElement(By.id(""));		
		js.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'')", ele);
		js.executeScript("document.getElementByID('email').value =arguments[0]", "mukesh");
	}
		
}
