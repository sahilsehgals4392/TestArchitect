package First;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;


public class SimpleTestngCode {
	
public void simpleTestNGTest(){
//List of xml suites to be considered for test execution
List<XmlSuite> suites = new ArrayList<XmlSuite>();
//List of classes to be considered for test execution
List<XmlClass> classes = new ArrayList<XmlClass>();
//Defines a simple xml suite with a name
XmlSuite suite = new XmlSuite();
suite.setName("Simple Config suite");
//Defines a xml test for a suite and with a said name
XmlTest test = new XmlTest(suite);
test.setName("Simple config test");
//A single xml class to be considered for execution
XmlClass clz = new XmlClass("SampleTest");
classes.add(clz);
//Sets the list of classes to be considered for execution for a test
test.setXmlClasses(classes);
//Adds a single suite to the list suites
suites.add(suite);
}
public static void main(String[] args){
SimpleTestngCode smpCd= new SimpleTestngCode();
smpCd.simpleTestNGTest();
}
}