import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/subhamdas/Desktop/Chrome Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","/Users/subhamdas/Desktop/Gecko/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
