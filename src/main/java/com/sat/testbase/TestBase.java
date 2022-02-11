package com.sat.testbase;

//import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sat.testUtil.Testutil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver= new ThreadLocal<>();
	
	public WebDriver initialization(String browser) {
		System.out.println("Browser Name : " +browser);
		
	if(browser.equals("chrome")){
		
		WebDriverManager.chromedriver().setup();
		tldriver.set(new ChromeDriver());
		
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/com.sat.Drivers/chromedriver.exe");	
	  
	}
	
	getDriver().manage().window().maximize();
	getDriver().manage().deleteAllCookies();
	getDriver().manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	getDriver().manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	return getDriver();
}


public static synchronized WebDriver getDriver()
{
	
  return tldriver.get();
}


	

}
