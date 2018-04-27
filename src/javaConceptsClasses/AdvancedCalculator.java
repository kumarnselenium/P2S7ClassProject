package javaConceptsClasses;

class AdvancedCalculator extends Calculator
{
	void squareRoot()
	{
		System.out.println("Sq Root");
	}
	
	void percentile()
	{
		System.out.println("Percentile");
	}
	
	void sin()
	{
		System.out.println("Sin");
		//super.multiplication();
		//this.percentile();
	}
	
	void addition(String a)
	{
		iOutput = iInput1+iInput2+10;
		System.out.println(iOutput);
	}
	
	public static void main(String args[])
	{
		AdvancedCalculator oCalc = new AdvancedCalculator();
		
		oCalc.addition();
		
		oCalc.substraction();
		
		oCalc.sin();
		
	}
	
}
