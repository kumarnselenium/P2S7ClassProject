package javaConceptsClasses;

public class CalculatorWithGettersAndSetters 
{
	int iInput1, iInput2, iOutput;
	
	
	
	
	
	void addition()
	{
		iOutput = iInput1+iInput2;
		System.out.println(iOutput);
	}
	
	void substraction()
	{
		iOutput = iInput1-iInput2;
		System.out.println(iOutput);
	}
	
	void multiplication()
	{
		iOutput = iInput1*iInput2;
		System.out.println(iOutput);
	}
	
	void division()
	{
		iOutput = iInput1/iInput2;
		System.out.println(iOutput);
	}

	public static void main(String args[])
	{
		CalculatorWithGettersAndSetters oCalc = new CalculatorWithGettersAndSetters();
		
		oCalc.iInput1 = 10;
		oCalc.iInput2 = 5;
		
		oCalc.addition();		//10, 5
		oCalc.substraction();	//814, 52
		oCalc.multiplication();	//25, 362
		oCalc.division();	//2592, 252
	}
	
}
