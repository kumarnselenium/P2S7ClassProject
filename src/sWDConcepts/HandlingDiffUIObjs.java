package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDiffUIObjs {
	public void abc() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 Thread.sleep(3000);
		 
		 // Select class from Selenium to hold values from drop down box 
		 
		 Select listdropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		 
		  listdropdown.selectByIndex(5);
		 
		 Thread.sleep(3000);
		 
		 listdropdown.selectByValue("search-alias=appliances");
		 
		 Thread.sleep(3000);
		 
		 listdropdown.selectByVisibleText("Books");  
		 
		 System.out.println(listdropdown.getOptions().size());

	}
	
	public void handlingTable() throws InterruptedException
	{
		
		String sComapnyName = "BLCM";
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.nasdaq.com/");
		
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'" + sComapnyName + "')]/ancestor::td/following-sibling::td[3]")).getText());
	}
	
	public void diffBrowserOperations() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.southwest.com/");
		System.out.println(oBrowser.getPageSource());
		System.out.println(oBrowser.getTitle());
		System.out.println(oBrowser.getCurrentUrl());
		
		oBrowser.findElement(By.linkText("Enroll")).click();
		Thread.sleep(4000);
		//Navigate to Home page
		oBrowser.navigate().back();
		Thread.sleep(4000);
		//Navigate to Create Account
		oBrowser.navigate().forward();
		System.out.println(oBrowser.getTitle());
		System.out.println(oBrowser.getCurrentUrl());
		
		oBrowser.close();
		
		oBrowser.quit();
			
	}
	
	public void handlingDropDown() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com/");
		
		oBrowser.findElement(By.linkText("Enroll")).click();
		
		/*WebElement oMonth = oBrowser.findElement(By.id("js-customer-birth-month"));
		Select uiDOBMonth = new Select(oMonth);*/
		
		Select uiDOBMonth = new Select(oBrowser.findElement(By.id("js-customer-birth-month")));
		uiDOBMonth.selectByVisibleText("Apr");
		
		Thread.sleep(3000);
		uiDOBMonth.selectByIndex(2);	//Feb
		
		Thread.sleep(3000);
		uiDOBMonth.selectByValue("5");//May
		
		System.out.print(uiDOBMonth.getOptions().size());
		
	}
	
	public void handlingRadioButton() throws InterruptedException
	{
		String sTripType = "OneWay";
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com/");
		
		Thread.sleep(4000);
		
		if(sTripType.equals("OneWay"))
		{
			oBrowser.findElement(By.id("trip-type-one-way")).click();
		}
		else
		{
			oBrowser.findElement(By.id("trip-type-round-trip")).click();
		}
		
	}
	
	public void handlingCheckBox() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.nasdaq.com/symbol/adp/real-time");
		
		Thread.sleep(4000);
		/*
		if(oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			//nothing
		}
		else
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		*/
		
		if(!oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
	}

	public void specialCaseDuplicateObjs() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.td.com/ca/en/personal-banking/");
		
		//Login -EasyWeb Online Banking
		oBrowser.findElement(By.xpath("//button[contains(@onclick,'easyweb')]")).click();
		//button[contains(@onclick,'easyweb')]
		//button[@onclick,'window.location.href = 'https://easyweb.td.com/waw/idp/login.htm'']
		
		//<button class="td-button td-button-secondary td-button-large td-copy-nowrap loginout" onclick="window.location.href = 'https://easyweb.td.com/waw/idp/login.htm'" type="button"><span class="td-icon td-icon-secureBtn"></span>Login</button>
		Thread.sleep(4000);
		
		/*
		if(oBrowser.findElement(By.id("rememberMe1")).isSelected())
		{
			//nothing
		}
		else
		{
			oBrowser.findElement(By.id("rememberMe1")).click();
		}
		*/
		
		oBrowser.findElement(By.xpath("//label[@for='rememberMe1']")).click();

		if(!oBrowser.findElement(By.id("rememberMe1")).isSelected())
		{
			oBrowser.findElement(By.id("rememberMe1")).click();
		}
		
	}
	
	public void handlingLink()
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.td.com/ca/en/personal-banking/");
		
		oBrowser.findElement(By.linkText("About TD")).click();
		
	}
	
}
