package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.add("pooja");
		names.add("dog");
		names.add("cat");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
		
			String name1 = it.next();
			System.out.println(name1);

			if(name1.equals("dog")) {
				it.remove();
			}
		}

		// modern iteration

		for (String name : names) {
			System.out.println(name);
		}

	}

}
