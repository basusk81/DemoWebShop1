package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPgAction5 {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		//GoogleSearch1();
		//GoogleSearch2();
		//GoogleSearch3();
		GoogleSearch4();
		
	}
	
	public static void GoogleSearch1() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println("Firefox Code");
		
		String s1 = driver.getCurrentUrl();
		String u1 = driver.getTitle();
		
		System.out.println("The Current URL is" +s1);
		System.out.println("The Current Page Title is" +u1);
		
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.name("q")).sendKeys("Tricentis Webshop Demo");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.close();
		
		}
	
	public static void GoogleSearch2() {

		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().driverVersion("Version 111.0").setup();
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
								
		driver.navigate().to("https://www.bing.com");
		
		System.out.println("Navigate to Code");
		
		String s2 = driver.getCurrentUrl();
		String u2 = driver.getTitle();
		
		System.out.println("The Current URL is" +s2);
		System.out.println("The Current Page Title is" +u2);
		
		driver.close();
		
		}
	
	public static void GoogleSearch3() {

		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
						
		driver.get("https://www.yahoo.com");
		
		System.out.println("Yahoo Code");
		
		driver.close();
		
		}
	
	public static void GoogleSearch4() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println("Firefox Code");
		
		String s1 = driver.getCurrentUrl();
		String u1 = driver.getTitle();
		
		System.out.println("The Current URL is" +s1);
		System.out.println("The Current Page Title is" +u1);
		
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.name("q")).sendKeys("Tricentis Webshop Demo");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
		
		}
	
	
	

}
