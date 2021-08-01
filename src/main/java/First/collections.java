package First;

import java.util.*;

public class collections {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		List<String> al1 = new ArrayList<String>(Arrays.asList(""));
		System.out.println(al1);

		// Add
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add(2, "f");

		// Add collection
		al1.addAll(al);
		// Replace
		al.set(1, "");

		System.out.println(al.size());
		System.out.println(al);

		// Remove
		al.remove("c");
		al.remove("g");
		al.remove(0);
		al.remove(1);
		al.ensureCapacity(6);

		System.out.println(al.contains("randomText"));
		System.out.println(al.toString());
		System.out.println(al.get(1));
		al.trimToSize();
		System.out.println(al.size());
		//////////////

		LinkedList<String> list = new LinkedList<String>();
		list.add("Start it");
		list.add("Process it");
		list.addFirst("Horn OK");
		list.addLast("Please");
		System.out.println(list);
		
		
		Queue<String> q = new LinkedList<String>();
	    
	      //Adding elements to the Queue
	      q.add("Rick");
	      q.add("Maggie"); 
	      q.add("Glenn");
	      q.add("Negan");
	      q.add("Daryl");
		    
	      System.out.println("Elements in Queue:"+q);

	      /*
	       * We can remove element from Queue using remove() method,
	       * this would remove the first element from the Queue 
	       */
	      System.out.println("Removed element: "+q.remove());
		    
	      /*
	       * element() method - this returns the head of the
	       * Queue. Head is the first element of Queue
	       */
	      System.out.println("Head: "+q.element());
		    
	      /*
	       * poll() method - this removes and returns the 
	       * head of the Queue. Returns null if the Queue is empty
	       */
	      System.out.println("poll(): "+q.poll());
		    
	      /*
	       * peek() method - it works same as element() method,
	       * however it returns null if the Queue is empty
	       */
	      System.out.println("peek(): "+q.peek());
		    
	      //Again displaying the elements of Queue
	      System.out.println("Elements in Queue:"+q);
	   }
	
}
