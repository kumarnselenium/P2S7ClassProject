package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationsUsingTestNg {
	
	@Test
	public void dealLoansSingleSet() throws InterruptedException	 
	{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			WebDriver oBrowser = new ChromeDriver();		 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
			oBrowser.manage().window().maximize();		 
		
			try
			{
				Assert.assertTrue(oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed(),"Fail, EMI Calc page loaded unsuccessfully");
				System.out.println("Pass, EMI Calc page loaded successfully");
			}catch (Exception e) {
				System.out.println("Fail, EMI Calc page loaded unsuccessfully");
			}
			
			Assert.assertTrue(oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0, "Fail, EMI Calc page loaded unsuccessfully");
			System.out.println("Pass, EMI Calc page loaded successfully");
			
			oBrowser.findElement(By.id("Loan_Amount")).clear();		 
			oBrowser.findElement(By.id("Loan_Amount")).sendKeys("200000");
			oBrowser.findElement(By.name("rate")).click();
			//Loan Amount Text
			String sExpectedLoanAmountText = "two lakh(s)".toLowerCase();
			String sActualLoanAmountText = oBrowser.findElement(By.id("wordloanAmount")).getText().toLowerCase();
			
			Assert.assertTrue(sActualLoanAmountText.contains(sExpectedLoanAmountText), "Fail, Loan Amount Text displayed unsuccessfully");
			System.out.println("Pass, Loan Amount Text displayed successfully");
			
			oBrowser.findElement(By.name("rate")).clear();	 
			oBrowser.findElement(By.name("rate")).sendKeys("10");
			 
			oBrowser.findElement(By.name("months")).clear(); 
			oBrowser.findElement(By.name("months")).sendKeys("100");
			
			oBrowser.findElement(By.name("button")).click();
			
			String sExpectedEMI = "2955.61".trim();
			String sActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value").toString().trim();
			
			Assert.assertTrue(sExpectedEMI.equals(sActualEMI), "Fail, Calculated EMI is not as per expected EMI");
			System.out.println("Pass, Calculated EMI is as per expected EMI");
	}
}
