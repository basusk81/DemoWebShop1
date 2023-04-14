package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentRport1 {

	public static void main(String[] args) {
	
		//start report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		
		//create extent report
		ExtentReports extent  = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		//creates reports for test
		ExtentTest test1 = extent.createTest("Doing Google Search1","Test to validate google search functionality");
		
		WebDriver driver = null;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		test1.log(Status.INFO, "Opening Google page");
		driver.get("https://www.google.com");
		test1.pass("Navigated to Google page");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered Text in the Search Box");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ESCAPE);
		//test1.pass("Clicked on the Escape Button");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Clicked on the Search Button");
		
		driver.close();
		
		driver.quit();
		test1.pass("Closed the Browser");
		
		test1.info("Test Has been Completed");
		
		//write all data in the report
		extent.flush();
		
		
	}

}
