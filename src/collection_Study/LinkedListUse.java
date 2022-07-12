package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add("Sawita");
		ll.add('A');
		ll.add(12.45f);
		ll.add(56);
	    ll.add(true);
	    
	    System.out.println(ll);
	    ll.set(0, "Velocity");
	    System.out.println(ll);
	    
	    for(int i=0; i<=ll.size()-1; i++)
	    {
	    	System.out.println(ll.get(i));
	    }
	    System.out.println("================");
	    
	    for(Object a:ll)
	    {
	    	System.out.println(a);
	    }
      System.out.println("=================");
       Iterator i = ll.iterator();
       while(i.hasNext())
       {
        System.out.println(i.next());
    	  
		}
       System.out.println("==============");
       
      ListIterator li = ll.listIterator();
      while(li.hasNext())
    	 //while(li.hasNext())
      {
    	  System.out.println(li.next());
    	  //System.out.println(li.next());
      }
		
		
	
	}

}
