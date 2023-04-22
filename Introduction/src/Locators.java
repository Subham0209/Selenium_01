import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/Users/subhamdas/Desktop/Chrome Driver/chromedriver");
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.gecko.driver","/Users/subhamdas/Desktop/Gecko/geckodriver");
				//WebDriver driver = new FirefoxDriver();
				driver.get("https://www.westerndigital.com");
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.id ("productStore")).click();
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath ("aria-label=See All Products")).click();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.quit();

	}

}
