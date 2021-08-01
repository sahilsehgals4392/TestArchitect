package First;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class parallelJunit2 extends driverInitialise {


	@Before
	public void getUrl()
	{
		initialise();
		System.out.println("Class B starts");
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test
    public void test_B1() {
        System.out.println("Class B Test 1");
    	driver.get("www.facebook.com");    	
    	System.out.println("Class B Test 1 ends");
    }

    @Test
    public void test_B2() {
        System.out.println("Class B Test 2");
        driver.get("www.twitter.com");
        assertTrue("Testing5", false);
        System.out.println("Class B Test 2 ends");
    }
    
    @After
    public void reset()
    {
    	driver.close();
    }
    
}
