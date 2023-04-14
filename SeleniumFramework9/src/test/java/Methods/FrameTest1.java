package Methods;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTest1 {
	
	static WebDriver driver = null;

	public static void main(String[] args)  {
			try {
				FrameTest();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static void FrameTest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		System.out.println("Frame Code");
		
		driver.switchTo().frame("packageFrame");
		//driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		
		//int height = driver.manage().window().getSize().getHeight();
		//int width = driver.manage().window().getSize().getWidth();
		//System.out.println("Height of Browser is:" +height);
		//System.out.println("Width of Browser is:" +width);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height of Browser is:" +size.getHeight());
		System.out.println("Width of Browser is:" +size.getWidth());
		
		driver.manage().window().setSize(new Dimension(600,1400));
		//driver.manage().window().setSize("800,1000");
	
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(500,100));
		
		System.out.println("Position x is:" +position.getX());
		System.out.println("Position y is:" +position.getY());
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		}


	}
	

