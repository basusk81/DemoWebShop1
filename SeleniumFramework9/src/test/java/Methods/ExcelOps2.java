package Methods;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelOps2 {
	
	static String FirstName = null;
	static String LastName = null;
	static String Email = null;
	static String Password = null;
	static String ConfirmPassword = null;
	static String flag1=null;
	static int i=1,j=0, LastRow2;
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public static void main(String[] args) throws IOException, InterruptedException {
	
			excelread1();
		}
		
		//excelwrite1();
		//webshopRegister();
		//webshopLogin();

	public static void excelread1() throws IOException, InterruptedException {
		path = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(path+"\\Excels\\DataSheet2.xlsx");
		sheet = workbook.getSheet("Sheet1");
		int LastRow2 = sheet.getPhysicalNumberOfRows();
		System.out.println(LastRow2);

		FirstName = sheet.getRow(i).getCell(j).getStringCellValue();
		LastName = sheet.getRow(i).getCell(j+1).getStringCellValue();
		Email = sheet.getRow(i).getCell(j+2).getStringCellValue();
		Password = sheet.getRow(i).getCell(j+3).getStringCellValue();
		ConfirmPassword = sheet.getRow(i).getCell(j+4).getStringCellValue();
		flag1 = sheet.getRow(i).getCell(j+5).getStringCellValue();
				
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(ConfirmPassword);
		System.out.println(flag1);
		
		webshopRegister();
	}
	
	
	public static void excelwrite1() {
		
	}
	
	public static void webshopRegister() throws InterruptedException {
		System.out.println("Code Enters the webshopRegister function having i :"+i);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		
		if (flag1.equalsIgnoreCase("Male"))
		{
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		}
			else if (flag1.equalsIgnoreCase("Female"))
			{
				driver.findElement(By.xpath("//input[@id='gender-female']")).click();
			}
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(FirstName);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='LastName']")).click();
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).click();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(ConfirmPassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(1000);
		
		try {
		WebElement Result1 = driver.findElement(By.xpath("//li[normalize-space()='The specified email already exists']"));
		System.out.println("Result1 is:"+Result1);
		System.out.println("In Result1 Block");
		driver.close();
		webshopLogin();
		}
		
		catch (Exception e) {
			System.out.println(e);
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			System.out.println("In Result2 Block");
			Thread.sleep(2000);
			driver.close();
			webshopLogin();
		}
		 

	
		driver.close();
		
		
	}
	
	
public static void webshopLogin() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).click();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String acct = driver.findElement(By.xpath("//a[@class='account']")).getText();
		
		if(acct.equalsIgnoreCase(Email)) {
			System.out.println("Successful Login");
		}
		else {
			System.out.println("Invalid Login");
		}
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.close();
		//driver.quit();
}
	
}
