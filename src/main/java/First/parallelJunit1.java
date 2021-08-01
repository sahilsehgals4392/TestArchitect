package First;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class parallelJunit1 extends driverInitialise {
	@Before
	public void getUrl() throws IOException
	{
		
		initialise();
		System.out.println("Class A starts");
		driver.get("https://www.google.com/");
		
	}
	
	@Test
    public void test_A1() {
        System.out.println("Class A Test 1");
        driver.get("www.twitter.com");
        assertTrue("Testing1", true);
    	System.out.println("Class A Test 1 ends");
    }

    @Test
    public void test_A2() {
        System.out.println("Class A Test 2");
        driver.get("www.facebook.com"); 
        assertTrue("Testing5", true);
        System.out.println("Class A Test 2 ends");
    }
    
    @After
    public void reset()
    {
    	driver.close();
    }
    
}
