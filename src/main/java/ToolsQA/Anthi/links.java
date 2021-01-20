package ToolsQA.Anthi;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class links {
	
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
	
	
	
	//About_us
	@Test (enabled=true, priority=1,groups="Link")
	public void About_us() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/about");
		Thread.sleep(1000);		
	}
	
	
	
	
	
	//Facts_on_Hair_Thinning
	@Test (enabled=true, priority=2,groups="Link")
	public void Facts_on_Hair_Thinning() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/facts-on-hair-thinning");
		Thread.sleep(1000);		
	}
	
	
	
	
	
	//Blog
	@Test (enabled=true, priority=3,groups="Link")
	public void Blog() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/blog");
		Thread.sleep(1000);		
	}
	
	
	
	
	//Contact_Us
	@Test (enabled=true, priority=4,groups="Link")
	public void Contact_Us() throws InterruptedException{
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
		//Assert.assertEquals(driver.getTitle(), "Connect with us");
		Thread.sleep(1000);		
	}
	
	
	
	
	
	//ingredients
	@Test (enabled=true, priority=5,groups="Link")
	public void ingredients() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/ingredients");
		Thread.sleep(1000);	
		 
	}
	
	

	
	
//	Anti_Thinning_Hair_Shampoo
	@Test (enabled=true, priority=6,groups="Link")
	public void Anti_Thinning_Hair_Shampoo() throws InterruptedException{
		
		Actions acr=new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/our-product/anthi-shampoo");
		Thread.sleep(1000);	
		 
	}
	
	
	
	
//	Anti-Thinning_Hair_Spray
	@Test (enabled=true, priority=7,groups="Link")
	public void Anti_Thinning_Hair_Spray() throws InterruptedException{
		
		Actions acr=new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/our-product/anthi-hair-spray");
		Thread.sleep(1000);	
		 
	}
	
	
	
//	Anti_Thinning_Hair_Serum
	@Test (enabled=true, priority=8,groups="Link")
	public void Anti_Thinning_Hair_Serum() throws InterruptedException{
		
		Actions acr=new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/our-product/anthi-serum");
		Thread.sleep(1000);	
		 
	}
	
	
	
	
//	Anti_Thinning_regimen_kit
	@Test (enabled=true, priority=9,groups="Link")
	public void Anti_Thinning_regimen_kit() throws InterruptedException{
		
		Actions acr=new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[4]/a[1]")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.anthinaturals.com/our-product/anti-thinning-regimen-kit");
		Thread.sleep(1000);	
		 
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
//	System.out.println(driver.switchTo().window(ChildWindow).findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/span[1]/a[1]/span[1]")).getText());
	
	}	
		
		
		
		
		
		//Instagram
		@Test (enabled=true, priority=11,groups="social links")
		public void Instagram() throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='contact']/div[3]/div[2]/div[2]/div[3]/a[2]/i[1]")).click();
			
			// window handle parent to child
						Set<String> s1=driver.getWindowHandles();
						 Iterator<String> i1=s1.iterator();
						 String mainwindow =i1.next();
						 String ChildWindow=i1.next();
							Thread.sleep(1000);	

					 Assert.assertEquals(driver.switchTo().window(ChildWindow).getTitle(), "Login • Instagram");
		}
		
		
		
		
		//youtube
		@Test (enabled=true, priority=12,groups="social links")
		public void youtube() throws InterruptedException{
			// scroll down to bottom code
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='contact']/div[3]/div[2]/div[2]/div[3]/a[3]/i[1]")).click();
			Thread.sleep(1000);
			
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();
			String mainwindow =i1.next();
			 String ChildWindow=i1.next();
			Thread.sleep(1000);	

			Assert.assertEquals(driver.switchTo().window(ChildWindow).getTitle(), "anthi naturals - YouTube");
						// System.out.println(driver.switchTo().window(ChildWindow).getTitle());  // print result
			Thread.sleep(1000);			
		}
	
		
		
		
		
		
		
		
		
		
		
	// Login popup 
	
			@Test (enabled=true, priority=13,groups="when Login")
			public void Login() throws InterruptedException{
				
				Actions acr=new Actions(driver);
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("prathamesh.4fox@gmail.com");			
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("123456");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
			    
			    acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				Thread.sleep(1000);
				
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText(), "Welcome");
//				System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getText());
			}
			
			
			// edit profile 
			
			@Test (enabled=true, priority=14,groups="when Login")
			public void edit_profile() throws InterruptedException{
				
				Actions acr=new Actions(driver);
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("prathamesh.4fox@gmail.com");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("123456");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
			    
			    acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.anthinaturals.com/my-account");
				Thread.sleep(1000);
			}
	
			
			
			// my order
			
			@Test (enabled=true, priority=14,groups="when Login")
			public void my_order() throws InterruptedException{
				
				Actions acr=new Actions(driver);
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("prathamesh.4fox@gmail.com");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("123456");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
			    
			    acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.anthinaturals.com/my-account/my-order");
				Thread.sleep(1000);
			}
	
			
			// change password
			
			@Test (enabled=true, priority=15,groups="when Login")
			public void change_password() throws InterruptedException{
				
				Actions acr=new Actions(driver);
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("prathamesh.4fox@gmail.com");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("123456");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
			    
			    acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.anthinaturals.com/my-account/change-pass");
				Thread.sleep(1000);

			}
			
			// logout
			
			@Test (enabled=true, priority=16,groups="when Login")
			public void logout() throws InterruptedException{
				
				Actions acr=new Actions(driver);
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[1]/input[1]")).sendKeys("prathamesh.4fox@gmail.com");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[2]/input[1]")).sendKeys("123456");			
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/form[1]/li[4]/input[2]")).click();
			    
			    acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
				acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"))).perform();
				Thread.sleep(1000);
				Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/h2[1]")).getText(), "To access account and manage orders");
				Thread.sleep(1000);
//				System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/h2[1]")).getText());
			}
}
