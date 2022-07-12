package collection_Study;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUse {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add("sawita");
		ts.add("xyz");
		ts.add("abc");
		ts.add("pune");
		ts.add("xyz");
		ts.add("xxx");
		ts.add("aaa");
		//ts.add(null); //will throw nullpointer exception
		System.out.println(ts);
		System.out.println(ts.contains("abc"));
		System.out.println(ts.isEmpty());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
	
		System.out.println("=============");
		
		for(Object t:ts)
		{
			System.out.println(t);
		}
		System.out.println("============");
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==============");
	
	}

}
