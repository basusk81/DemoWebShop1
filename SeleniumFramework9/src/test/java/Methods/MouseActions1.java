package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions1 {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		//mousedrag1();
		mousedrag2();

	}
	
	public static void mousedrag1() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		//driver.findElement(By.name("fname")).sendKeys(Keys.PAGE_DOWN);
		//driver.findElement(By.name("fname")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.partialLinkText("Home")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		Actions a0 = new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//button[@ondbclick='myFunction()']"));
		a0.doubleClick(btn1);
		Thread.sleep(2000);
		String response = driver.findElement(By.id("demo")).getText();
		System.out.println(response);
		
		//WebElement pza1 = driver.findElement(By.id("drag1"));
		//WebElement pza2 = driver.findElement(By.id("div1"));
		WebElement pza1 = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement pza2 = driver.findElement(By.xpath("//div[@id='div1']"));
		
		Actions a1 = new Actions(driver);
		//a1.clickAndHold().dragAndDrop(pza1, pza2);
		a1.dragAndDrop(pza1, pza2);
		//a1.clickAndHold(pza1);
		//a1.moveToElement(pza1);
		//a1.clickAndHold();
		//a1.moveToElement(pza2);
		a1.build().perform();
		
		Thread.sleep(2000);
		//a1.moveToElement(pza2);
	
		driver.switchTo().defaultContent();
		//a1.perform();
		Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		
	}
	
	public static void mousedrag2() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		Thread.sleep(2000);

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='search-expand-text']")).sendKeys(Keys.PAGE_DOWN);
	
		WebElement box1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement box2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a1 = new Actions(driver);
		/*
		a1.moveToElement(box1);
		a1.clickAndHold();
		a1.moveToElement(box2);
		a1.perform();
		a1.release(box1);
		*/
		
		a1.dragAndDrop(box1, box2);
		a1.perform();
		a1.release();
	
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		
	}
	
	
}
