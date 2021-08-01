package First;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class retryGloballogic {

	@Test
	public void testForRetry()
	{
		assertTrue(false);
	}

	@Test
	public void testPassRetry()
	{
		assertTrue(true);
	}

}