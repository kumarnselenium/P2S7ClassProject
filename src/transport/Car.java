package transport;


public class Car {

	String sColor;	
	float fLenghth;	
	int iNumberOfDoors;	
	boolean bIsAutoTransmission;	
		
	public void setColor(String sColorOfCar)
	{
		sColor = sColorOfCar;
	}
	
	public String getColor()
	{
		return sColor;
	}
	
	public void setLength(float fLengthOfCar)
	{
		fLenghth = fLengthOfCar;
	}
	
	public float getLength()
	{
		return fLenghth;
	}
	
	public Car()
	{
		
	}
	
	public Car(String sColorOfCar, int iNofDoors)
	{
		sColor = sColorOfCar;
		iNumberOfDoors = iNofDoors;
		//logic
	}
		
	void moveForward()	
	{	
		//sColor.
		
		System.out.println("Logic related to move forward");
	}	
		
	void moveBackward()	
	{	
		System.out.println("Logic related to move backward");
	}	
		
	public void start()	
	{	
		System.out.println("Logic related to start");
	}	
		
	void stop()	
	{	
		System.out.println("Logic related to stop");
	}	
	
	public static void main(String args[])
	{
		Car oBMW = new Car();	//Initialization
		
		oBMW.sColor = "Red";
		
		oBMW.start();
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
		Car a = new Car();
		a.sColor = " asaf";
		
		
		int iTotalQty;
		Car oHonda;		//Declaring
		oHonda = new Car();	//Assigning
		
		
	}
}




