package First;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InvalidObjectException;


public class TestngPractice {
	
	@BeforeGroups(groups="High")
	public void beforeGroup()
	{
		System.out.println("Group High");
		
	}
	@Test(priority=1,groups={"High"},enabled=false)
	public void methodOne()
	{System.out.println("1");
	}
	@Test(groups={"Low"},priority=3,dependsOnMethods={"methodThree"},dependsOnGroups={"High"})
	public void methodTwo()
	{
		System.out.println("2 (groups={Low},priority=3,dependsOnMethods={methodThree},dependsOnGroups={High})");
	}
	@Test(priority=3)
	public void methodThree()
	{
		System.out.println("3");
	}
	
	@Test(priority=2,groups={"High"})
	public void methodFour()
	{System.out.println("4");
	}
	
	@Test(dependsOnGroups={"High"},timeOut=100)
	public void methodFive()
	{System.out.println("5");}

	@Test(expectedExceptions={IOException.class},
			expectedExceptionsMessageRegExp="Pass Message test")
			public void exceptionMsgTestOne() throws Exception{
			throw new IOException("Pass Message test");
			}
			/**
			* Verifies the exception message using the regular exception.
			* This test verifies that the exception message contains a
			text "Message" in it.
			*/
			@Test(expectedExceptions={IOException.class},
			expectedExceptionsMessageRegExp=".* Message .*")
			public void exceptionMsgTestTwo() throws Exception{
			throw new Exception("Pass Message test");
			}
			@Test(expectedExceptions={InvalidObjectException.class},expectedExceptionsMessageRegExp="Invalid Object")
			public void exceptionMessage() throws Exception
			{
				throw new InvalidObjectException("Invalid Object");
			}
			/**
			* Verifies the exception message based on the exact error
			message thrown.
			* This is to show that TestNG fails a test when the exception
			message does not match.
			*/
			@Test(expectedExceptions={IOException.class},
			expectedExceptionsMessageRegExp="Pass Message test")
			public void exceptionMsgTestThree() throws Exception{
			throw new IOException("Fail Message test");
			}
			}
