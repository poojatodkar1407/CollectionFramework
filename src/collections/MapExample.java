package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap(hashMap);
		treeMap(linkedHashmap);
		treeMap(treeMap);

	}

	public static void treeMap(Map<Integer, String> map) {
		System.out.println("hello");

		
		map.put(10, "asd");
		map.put(5, "asd1");
		map.put(30, "asd2");
		map.put(440, "asd3");
		map.put(150, "asd4");
		map.put(1, "asd5");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key+ ": "+value);
		}
		
	}
}
