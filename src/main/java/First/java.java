package First;

import java.util.*;

public class java {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("ArrayList");
		list.add("Linked");
		System.out.println(list);
		for(String listcontent:list)
		{	
			System.out.print(listcontent.length()+" :");
			System.out.println(listcontent);
		}
		for(Iterator<String>iterator=list.iterator();iterator.hasNext();)
		{
			System.out.println(list.size());
			System.out.println(iterator.next());
		}
	
		
	//SET CAN'T CONTAIN DUPLICATE ITEMS
	Set<String>set=new LinkedHashSet<String>();
	set.add("SET CAN'T CONTAIN DUPLICATE ITEMS");
	set.add("Selenium");
	set.add("Selenium");
	set.add("Auto");
	set.add("dekho");
	set.add("1");
	set.add("2");
	set.add("15");
	set.add("23");
	
	for(String setcontent:set)
	System.out.println(setcontent);
	
	
	StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");
	// Calling the Method
	convertOpposite(str);

	System.out.println(str);
	
}
	
	static void convertOpposite(StringBuffer str)
	{
		int ln = str.length();
			
		// Conversion using predefined methods
		for (int i=0; i<ln; i++)
		{
			char c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.setCharAt(i, Character.toUpperCase(c));
			else
				str.setCharAt(i, Character.toLowerCase(c));
			
		}
	
}}