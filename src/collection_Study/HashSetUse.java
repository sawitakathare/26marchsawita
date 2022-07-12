package collection_Study;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("sawita");
		hs.add("sawita");
		hs.add(null);
		hs.add(null);
		hs.add(100);
		hs.add(13.46f);
		hs.add('A');
		System.out.println(hs);
		System.out.println("====================");
	
		for(Object m:hs)
		{
			System.out.println(m);
		}
		
		System.out.println("====================");
		
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
