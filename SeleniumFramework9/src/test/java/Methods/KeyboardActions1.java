package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions1 {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
	
		KeyBoardActions1();
	}

	public static void KeyBoardActions1() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(3000);
		
		
		//Key Down Button
		Actions a1 = new Actions(driver);
		Action a2 = a1.keyDown(Keys.CONTROL).sendKeys("a").build();
		a2.perform();
		
		Actions a3 = new Actions(driver);
		Action a4 = a3.keyDown(Keys.CONTROL).sendKeys("c").build();
		a4.perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("fname")).click();
		Actions a5 = new Actions(driver);
		Action a6 = a5.keyDown(Keys.CONTROL).sendKeys("v").build();
		a6.perform();
		
		a1.keyUp(Keys.CONTROL).perform();
		a3.keyUp(Keys.CONTROL).perform();
		a5.keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}
	
}
