package First;

import org.testng.annotations.Test;


public class dataProviderMethod {
	
	@Test(dataProvider = "data-provider",dataProviderClass=dataProviderClass.class)
	public void testMethod(String data1) 
	{
	System.out.println("Data is: " + data1);
	}
}
