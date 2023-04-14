package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		AlertsTest1();
		AlertsTest2();
		AlertsTest3();
		AlertsTest4();

	}

	public static void AlertsTest1() throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(2000);
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		String a1 = alert1.getText();
		System.out.println(a1);
		alert1.accept();
		Thread.sleep(2000);
		
		
		if(driver.getPageSource().contains("You successfully clicked on alert"))
			System.out.println("Alert displayed correctly");
		driver.close();
		
		//driver.quit();
		
	}
	
public static void AlertsTest2() throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert2 = driver.switchTo().alert();
		String a2 = alert2.getText();
		System.out.println(a2);
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(2000);
		
		driver.close();
		
		//driver.quit();
		
	}

public static void AlertsTest3() throws InterruptedException {
	

	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();

	driver.manage().window().maximize();
	
	driver.get("http://the-internet.herokuapp.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("JavaScript Alerts")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	
	Thread.sleep(3000);
	
	Alert alert3 = driver.switchTo().alert();
	String a3 = alert3.getText();
	System.out.println(a3);
	Thread.sleep(2000);
	alert3.dismiss();
	Thread.sleep(2000);
	
	driver.close();
	
	//driver.quit();
	
}

public static void AlertsTest4() throws InterruptedException {
	

	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();

	driver.manage().window().maximize();
	
	driver.get("http://the-internet.herokuapp.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("JavaScript Alerts")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
	Thread.sleep(2000);
	
	Alert alert4 = driver.switchTo().alert();
	alert4.sendKeys("Test");
	//System.out.println(a4);
	Thread.sleep(2000);
	alert4.accept();
	Thread.sleep(2000);
	
	driver.close();
	
	driver.quit();
	
}
	
	
}
