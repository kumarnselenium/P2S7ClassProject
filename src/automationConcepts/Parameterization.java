package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelReadByJXL;
import utilities.ExcelReadByPOI;

public class Parameterization {

	public void dealLoansSingleSet() throws InterruptedException	 
	{
			//ExcelReadByPOI oExcelRead = new ExcelReadByPOI("/Users/narkandukuri/Documents/Personal/Sel/P2S7/DealLoan.xlsx", "EMICalc");
			ExcelReadByJXL oExcelRead = new ExcelReadByJXL("/Users/narkandukuri/Documents/Personal/Sel/P2S7/DealLoan.xls", "EMICalc");
		
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			 
			WebDriver oBrowser = new ChromeDriver();
			 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
			 
			oBrowser.manage().window().maximize();		 
		
			Thread.sleep(5000);		 
		
			//String sLoanAmount = oExcelRead.getCellData("LoanAmount", 1);
			
			oBrowser.findElement(By.id("Loan_Amount")).clear();		 
			oBrowser.findElement(By.id("Loan_Amount")).sendKeys(oExcelRead.getCellData("LoanAmount", 1));
		
			oBrowser.findElement(By.name("rate")).clear();	 
			oBrowser.findElement(By.name("rate")).sendKeys(oExcelRead.getCellData("IR", 1));
			 
			oBrowser.findElement(By.name("months")).clear(); 
			oBrowser.findElement(By.name("months")).sendKeys(oExcelRead.getCellData("Tenure", 1));
			
			oBrowser.findElement(By.name("button")).click();
			Thread.sleep(5000);
			 
			//oBrowser.quit();	
	 
	}

	@Test
	public void dealLoansMultipleSetsOfData() throws InterruptedException	 
	{
			//ExcelReadByPOI oExcelRead = new ExcelReadByPOI("/Users/narkandukuri/Documents/Personal/Sel/P2S7/DealLoan.xlsx", "EMICalc");
			ExcelReadByJXL oExcelRead = new ExcelReadByJXL("/Users/narkandukuri/Documents/Personal/Sel/P2S7/DealLoan.xls", "EMICalc");
			
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");			 
			WebDriver oBrowser = new ChromeDriver();
			 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
			 
			oBrowser.manage().window().maximize();		 
		
			Thread.sleep(2000);		 
	
			for(int iRow=1; iRow<oExcelRead.rowCount(); iRow++)
			{
			
				//String sLoanAmount = oExcelRead.getCellData("LoanAmount", 1);			
				oBrowser.findElement(By.id("Loan_Amount")).clear();		 
				oBrowser.findElement(By.id("Loan_Amount")).sendKeys(oExcelRead.getCellData("LoanAmount", iRow));
			
				oBrowser.findElement(By.name("rate")).clear();	 
				oBrowser.findElement(By.name("rate")).sendKeys(oExcelRead.getCellData("IR", iRow));
				 
				oBrowser.findElement(By.name("months")).clear(); 
				oBrowser.findElement(By.name("months")).sendKeys(oExcelRead.getCellData("Tenure", iRow));
				
				oBrowser.findElement(By.name("button")).click();
				Thread.sleep(3000);
				 
				//oBrowser.quit();	
			}
	}
	
}
