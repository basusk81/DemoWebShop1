package Methods;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Objects.GoogleSearchPage1;

public class GoogleSearchPgAction2 {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GoogleSearch();
	}

	public static void GoogleSearch() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage1.TextSearchBox(driver).sendKeys("Automation Step by Step");
		

		//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		GoogleSearchPage1.TextSearchBox(driver).sendKeys(Keys.ESCAPE);

		Thread.sleep(2000);

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GoogleSearchPage1.SearchButton(driver).click();
		Thread.sleep(2000);

		System.out.println("Test Has been Completed Successfully");

		driver.close();

		driver.quit();


	}

}



