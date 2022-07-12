import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		
		ll.add("mukesh");
		ll.add('A');
		ll.add(90);
		ll.add(21.25f);
		ll.add(true);
		ll.add("Mukesh");
		ll.add("null");
		ll.add("null");
		System.out.println(ll);
		
		System.out.println(ll.clone());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(4));
		System.out.println(ll.isEmpty());
		//System.out.println(ll.remove(3));
		System.out.println(ll.peek());
		//System.out.println(ll.poll());
		//System.out.println(ll.pop());
		//System.out.println(ll.pop());
		//System.out.println(ll.get(0));
		//System.out.println(ll.get(1));
		//System.out.println(ll);
		
		System.out.println("=================");
		
		for(Object p:ll)
		{
			System.out.println(p);
		}
		System.out.println("=============");
		
		Iterator ite = ll.iterator();
		while (ite.hasNext()) 
		{
			System.out.println(ite.next());
		}
         System.out.println("===================");
         
         ListIterator lite = ll.listIterator();
         while (lite.hasNext()) 
         {
        	 System.out.println(lite.next());
		}
       System.out.println("======================");
       
       for(int i=0; i<=ll.size()-1; i++)
       {
    	   System.out.println(ll.get(i));
       }
       System.out.println("=====================");
        System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll);
	}

}
