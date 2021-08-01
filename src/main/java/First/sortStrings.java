package First;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
public class sortStrings {

	public static void main(String[] args) {
		
		String[] arr= {"Steve","Beckam", "Chairos","Tesla","Cardboad"};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		/*
		 *USING TREESET
		 */
		Set<String> set=new TreeSet<String>();
		
		for(String arrItems:arr)
			set.add(arrItems);

	
	System.out.println(set);
		
	
	}
}
