package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	
	private LinkedList<String> urls = new LinkedList<String>();

	public UrlLibrary() {
			urls.add("www.bridgeit.com");
			urls.add("www.google.com");
			urls.add("www.udemy.com");
			urls.add("www.facebook.com");
	}

	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
	
	

}
