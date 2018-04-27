package javaConceptsClasses;

import org.junit.Test;

public class StringOperations {

	@Test
	public void exForStringOperations()
	{
		String sUserName = "Kumar39";
		String str1 = "Welcome Kumar39 to Amazon ";
		String str2 = "Thanks for your order! order# 678456123. Please use this num for future use";
		String promoCode = " SALE25 ";
		String sTransactionNum = "AV19509ABK";
		
		if(sTransactionNum.length()==10)
		{
			System.out.println("Pass, Transaction Number is 10 chars");
		}
		else
		{
			System.out.println("Fail, Transaction Number is not 10 chars");
		}
		
		System.out.println(str1.concat(str2));	//Welcome Kumar39 to Amazon Thanks for your order! order# 678456123
		System.out.println(str1 + str2);	//Welcome Kumar39 to Amazon Thanks for your order! order# 678456123
		
		//Contains
		if(str1.contains(sUserName))	//32
		{
			System.out.println("Contain is successful");
		}
		else
		{
			System.out.println("Contain is unsuccessful");
		}
		
		//Equals
		if(str1.trim().equals("Welcome Kumar39 to AmazoN "))	//46
		{
			System.out.println("Equals is successful");
		}
		else
		{
			System.out.println("Equals is unsuccessful");
		}
		
		if(str1.equalsIgnoreCase("Welcome Kumar39 to AmazoN "))	//51
		{
			System.out.println("equalsIgnoreCase is successful");
		}
		else
		{
			System.out.println("equalsIgnoreCase is unsuccessful");
		}
		
		System.out.println(promoCode);			//" SALE25 "
		System.out.println(promoCode.trim());	//"SALE25"
		
		System.out.println(str2.substring(30, 38));
		System.out.println(str2.substring(str2.indexOf("# "), str2.indexOf(". P")));
		
		System.out.print(str1.replace(" ", "XYZ"));
	}
	
}










