package javaConceptsClasses;

import transport.*;

public class ExForCar {

	public static void main(String args[])
	{
		Car oAcura = new Car();
		//oAcura.sColor = "Blue";
		
		Car oLexus = new Car("Red", 4);
		oLexus.start();
		
		Calculator oCalc = new Calculator();
		oCalc.addition(true);
	}
	
}
