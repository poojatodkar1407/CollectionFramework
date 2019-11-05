package collections;

import java.util.ArrayList;


public class ArrayList1 {

	public static void main(String[] args) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			//adding elements in arraylist
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			
			System.out.println(numbers.get(0));
			System.out.println();
			//iterate
			for(int i=0;i<numbers.size();i++)
			{
				System.out.println(numbers.get(i));
			}
			System.out.println();
			for(Integer value: numbers) {
			
				System.out.println(value);
			}
			System.out.println();
			numbers.remove(numbers.size()-1);
			
			for(Integer value: numbers) {
				
				System.out.println(value);
			}
			
			
			//List inteface is used
			
	}

}
