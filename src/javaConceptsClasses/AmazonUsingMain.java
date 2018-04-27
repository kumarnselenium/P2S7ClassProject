package javaConceptsClasses;

public class AmazonUsingMain {

	public void login()
	{
		System.out.println("SWD logic to Login");
	}
	
	public void purchaseItems()
	{
		System.out.println("SWD logic to purchaseItems");
	}
	
	public void updateOrder()
	{
		System.out.println("SWD logic to updateOrder");
	}
	
	public void removeOrder()
	{
		System.out.println("SWD logic to removeOrder");
	}
	
	public void logout()
	{
		System.out.println("SWD logic to logout");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		AmazonUsingMain oAmazon = new AmazonUsingMain();
		
		//TS1_CreateOrder
		oAmazon.login();
		oAmazon.purchaseItems();
		oAmazon.logout();
		
		//TS2_ModifyOrder
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		
		//TS3_DeleteOrder
		oAmazon.login();
		oAmazon.removeOrder();
		oAmazon.logout();
	}
	
}
