package Actitime;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class actiTIME {
	WebDriver driver;

  @Test
public  void log() throws InterruptedException{
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Servers\\driver2.9\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://localhost:1965/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	driver.findElement(By.id("loginButton")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		e.getMessage();
	}
	
	/*WebElement elefor = (new WebDriverWait(driver, 5))
					  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ext-comp-1001']")));
	Select sel1=new Select(elefor);
	sel1.selectByIndex(1);*/
	
	driver.findElement(By.xpath(".//*[@id='container']/form[1]/table/tbody/tr/td/table[1]/tbody/tr[3]/td[1]/table/tbody/tr/td[9]/nobr/a")).click();
	Thread.sleep(4000);
	String pw=driver.getWindowHandle();
	Set<String> s=driver.getWindowHandles();
	Iterator<String> i=s.iterator();
	while(i.hasNext())
	{
		String cw=i.next();
		if(!pw.equals(cw))
		{
			driver.switchTo().window(cw);
			//WebElement cust=driver.findElement(By.xpath(".//*[@id='container']/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[4]/select"));
			WebElement cust = (new WebDriverWait(driver, 5))
					  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='container']/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[4]/select")));
			Select sel=new Select(cust);
			sel.selectByIndex(1);
			driver.findElement(By.name("customerName")).sendKeys("CMC");
			driver.findElement(By.name("projectName")).sendKeys("Core");
			driver.findElement(By.id("task[0].name")).sendKeys("TC 1 to 10");
			driver.findElement(By.xpath(".//*[@id='ext-gen7']")).click();
		
			driver.findElement(By.xpath(".//*[@id='ext-gen86']/tbody/tr[2]/td/table/tbody/tr[4]/td[3]/a")).click();
	        
			WebElement btype=driver.findElement(By.id("task[0].billingType"));
			Select type=new Select(btype);
			type.selectByIndex(1);
			//end of 1st task
			driver.findElement(By.id("task[1].name")).sendKeys("TC 11 to 20");
			driver.findElement(By.xpath(".//*[@id='ext-gen59']")).click();
			
				
			
			driver.findElement(By.xpath("html/body/div[5]/ul/li/div/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/a")).click();
			WebElement btype1=driver.findElement(By.id("task[1].billingType"));
			Select type1=new Select(btype1);
			type1.selectByIndex(0);
			//end of 2nd task
			
			driver.findElement(By.id("task[2].name")).sendKeys("TC 21 to 30");
			driver.findElement(By.xpath(".//*[@id='ext-gen33']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriverWait wait2 = new WebDriverWait(driver,5);
			WebElement ele2=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ext-gen86']/tbody/tr[2]/td/table/tbody/tr[4]/td[1]/a")));
			ele2.click();
			WebElement btype2=driver.findElement(By.id("task[2].billingType"));
			Select type2=new Select(btype2);
			type2.selectByIndex(1);
			//end of 3rd task
			
			driver.findElement(By.id("task[3].name")).sendKeys("TC 31 to 40");
			driver.findElement(By.xpath(".//*[@id='ext-gen46']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriverWait wait3 = new WebDriverWait(driver,5);
			WebElement ele3=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ext-gen86']/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/a")));
			ele3.click();
			WebElement btype3=driver.findElement(By.id("task[3].billingType"));
			Select type3=new Select(btype3);
			type3.selectByIndex(0);
			//end of 4th task
			
			driver.findElement(By.id("task[4].name")).sendKeys("TC 41 to 50");
			driver.findElement(By.xpath(".//*[@id='ext-gen59']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriverWait wait4 = new WebDriverWait(driver,5);
			WebElement ele4=wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ext-gen86']/tbody/tr[2]/td/table/tbody/tr[4]/td[4]/a")));
			ele4.click();
			WebElement btype4=driver.findElement(By.id("task[4].billingType"));
			Select type4=new Select(btype4);
			type4.selectByIndex(1);
			//driver.findElement(By.xpath(".//*[@id='container']/form[1]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td/input[1]")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			driver.switchTo().window(pw);
			
			
		}
		
		
		
	}
	
}
    @AfterTest  	
  public void Quit(){
	  driver.quit();
  }
}