package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add(100);//0
		v.add("Velocity");//1
		v.add(83.26f);//2
		v.add('A');//3
		v.add(100);//4
		v.add(null);//5
		v.add(null);//6
		System.out.println(v);
		System.out.println("==============");
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.get(4));
		System.out.println(v.contains(100));
		System.out.println(v.indexOf(100));
		System.out.println(v.isEmpty());
		System.out.println(v);
		System.out.println("===================");
		System.out.println("===============");
		
		v.add(3, 'B');
		System.out.println(v);
		System.out.println("===========");
		
		v.remove(5);
		System.out.println(v);
		System.out.println("===============");
		
		for(Object c:v) 
		{
			System.out.println(c);
		}
		System.out.println("==========");	
		
		Iterator it = v.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("=============");
		
		ListIterator lit = v.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("===============");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	
	}

}
