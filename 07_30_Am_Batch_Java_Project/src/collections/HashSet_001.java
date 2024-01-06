package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_001 {

	public static void main(String[] args) {
		// hashSet
		HashSet<Integer> hs= new HashSet<Integer>();
		// Add value from 10 to 20 
//		for (int x= 15; x<=25; x++) {
//			hs.add(x);
//		}
		// To print all Values in hashset
		//System.out.println(hs);
		// To add value in hashset
		hs.add(29);
		hs.add(59);
		hs.add(45);
		hs.add(45);
		hs.add(null);
		hs.add(null);
		hs.add(60);
		hs.add(90);
		
		hs.remove(59); // To remove any values
		System.out.println(hs.contains(45));
		
		//hs.clear(); // to remove all values
		
	
		// To create duplicate copy
		//System.out.println(hs.clone());
		System.out.println(hs);
		
		// To print all values using iterator
	 Iterator<Integer> i = hs.iterator();
	 while (i.hasNext()) {
		 System.out.println(i.next()); 
	 }

	}

}
