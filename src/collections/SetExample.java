package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		//not retain any order
//		Set<String> set1 = new HashSet<String>(); 
	//reatin order
//		Set<String> set1 = new LinkedHashSet<String>();
		//alphabetical oredr
		Set<String> set1 = new TreeSet<String>();
		set1.add("pooja");
		set1.add("eooja1");
		set1.add("zooja2");
		set1.add("mooja3");
		set1.add("sooja4");
		
		//adding duplicates items
		
		set1.add("pooja3");
		
//		System.out.println(set1);
		
		for(String element: set1) {
			System.out.println(set1);
		}
	}

}
