package Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPgAction4 {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		GoogleSearch1();
		GoogleSearch2();
		GoogleSearch3();
		
	}
	
	public static void GoogleSearch1() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
		driver.get("https://www.google.com");
		
		System.out.println("Firefox Code");
		
		driver.close();
		
		}
	
	public static void GoogleSearch3() {

		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().driverVersion("Version 111.0").setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
								
		driver.get("https://www.bing.com");
		
		System.out.println("Chrome Code");
		
		driver.close();
		
		}
	
	public static void GoogleSearch2() {

		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
						
		driver.get("https://www.yahoo.com");
		
		System.out.println("Edge Code");
		
		driver.close();
		
		}
	
	

}
