package com.sat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;

	private By emailid = By.id("i0116");
	private By Next = By.id("idSIButton9");
	private By password = By.id("i0118");
	private By singin = By.id("idSIButton9");
	private By yes = By.id("idSIButton9"); 
	//private By app = By.xpath("//div[@title='Customer Service Hub']");
		
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String GetLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void GetApp(String title) {
	 driver.findElement(By.xpath("//div[@title='"+title+"']")).click();
				
	}
	
		
	public void enteruserid(String userid)
	{
		driver.findElement(emailid).sendKeys(userid);
		
	}
	
	public void clickonNext()
	{
		driver.findElement(Next).click();
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonsignin()
	{
		driver.findElement(singin).click();
	}

	public void clickonYes()
	{
		driver.findElement(yes).click();
	}
	
	
}
