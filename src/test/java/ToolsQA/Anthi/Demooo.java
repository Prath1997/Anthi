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
	String username = "prathamesh.4fox@gmail.com";
	String password = "123456";
	
	public void login() throws InterruptedException  {
		
			Actions acr=new Actions(driver);
			acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
			Thread.sleep(1000);
	}
	
	@BeforeMethod
	public void B() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bpath);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Actions acr=new Actions(driver);
//		acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
//		Thread.sleep(1000);
		 
		
	}
	
	
	@AfterMethod
	public void A() {
		driver.quit();
	}
	

	// Blank_valid
	@Test (enabled=true, priority=7,groups="login")
	public void Blank_valid() throws InterruptedException{
	login();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys(username);			
//		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys(password);			
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/p[1]")).getText(), "Please enter valid Email ID,");

		}	

	}

