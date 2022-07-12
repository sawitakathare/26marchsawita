package collection_Study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetUse {

	public static void main(String[] args) {
		LinkedHashSet lh= new LinkedHashSet();
		lh.add("Velocity");
		lh.add(100);
		lh.add('A');
		lh.add(null);
		lh.add(null);
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.remove(100));
		System.out.println(lh.contains('A'));
		System.out.println(lh.size());
		System.out.println("=================");
		
		for(Object n:lh)
		{
			System.out.println(n);
		}
		System.out.println("===================");
		
		Iterator lt = lh.iterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
	}

}
