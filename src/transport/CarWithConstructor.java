package transport;

public class CarWithConstructor {

	public String sColor;	
	float fLenghth;	
	int iNumberOfDoors;	
	boolean bIsAutoTransmission;	
		
	//Parameterized Constructor
	public CarWithConstructor(int iDoors, String sColorOFCar)
	{
		
	}
	
	public CarWithConstructor()
	{
		
	}
	
	public CarWithConstructor(int iTotalDoors)
	{
		
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
		
	void start()	
	{	
		System.out.println("Logic related to start");
	}	
		
	void stop()	
	{	
		System.out.println("Logic related to stop");
	}	
	
	public static void main(String args[])
	{
		CarWithConstructor oBMW = new CarWithConstructor();	//Initialization
		
		oBMW.sColor = "Red";
		
		oBMW.start();
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
		CarWithConstructor a = new CarWithConstructor();
		a.sColor = " asaf";
		
		
		int iTotalQty;
		CarWithConstructor oHonda;		//Declaring
		oHonda = new CarWithConstructor();	//Assigning
		
	}
}
