package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage3 {
	
	WebDriver driver = null;
	
	//Define all button, links, dropdowns
	
	By textBox_GoogleSearch = By.name("q");
	
	By button_Search = By.name("btnK");
	
	By button_Lucky = By.name("btnI");
	
	
	public GoogleSearchPage3(WebDriver driver) {  ///constructor
		this.driver = driver;
	}
	
		
	public void setTextinSearchBox(String text) {
		
		driver.findElement(textBox_GoogleSearch).sendKeys(text);
	
	}	
	
	public void clickSearchButton() {
		
		//driver.findElement(button_Search).sendKeys(Keys.ENTER);
		driver.findElement(button_Search).sendKeys(Keys.ESCAPE);
		driver.findElement(button_Search).click();
		
	}
	
	public void clickLuckyButton() {
		
		driver.findElement(button_Lucky).sendKeys(Keys.ENTER);
		
	}

}
