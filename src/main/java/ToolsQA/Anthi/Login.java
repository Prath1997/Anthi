package ToolsQA.Anthi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	String bpath = "https://www.anthinaturals.com/";
	String username = "prathamesh.4fox@gmail.com";
	String password = "123456";
	
	@BeforeMethod
	public void B() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions acr=new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		 
		
	}
	
	
	@AfterMethod
	public void A() {
		driver.quit();
	}
	
	// valid valid
			@Test (enabled=true, priority=1, groups="login")
			public void valid_valid() throws InterruptedException{
				Actions acr=new Actions(driver);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys(username);			
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys(password);			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				    
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				Thread.sleep(1000);
					
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText(), "Welcome");
				//	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
				}
				
	// valid_Invalid
			@Test (enabled=true, priority=2, groups="login")
			public void valid_Invalid() throws InterruptedException{
			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys(username);			
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("12345678");			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/div[1]/h2[1]")).getText(), "Invalid Email ID or Password");
				//	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
				}	
	

	// Invalid_Invalid
			@Test (enabled=true, priority=3, groups="login")
			public void Invalid_Invalid() throws InterruptedException{
			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("4fox@gmail.com");			
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("12345678");			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/div[1]/h2[1]")).getText(), "Invalid Email ID or Password");
				//	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
				}	

	// Invalid_valid
			@Test (enabled=true, priority=4, groups="login")
			public void Invalid_valid() throws InterruptedException{
			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("4fox@gmail.com");			
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys(password);			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/div[1]/h2[1]")).getText(), "Invalid Email ID or Password");
				//	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
				}	
			
	// Blank_Blank
			@Test (enabled=true, priority=5, groups="login")
			public void Blank_Blank() throws InterruptedException{
			
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys( );			
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys( );			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/p[1]")).getText(), "Please enter valid Email ID,");
				//	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/p[1]")).getText(), "Please enter valid Password");

				}	

	// valid_Blank
			@Test (enabled=true, priority=6, groups="login")
			public void valid_Blank() throws InterruptedException{
			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys(username);			
				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys();			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/p[1]")).getText(), "Please enter valid Password");

				}	

			// Blank_valid
			@Test (enabled=true, priority=7, groups="login")
			public void Blank_valid() throws InterruptedException{
			
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys(username);			
//				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys(password);			
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/p[1]")).getText(), "Please enter valid Email ID,");

				}	

}
