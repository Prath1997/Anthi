package ToolsQA.Anthi;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demooo {
	
	WebDriver driver;
	String bpath = "https://www.anthinaturals.com/";
	
	
	@BeforeMethod
	public void B(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void A() {
		driver.quit();
	}
	
	//Facebook
			@Test (enabled=true, priority=10,groups="social links")
			public void Facebook() throws InterruptedException{
				
				JavascriptExecutor js = (JavascriptExecutor) driver;  
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[3]/div[2]/div[2]/div[3]/a[1]/i[1]")).click();
				Thread.sleep(1000);	
				
				// window handle parent to child
							Set<String> s1=driver.getWindowHandles();
							 Iterator<String> i1=s1.iterator();
							 String mainwindow =i1.next();
							 String ChildWindow=i1.next();
								Thread.sleep(1000);	

				 Assert.assertEquals(driver.switchTo().window(ChildWindow).findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/span[1]/a[1]/span[1]")).getText(), "Anthi: Naturals");
//			System.out.println(driver.switchTo().window(ChildWindow).findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/span[1]/a[1]/span[1]")).getText());
			
			}				
}
