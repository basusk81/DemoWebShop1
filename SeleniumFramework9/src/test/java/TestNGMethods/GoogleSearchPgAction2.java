package TestNGMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import Objects.GoogleSearchPage1;

public class GoogleSearchPgAction2 {

	static WebDriver driver = null;

	@BeforeTest
	public static void StartUp() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

	}

	@Test
	public static void SearchCars() throws InterruptedException {

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage1.TextSearchBox(driver).sendKeys("Cars");


		//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		GoogleSearchPage1.TextSearchBox(driver).sendKeys(Keys.ESCAPE);

		Thread.sleep(2000);

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GoogleSearchPage1.SearchButton(driver).click();
		Thread.sleep(2000);
		System.out.println("Cars");
		
		driver.navigate().back();
		
		Thread.sleep(2000);

	}
	
	@Test
	public static void SearchPlanes() throws InterruptedException {

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage1.TextSearchBox(driver).sendKeys("Planes");


		//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		GoogleSearchPage1.TextSearchBox(driver).sendKeys(Keys.ESCAPE);

		Thread.sleep(2000);

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GoogleSearchPage1.SearchButton(driver).click();
		Thread.sleep(2000);
		
		System.out.println("Planes");
		
		driver.navigate().back();
		
		Thread.sleep(2000);

	}
	
	@Test
	public static void SearchTrains() throws InterruptedException {

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage1.TextSearchBox(driver).sendKeys("Trains");


		//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		GoogleSearchPage1.TextSearchBox(driver).sendKeys(Keys.ESCAPE);

		Thread.sleep(2000);

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GoogleSearchPage1.SearchButton(driver).click();
		Thread.sleep(2000);
		System.out.println("Trains");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public static void TearDown() throws InterruptedException {

		System.out.println("Test Has been Completed Successfully for CARS, PLANES , TRAINS");
		
		Thread.sleep(1000);

		driver.close();

		//driver.quit();
	}


}





