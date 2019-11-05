package collections;

import java.util.HashMap;
import java.util.Map;


public class HashMap1 {

	public static void main(String[] args) {
			
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(5, "pooja");
		map.put(15, "aarti");
		map.put(25, "prasad");
		map.put(55, "vinita");

		String text = map.get(15);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+":     "+value);
		}
	}

}
