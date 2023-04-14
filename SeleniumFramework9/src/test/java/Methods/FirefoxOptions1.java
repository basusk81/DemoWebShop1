package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOptions1 {

	public static void main(String[] args) throws Exception {

       
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private"); //firefox
          //ChromeOptions options = new ChromeOptions();
         // options.addArguments("incognito"); //chrome
        
    
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(options);
        
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver(options);
    
        driver.get("https://www.bing.com");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        driver.close();

    }
}
