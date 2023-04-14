package Methods;

import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots1 {

		static WebDriver driver = null;

		public static void main(String[] args) throws InterruptedException, IOException {
			TakeScreenshot();

		}
		
		public static void TakeScreenshot() throws InterruptedException, IOException {
			
			driver = new FirefoxDriver();
			
			WebDriverManager.firefoxdriver().setup();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
			
			File ssFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile1,new File("./image1.png"));
			
			
			WebElement element1 = driver.findElement(By.className("lnXdpd"));
			File ssFile2 = element1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile2,new File("./image2.png"));
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("q")).click();
			driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
			
			driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
			Thread.sleep(1000);
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			File ssFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile3,new File("./image3.png"));
			//driver.findElement(By.xpath("/input[@class='s']")).click();
			//driver.findElement(By.xpath("/input[@class='s']")).sendKeys("A");
			
			//driver.findElement(By.className("LC20lb.MBeuO.DKV0Md")).click();
			driver.findElement(By.xpath("//*[@class='LC20lb*']")).click();
			Thread.sleep(2000);
			
			String originalwindow = driver.getWindowHandle();
			driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
			File ssFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile4,new File("./image4.png"));
			driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.className("wpfront-button")).sendKeys(Keys.PAGE_DOWN);
			
			
			Thread.sleep(3000);
			File ssFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile5,new File("./image5.png"));
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);
			
			File ssFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssFile6,new File("./image6.png"));
			
			Thread.sleep(3000);
			driver.switchTo().window(originalwindow);
			
			
			Thread.sleep(3000);
			
			driver.close();
		
			driver.quit();
					
		}

	}

