package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		//not retain any order
		//Set<String> set1 = new HashSet<String>();
		
		//reatin order
		//Set<String> set1 = new LinkedHashSet<String>();
		
		
		//alphabetical oredr
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			set1.add("bridgelabzz");
		}
		set1.add("pooja");
		set1.add("eooja1");
		set1.add("zooja2");
		set1.add("mooja3");
		set1.add("sooja4");
		
		//adding duplicates items
		
		set1.add("pooja3");
		
//		System.out.println(set1);
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		//does set contain particular number
		if(set1.contains("mooja3")) {
			System.out.println("available");
		}
		
		
		
		//intesection common elements in set 1 and 2
		
		Set<String> set2 = new TreeSet<String>();
		
		if(set2.isEmpty()) {
			set2.add("bridgelabzz set 2");
		}
		set2.add("pooja set 2");
		set2.add("eooja1 set 2");
		set2.add("zooja2");
		set2.add("mooja3 set 2");
		set2.add("sooja4 set 2");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(set1);
		
		intersection.retainAll(set2);
		
		System.out.println("here is"+intersection);
		
		//difference
		Set<String> diffrence = new HashSet<String>(set1);
		
		diffrence.removeAll(diffrence);
		
		System.out.println("here differnce is"+diffrence);
		
	}

}
