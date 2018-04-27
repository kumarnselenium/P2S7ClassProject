package javaConceptsClasses;

class Calculator 
{
	int iInput1, iInput2, iOutput;
	
	public int getInput1()
	{
		return iInput1;
	}
	
	public void setInput1(int I1)
	{
		iInput1 = I1;
	}
	
	public int getInput2()
	{
		return iInput2;
	}
	
	public void setInput2(int I1)
	{
		iInput2 = I1;
	}
	
	public int getOutput()
	{
		return iOutput;
	}
	
	public void setOutput(int I1)
	{
		iOutput = I1;
	}
	
	final void addition()
	{
		iOutput = iInput1+iInput2;
		System.out.println("Addition: " + iOutput);
	}
	
	static void addition(boolean a)
	{
		
		System.out.println(a);
	}
	
	void substraction()
	{
		iOutput = iInput1-iInput2;
		System.out.println("Substraction: " + iOutput);
	}
	
	void multiplication()
	{
		iOutput = iInput1*iInput2;
		System.out.println("Multiplication: " + iOutput);
	}
	
	void division()
	{
		iOutput = iInput1/iInput2;
		System.out.println("Division: " + iOutput);
	}

	public static void main(String args[])
	{
		Calculator oCalc = new Calculator();
		
		oCalc.iInput1 = 10;
		oCalc.iInput2 = 5;
		
		oCalc.addition();		//10, 5
		oCalc.substraction();	//814, 52
		oCalc.multiplication();	//25, 362
		oCalc.division();	//2592, 252
	}
	
}
