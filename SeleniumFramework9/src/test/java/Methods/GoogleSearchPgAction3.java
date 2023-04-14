package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Objects.GoogleSearchPage3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPgAction3 {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		GoogleSearch();
	}
	
	public static void GoogleSearch() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		
		GoogleSearchPage3 search1 = new GoogleSearchPage3(driver);
		
		search1.setTextinSearchBox("Automation Step by Step");
		
		Thread.sleep(2000);
		
		search1.clickSearchButton();
		
		Thread.sleep(2000);
		
		System.out.println("Test Completed");
		
		driver.close();
		
		driver.quit();
		
		
		
		
	}

}
