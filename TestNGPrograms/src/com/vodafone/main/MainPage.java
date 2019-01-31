package com.vodafone.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainPage {
	
	static WebDriver driver = new FirefoxDriver();
	FileInputStream fp;
	static Properties prop;
	
	public MainPage() throws IOException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		fp = new FileInputStream("C://Users//The Home Computer//git//TestProjectOne//TestNGPrograms//src//com//vodafone//properties//PayMAquiProp.properties");
		prop = new Properties();
		prop.load(fp);
		
		driver.get(prop.getProperty("url"));
		/*driver.findElement(By.xpath(".//li[@class='navigation__item']/following::a[1]")).click();
		driver.findElement(By.xpath(".//div[text()='Pay monthly'][@class='vfuk-ScrollStripItem__label']")).click();
		driver.findElement(By.xpath(".//a[contains(@onClick,'49937926')]")).click();
		List<WebElement> choosePlansbuttn=driver.findElements(By.xpath(".//a[@id='choosePlans']"));
		if(choosePlansbuttn.size()>0)
		{
			choosePlansbuttn.get(0).click();
		}
		driver.findElement(By.xpath(".//a[contains(@onClick,'111173')]")).click();
		
		List<WebElement> buttn = driver.findElements(By.xpath(".//a[@class='button button-clear-float lg-button m--l-10']"));
		
		buttn.get(0).click();
		
		driver.findElement(By.xpath(".//input[@onClick='taggingLinkTrackingcheckoutTopButton()']")).click();
		driver.findElement(By.xpath(".//input[@id='firstName']")).sendKeys("John");
		driver.findElement(By.xpath(".//input[@id='lastName']")).sendKeys("Wills");
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath(".//input[@id='confirmEmail']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath(".//input[@id='phoneNumber']")).sendKeys("07756454645");
		driver.findElement(By.xpath(".//input[@id='birthdate']")).sendKeys("05/05/1988");
		WebElement employmentWE=driver.findElement(By.xpath(".//select[@id='employment-status']"));
		Select employment=new Select(employmentWE);
		employment.selectByVisibleText("Unemployed");
		
		driver.findElement(By.xpath(".//button[@id='aboutYouJSSubmit']")).click();
		WebElement username=driver.findElement(By.xpath(".//input[@id='username']"));
		username.clear();
		username.sendKeys("abhsyncj23");
		driver.findElement(By.xpath(".//input[@id='field-19b']")).sendKeys("3245");
		*/
				
	}
	public static void click(String element)
	{
		driver.findElement(By.xpath(prop.getProperty(element))).click();
	}
}
