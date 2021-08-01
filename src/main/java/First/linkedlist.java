package First;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Selenium");
		llist.clear();
		System.out.println(llist);
	
	llist.add("Reinitialize");
	llist.addFirst("First");
	llist.addLast("Not Last");
	llist.add("actual last");
	llist.add(1, "adding at index");

	System.out.println(llist);
	
	Iterator<String> it=llist.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	}
}
