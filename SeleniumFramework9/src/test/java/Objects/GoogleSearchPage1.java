package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage1 {

	static WebDriver driver = null;
	static WebElement element = null;

	public static WebElement TextSearchBox(WebDriver driver) {

		WebElement element = driver.findElement(By.name("q"));
		return element;

	}

	public static WebElement SearchButton(WebDriver driver) {

		WebElement element = driver.findElement(By.name("btnK"));
		return element;

	}

	public static WebElement LuckyButton(WebDriver driver) {

		WebElement element = driver.findElement(By.name("btnI"));
		return element;

	}

}
