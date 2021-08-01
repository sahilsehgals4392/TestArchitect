package First;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class arrayduplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]=new String[5];
		String arr2[]= {"Java","Selenium","Java","testcomplete",};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i+1; j < arr2.length; j++) {
		if(arr2[i].equals(arr2[j]))
				{
			System.out.println("Duplicate element is "+arr2[i]);
				}
			}
			
		}
		
		//Logic 2
		Set<String>set=new HashSet<String>();
		for(String arrayEntries:arr2)
		if(!set.add(arrayEntries))
		System.out.println("Duplicate element is "+ arrayEntries);


	//Logic 3
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(String arrEntries:arr2)
	{
	if(map.get(arrEntries)!=null)
	{
		int count=map.get(arrEntries);
		map.put(arrEntries, ++count);
	}
	else
	{
		map.put(arrEntries, 1);
	}
	}
	
	for(Entry<String,Integer>entry:map.entrySet())
	{
		if(entry.getValue()>1)
		{System.out.println(entry.getKey()+"number of occurences"+ entry.getValue());}
	}
	
	System.out.println(map);
}
	}