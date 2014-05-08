package TestCSS;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHuff {

	@Test
	public void TestHuff11(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://hullmansford.qa.dealerconnection.com/new-inventory/");
		driver.findElement(By.xpath(".//*[@id='filters-accordion']/div[2]/div[1]/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div/div[2]/div[2]/div/div[3]/a/i")).click();
}

}