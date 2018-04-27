package sWDConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObjs {

	public void groupOfSimilarUIObjs() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		
		System.out.println(uiAllDeals.size());
		
		/*
		for(int i=1; i<=uiAllDeals.size(); i++)
		{
			System.out.println(uiAllDeals.get(i-1).getText());
		}
		*/
		
		for (WebElement uiEachObj : uiAllDeals) 
		{
			System.out.println(uiEachObj.getText());
		}
		
		/*List<String> sStudentNames = null;
		for (String sEachStudentName : sStudentNames) 
		{
			System.out.println(sEachStudentName);
		}*/
	}
	
	public void groupOfTags() throws InterruptedException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		//Links
		List<WebElement> uiAllLinks = oBrowser.findElements(By.tagName("a"));
		
		//Images
		List<WebElement> uiAllImages = oBrowser.findElements(By.tagName("img"));
		
		//Dropdown
		List<WebElement> uiAllDropDowns = oBrowser.findElements(By.tagName("select"));
		
		//Text Boxes
		List<WebElement> uiAllTextBoxes = oBrowser.findElements(By.xpath("//input[@type='text]"));
		
		//Check Boxes
		List<WebElement> uiAllCheckBoxes = oBrowser.findElements(By.xpath("//input[@type='checkbox]"));
	
		/* ==> HTML Tag ==> input
		 * Text box 
		 * Checkbox
		 * Radio button
		 * few buttons
		 */
		
	}
	
	@Test
	public void groupOfSimilarUIObjsWrtiteToNotePad() throws InterruptedException, FileNotFoundException
	{
		//1. Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		
		System.out.println(uiAllDeals.size());
		
		//Create an Empty File
		File oFile = new File("/Users/narkandukuri/Documents/Personal/Sel/P2S7/Deals.txt");
		
		//Write to a file
		PrintWriter oPW= new PrintWriter(oFile);
		
		for (WebElement uiEachObj : uiAllDeals) 
		{
			//System.out.println(uiEachObj.getText());
			//Write to file
			oPW.println(uiEachObj.getText());
		}
		
		//Save file
		oPW.flush();
		
		//Close file
		oPW.close();
		
	}
	
	
	
	
	
	
	
	
}
