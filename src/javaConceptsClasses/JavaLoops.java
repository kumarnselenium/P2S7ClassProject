package javaConceptsClasses;

import org.junit.Test;

public class JavaLoops {

	public void exForIFLoop()
	{
		String sCustState = "NY";
		int iCustAge = 65;
		
		if(sCustState=="CA")
		{
			System.out.println("Impose 10% tax");
		}
		
		String sGender = "female";
		String sMartialStatus = "Married";
		
		if(sGender == "female" && sMartialStatus == "Married")
		{
			System.out.println("Are you pregnant");
		}
			
		
		if(sCustState=="CA" && iCustAge>60)
		{
			System.out.println("Rebate 10% tax");
		}
		

		if(sCustState=="CA" || iCustAge>60)
		{
			System.out.println("Rebate 10% tax");
		}
		
		if(! (sCustState=="CA"))
		{
			System.out.println("Rebate 10% tax");
		}
	}
	
	public void exForIfElseLoop()
	{
		String sCustState = "NY";
		
		if(sCustState=="CA")
		{
			System.out.println("Impose 10% tax");
			//exForIFLoop();
		}
		else
		{
			System.out.println("Impose 9% tax");
		}
		
	}

	public void exForNestedIfElseLoop()
	{
		String sCustState = "NY1";
		
		if(sCustState=="CA")
		{
			System.out.println("Impose 10% tax");
		}
		else if(sCustState=="FL")
		{
			System.out.println("Impose 7% tax");
		}
		else if(sCustState=="NY")
		{
			System.out.println("Impose 9% tax");
		}
		else
		{
			System.out.println("Impose 8% tax");
		}
		
	}

	public void exForNestedIfElseLoopWithIn()
	{
		String sCustState = "NY1";
		int iCustAge = 59;
		String sGender = "male";
		
		if(sCustState=="CA")	
		{
			if(iCustAge>60)
			{
				System.out.println("Impose 9.5% tax");
			}
			else
			{
				if(sGender=="male")
				{
					System.out.println("Impose 10% tax");
				}
				else
				{
					System.out.println("Impose 9.75% tax");
				}
			}
		}
		else if(sCustState=="FL")
		{
			System.out.println("Impose 7% tax");
		}
		else if(sCustState=="NY")
		{
			System.out.println("Impose 9% tax");
		}
		else
		{
			System.out.println("Impose 8% tax");
		}
		
	}

	public void switchLoop()
	{
		String sCustState = "FL";
	
		switch (sCustState) {
			case "CA":
				System.out.println("Impose 10% tax");
				break;
			case "FL":
				System.out.println("Impose 7% tax");
				//break;
			case "NY":
				System.out.println("Impose 9% tax");
				//break;
			default:
				System.out.println("Impose 8% tax");
				break;
		}
	}

	public void exForWhileLoop()
	{
		int i =104;
		
		while(i<=10)	//till this(i<=10) condition
		{
			System.out.println(i);
			i++;	//i=i+1	//i=i+2	//incrementor
		}
		/*
		int j =10;
		
		while(j>=1)	
		{
			System.out.println(j);
			j--;	//j=j+1	//j=j-2	//decrementor
		}
		*/
	}
	
	public void exForDoWhileLoop()
	{
		int i =104;
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		do
		{
			//login with admin/admin
			//check for 3 times, break;
		}while(2<3); //SWD Logic to check for account summary screen not displayed;
		
	}
	
	public void exForFORloop()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
}

























