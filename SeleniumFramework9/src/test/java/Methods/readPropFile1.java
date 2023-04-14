package Methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readPropFile1 {

	public static String browsername;
	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		getProperty1();
		test1();

	}
	private static void getProperty1() throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		InputStream input1 = new FileInputStream(path+"\\src\\test\\java\\Config\\config.properties");
		prop.load(input1);
		String prop1 =  prop.getProperty("browser");
		System.out.println("Browser Property Value in file:"+prop1);
		browsername = prop1;
		System.out.println(browsername);
		
	}

	public static void test1() throws InterruptedException
	{
		System.out.println(browsername);
		if (browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
