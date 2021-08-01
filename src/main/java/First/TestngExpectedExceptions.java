package First;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class TestngExpectedExceptions {

	ArrayList<String> listObj = new ArrayList<String>();
	@BeforeClass
	public void beforeClass(){
	listObj.add("Sample-0");
	listObj.add("Sample-1");
	listObj.add("Sample-2");
	}
	@Test
	public void verifyDataBasedOnIndex(){
	String data = listObj.get(0);
	Assert.assertEquals(data, "Sample","Data dont match");
	}
	@Test(expectedExceptions=IndexOutOfBoundsException.class)
	public void verifyForWrongIndex(){
	listObj.get(4);
	}
	@Test
	public void verifySize(){
	Assert.assertTrue(listObj.size()==2,"Size not match");
	}
}
