import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNgBasics {
	
	WebDriver driver;
	

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/Users/subhamdas/Desktop/Chrome Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
	}
	
	@Test(priority=1)
	public void TitleTest()
	{
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.name);
				
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}

