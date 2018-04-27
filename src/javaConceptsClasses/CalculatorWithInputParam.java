package javaConceptsClasses;

import transport.Car;

public class CalculatorWithInputParam {
	int iOutput;
	
	void addition(int iInput1, int iInput2)
	{
		iOutput = iInput1+iInput2;
		System.out.println(iOutput);
	}
	
	void addition(int iInput1, int iInput2, int iInput3)
	{
		iOutput = iInput1+iInput2+iInput3;
		System.out.println(iOutput);
	}
	
	void addition(int iInput1, int iInput2, String sType)
	{
		iOutput = iInput1+iInput2;
		System.out.println(iOutput);
	}
	
	void substraction(int iInput1, int iInput2)
	{
		iOutput = iInput1-iInput2;
		System.out.println(iOutput);
	}
	
	void multiplication(int iInput1, int iInput2)
	{
		iOutput = iInput1*iInput2;
		System.out.println(iOutput);
	}
	
	void division(int iInput1, int iInput2)
	{
		iOutput = iInput1/iInput2;
		System.out.println(iOutput);
	}

	void orderItem(String sItemName, int iNOfItems)
	{
		
	}
	
	void setCarColor(Car oCarObj, String sColorOfCar)
	{
		//oCarObj.sColor = sColorOfCar;
	}
	
	void registerUser(String sEmailID, int SSN, boolean isCitizen)
	{
		
	}
	
	public int add(int i, int j)
	{
		int k;
		k=i+j;
		return k;
	}
	
	
	public static void main(String args[])
	{
		CalculatorWithInputParam oCalc = new CalculatorWithInputParam();
		
		oCalc.addition(10,5);		//10, 5
		oCalc.addition(10,5,625);	
		oCalc.addition(352, 526);
		oCalc.substraction(814, 52);	//814, 52
		oCalc.multiplication(25, 362);	//25, 362
		oCalc.division(2592, 252);	//2592, 252
		String sItemType="Salt";
		oCalc.orderItem(sItemType,  3);
		
		Car oHonda=new Car();
		oCalc.setCarColor(oHonda, "Blue");
	}
}



