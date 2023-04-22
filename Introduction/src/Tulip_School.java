import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tulip_School {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/subhamdas/Desktop/Chrome Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.tuliptest.in/");
				
	}
	
	@Test(priority=1)
	public void Login()
	{
		driver.findElement(By.id("login_username")).sendKeys("isanket");
		driver.findElement(By.id("login_password")).sendKeys("tulip123");
		driver.findElement(By.className("ant-btn css-3k1r5l ant-btn-primary")).click();
	}
	
	@Test(priority=3)
	public void LogoTest()
	{
		//boolean b1 = driver.findElement(By.xpath("//img[@alt='/content/dam/store/en-us/assets/home-page/brand-logos/header-main-logo.svg\']")).isDisplayed();
		//boolean b2 =  driver.findElement(By.xpath("//"))
	}
	
	@Test(priority=2)
	public void mailLinkTest()
	{
		//boolean b2 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
