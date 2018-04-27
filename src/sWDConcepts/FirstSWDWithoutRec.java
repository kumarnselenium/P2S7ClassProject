package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSWDWithoutRec {

	WebDriver oBrowser;

	public void openApplication(String sBrowserType, String sURL)
	{
		
		if(sBrowserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			oBrowser = new ChromeDriver();
		}
		else if(sBrowserType.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/narkandukuri/Downloads/gecko");
			oBrowser = new FirefoxDriver();
		}
		else if(sBrowserType.equals("Safari"))
		{
			oBrowser = new SafariDriver();
		}
		else if(sBrowserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "/Users/narkandukuri/Downloads/iedriver");
			oBrowser = new InternetExplorerDriver();
		}
		
		oBrowser.get(sURL);
	}
	
	@Test
	public void eBaySearch()
	{
		
		
		openApplication("Chrome", "https://www.ebay.com");
		
		
		//3. Enter "laptop" in search text box
		//3.a Identify "search" text box
		//3.b then enter "laptop"
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
	
	public void eBaySearchChrome()
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		//3.a Identify "search" text box
		//3.b then enter "laptop"
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
	
}
