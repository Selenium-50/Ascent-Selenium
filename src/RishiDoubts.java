
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RishiDoubts {
	
		public static void main(String[] args) throws InterruptedException {
			
			// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.makemytrip.com");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("//*[contains(text(),'Round Trip')]")).click();
			driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div/div[2]/div/div[3]/div[2]/span/input")).sendKeys("New");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[contains(text(),'New Delhi')]")).click();
			
			
					
		   
		}

		
	}
