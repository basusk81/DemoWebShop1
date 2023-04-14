package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements1 {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		WebElement1();
		//CheckBoxes1();
		//radioButton1();
		//dropdown1();
		//dropdown2();
		//options1();
	}

	public static void WebElement1() throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		//listing all input boxes
		List<WebElement> inputbox = driver.findElements(By.tagName("input"));
		int a1 = inputbox.size();
		System.out.println("Total Number of Input Boxes: "+a1);

		for (int i=1; i<=inputbox.size(); i++) {
			System.out.println(inputbox);
		}

		//listing all select boxes
		List<WebElement> selectbox = driver.findElements(By.tagName("select"));
		int a2 = selectbox.size();
		System.out.println("Total Number of Select Boxes: "+a2);

		for (int j=1; j<=selectbox.size(); j++) {
			System.out.println(selectbox);
		}

		driver.close();

	}
	
	public static void CheckBoxes1() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		boolean a = driver.findElement(By.xpath("//input[@name='option1']")).isSelected();
		System.out.println("Checkbox1 is Selcted:"+a);
		
		driver.findElement(By.xpath("//input[@name='option1']")).click();
		driver.findElement(By.xpath("//input[@name='option2']")).click();
		driver.findElement(By.xpath("//input[@name='option3']")).click();
		
		Thread.sleep(4000);
		
		boolean b = driver.findElement(By.xpath("//input[@name='option1']")).isSelected();
		System.out.println("Checkbox1 is Selected:"+b);
		 
		
		driver.close();
		//driver.quit();
		
	}
	
	public static void radioButton1() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		//driver.quit();
		
	}
	
	/*//Not Working
	public static void dropdown2() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		List<WebElement> dd2 = driver.findElements(By.xpath("//select[@id='option']"));
		Select a3 = new Select((WebElement) dd2);
			System.out.println(dd2.size());
		//Select a1 = new Select(null);
		//a1.selectByIndex(2); //option2
		
		for (int i=1;i<=dd2.size();i++) {
			System.out.println(dd2);
		}
		
		
		Thread.sleep(2000);
		//a1.selectByValue("option 3"); //option3
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		

	}
	*/
	
	public static void dropdown1() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='option']"));
		Select a1 = new Select(dd1);
			
		//Select a1 = new Select(null);
		a1.selectByIndex(2); //option2
		
		Thread.sleep(3000);
		
		a1.selectByValue("option 3"); //option3
		Thread.sleep(2000);
		driver.close();
		//driver.quit();	
		
	}
	
	public static void options1() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).sendKeys(Keys.PAGE_DOWN);
		
		Select optionlist1 = new Select(driver.findElement(By.xpath("//select[@id='owc']")));
	
		
		Thread.sleep(2000);
		
		optionlist1.selectByValue("option 3"); //option3
		
		optionlist1.deselectAll();
		Thread.sleep(2000);
		
		optionlist1.selectByIndex(1);
		optionlist1.selectByIndex(2);
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
	

}
