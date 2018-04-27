package javaConceptsClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonUsingTestNG {

	@BeforeMethod
	public void login()
	{
		System.out.println("SWD logic to Login");
	}
	
	@Test (priority =25)
	public void purchaseItems()
	{
		System.out.println("SWD logic to purchaseItems");
	}
	
	@Test (priority =79)
	public void updateOrder()
	{
		System.out.println("SWD logic to updateOrder");
	}
	
	@Test (priority =255)
	public void removeOrder()
	{
		System.out.println("SWD logic to removeOrder");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		System.out.println("SWD logic to logout");
		System.out.println();
		Thread.sleep(3000);	//Wait
	}
	
	
}





















































