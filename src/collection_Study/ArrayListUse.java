package collection_Study;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList(); //generic arraylist
		a1.add("Sawita"); //0
		a1.add("March-26");//1
		a1.add('A'); //2
		a1.add(120); //3
		a1.add(120.120f); //4
		a1.add("Sawita"); //5
		a1.add(null);//6
		a1.add(null);//7
		
		System.out.println(a1);
		System.out.println(a1.size());
		
		System.out.println(a1.indexOf("Sawita"));
		System.out.println(a1.lastIndexOf("Sawita"));
		System.out.println(a1);
		System.out.println("==============");
		System.out.println(a1.get(4));
		System.out.println(a1.remove(4));
		System.out.println(a1.get(4));
		System.out.println("=====================");
		System.out.println(a1);
		a1.set(2, 'B');
		System.out.println(a1);
		
		
		System.out.println(a1.isEmpty());
		
		System.out.println(a1.contains(120));
		
		System.out.println(a1.get(4));
		
		System.out.println(a1);
		a1.add(1, "morning batch");   // right shift--> when you are inserting element in between arraylist
		System.out.println(a1);
		a1.remove(1);  //left shit--> when you try to remove/delete from in between of arraylist
		System.out.println(a1);
		System.out.println("===================");
		
		
		for(int i=0; i<=a1.size()-1; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("====================");
		
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================");
      
		
		for(Object v:a1)
		{
			System.out.println(v);
		}
		System.out.println("===============");
		
	ListIterator lit = a1.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	System.out.println("=====================");
	while(lit.hasPrevious())
	{
		System.out.println(lit.previous());
	}
	System.out.println("==========================");
		System.out.println("================");
		ArrayList<String> a= new ArrayList<>(); //specific arraylist
		a.add("pune");
		a.add("pune");
		a.add("mull");
		a.add("null");
		a.add("mumbai");
		a.add("satara");
		a.add("sangali");
		System.out.println(a);
		a.clone();
		System.out.println(a);
		
		
	}

}
