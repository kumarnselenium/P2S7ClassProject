package javaConceptsClasses;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExForExceptions {

	
	public void exForThrows() throws Exception
	{
		Thread.sleep(3000);
	}
	
	public void exForTryCatch()
	{
		try {
			Thread.sleep(3000);
			//Logic to read the file
		} catch (Exception e) {
			//Create file and then read it
			e.printStackTrace();
		}
	}
	
	
	
}
