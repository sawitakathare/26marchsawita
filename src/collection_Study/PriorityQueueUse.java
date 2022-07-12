package collection_Study;

import java.util.PriorityQueue;

public class PriorityQueueUse {

	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add("abc");
		pq.add("pqr");
		pq.add("lmn");
		pq.add("xyz");
		pq.add("aaa");
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println("remove method "+pq.remove());
		pq.poll();
		pq.poll();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);

	}

}
