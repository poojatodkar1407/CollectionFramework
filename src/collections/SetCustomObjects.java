package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class person{
	private int id;
	private String name;
	
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		
		return "{Id is "+id+", name is: "+name+"}";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class SetCustomObjects {

	public static void main(String[] args) {
		
		person p1 = new person(1, "one");
		person p2 = new person(2, "two");
		person p3 = new person(3, "three");
		person p4 = new person(1, "one");

		Map<person, Integer> map = new HashMap<person, Integer>();
		
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		
		
		for(person key: map.keySet()) {
			System.out.println(key+":  "+map.get(key));
		}
		
		Set<person> set = new LinkedHashSet<person>();
		
		set.add(p1);
		set.add(p2);
		set.add(p4);
		set.add(p3);
		
		System.out.println(set);
		
		

	}

}
