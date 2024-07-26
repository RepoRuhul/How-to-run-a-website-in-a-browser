package unit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class SampleFrameworkCreation {
//	Assertion assertion;

	@Test
	public void webTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.delta.com/");
		driver.manage().window().maximize();
		driver.get("https://www.aa.com/");

		driver.get("https://www.chase.com/");
		driver.get("https://www.ebay.com/");
		driver.get("https://www.tdbank.com/");
		driver.get("https://www.homedepot.com/");
		driver.get("https://www.chase.com/");
		driver.get("https://www.ebay.com/");
		driver.get("https://www.tdbank.com/");
		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		WebElement element = driver.findElement(By.id("gh-shop-a"));
//		element.click();

		Thread.sleep(10000);

		driver.quit();

	}

}
