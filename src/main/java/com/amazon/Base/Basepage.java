package com.amazon.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.Utils.Testutil;


public class Basepage {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public Basepage() {
		try {
			prop=new Properties();
		
			FileInputStream ip=new FileInputStream("C:\\Users\\Srikanthvanam\\eclipse location\\"
					+ "amazon\\src\\main\\java\\com\\amzon\\Config\\config.properties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		String browsername= prop.getProperty("browser");
		 browsername.equals("chrome");
			System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
		     driver=new ChromeDriver();
		    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Testutil.page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	

}
