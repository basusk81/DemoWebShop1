package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTest1 {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		WindowBack();

	}
	
	public static void WindowBack() throws InterruptedException {
		
		driver = new FirefoxDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationstepbystep.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("wpfront-button")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("/input[@class='s']")).click();
		//driver.findElement(By.xpath("/input[@class='s']")).sendKeys("A");
		
		String originalwindow = driver.getWindowHandle();
		driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000);
		//driver.findElement(By.className("psb*gp")).click();
		//driver.findElement(By.linkText("Share in Google+")).click();
		//driver.findElement(By.)
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);
		driver.switchTo().window(originalwindow);
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
				
	}

}
