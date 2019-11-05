package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("main");
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		timings("ArrayList", arrayList);
		timings("LinkedList",linkedList);

	}
	
	private static void timings(String type,List<Integer> list) {
		
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<100000;i++) {
			list.add(10,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time taken "+(end-start)+" ms for "+type);
	}

}
