import java.util.Hashtable;

public class HashTableStudy {

	public static void main(String[] args) {
		Hashtable ht1= new Hashtable();
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");
		
		Hashtable ht2= new Hashtable();
		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");
		System.out.println("Mapping of ht1 : " + ht1);
		System.out.println("Mapping of ht2 : " + ht2);
		
		
	}

}
