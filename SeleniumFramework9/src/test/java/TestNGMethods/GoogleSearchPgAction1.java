package TestNGMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import Objects.GoogleSearchPage1;

public class GoogleSearchPgAction1 {

	static WebDriver driver = null;

	@BeforeTest
	public static void StartUp() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

	}

	@Test
	public static void Search() throws InterruptedException {

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage1.TextSearchBox(driver).sendKeys("Automation Step By Step");


		//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		GoogleSearchPage1.TextSearchBox(driver).sendKeys(Keys.ESCAPE);

		Thread.sleep(2000);

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GoogleSearchPage1.SearchButton(driver).click();
		Thread.sleep(2000);

	}
	
	@AfterTest
	public static void TearDown() throws InterruptedException {

		System.out.println("Test Has been Completed Successfully - ASBS");
		
		Thread.sleep(2000);

		driver.close();

		driver.quit();
	}


}





