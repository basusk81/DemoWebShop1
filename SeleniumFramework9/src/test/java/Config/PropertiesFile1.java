package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile1 {
	static int a = 0;
	
	
	public static void main(String[] args) throws IOException {
	getProperty1();
	setProperty1();
	getProperty2();
	int a = 1;
	System.out.println(a);

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
		int a = 2;
		System.out.println(a);
		
	}
	
	public static void setProperty1() throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		OutputStream output1 = new FileOutputStream(path+"\\src\\test\\java\\Config\\config.properties");
		prop.setProperty("browser","chrome");
		prop.store(output1, null);
		int a = 3;
		System.out.println(a);
		
	
	}
	public static void getProperty2() throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		InputStream input1 = new FileInputStream(path+"\\src\\test\\java\\Config\\config.properties");
		prop.load(input1);
		String prop1 =  prop.getProperty("browser");
		System.out.println("Browser Property Value in file:"+prop1);
		//int a = 4;
		System.out.println(a);
	}

}
