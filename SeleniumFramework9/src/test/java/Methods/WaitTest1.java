package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTest1 {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		ImplicitWait1();
		ExplicitWait1();
		
	}

	public static void ImplicitWait1() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("q")).sendKeys("Tricentis Webshop Demo");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ESCAPE);
	
		
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("1");
		driver.close();
		
		
		}
	
	public static void ExplicitWait1() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait x1 = new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement link1 = x1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		
		link1.click();
	
		Thread.sleep(2000);
			
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	
		Thread.sleep(2000);
		System.out.println("2");
		driver.close();
		
		driver.quit();
		
		}
	
	
	
}
