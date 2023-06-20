package com.OrangeHRM.BaseClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.OrangeHRM.ActionPack.Action;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public static Action act;	
	//loadConfig method is to load the configuration
	@BeforeSuite
	public void loadConfig() {
		DOMConfigurator.configure("log4j.xml");

		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\Config.Properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void launchApp() {
				
		String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();	
		}
		//Maximize the screen
		driver.manage().window().maximize();
		act = new Action();
		//Implicit TimeOuts
	    act.implicitWait(driver, 10);
		//PageLoad TimeOuts
		act.pageLoadTimeOut(driver, 30);   
		 driver.get(prop.getProperty("url"));
		 
	}
	@AfterSuite()
	public void Closing() {
		driver.close();
	}

	}