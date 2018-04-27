package javaConceptsClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AmazonUsingJunit {

	@Before
	public void login()
	{
		System.out.println("SWD logic to Login");
	}
	
	@Test
	public void amazonTest()
	{
		purchaseItems();
		login();
		updateOrder();
		logout();
		login();
		removeOrder();
	}
	
	//@Test
	public void purchaseItems()
	{
		System.out.println("SWD logic to purchaseItems");
	}
	
	//@Test
	public void updateOrder()
	{
		System.out.println("SWD logic to updateOrder");
	}
	
	//@Test
	public void removeOrder()
	{
		System.out.println("SWD logic to removeOrder");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD logic to logout");
		System.out.println();
	}
	
	
}
