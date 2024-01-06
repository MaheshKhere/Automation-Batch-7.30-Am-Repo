package collections;

import java.util.ArrayList;

public class ArrayList_Ex {

	public static void main(String[] args) {
		
		ArrayList<String> ab = new ArrayList<String>();
		
		// To add data in list - use add( "");
		ab.add("Pranali");
		ab.add("Poonam");
		ab.add(2, "Chetan");
		ab.add(3, "Rohan");
		ab.add("Dipali");
		ab.add("Jyoti");
		ab.add("Rashami");
		ab.add("Mahesh");
		ab.add("Siya");
		ab.add("Sakshi");
		ab.add(null);
		ab.add(null);
		
		//System.out.println(ab.get(9));
		ab.add(10, "Rashami");
		ab.add(11, "abc");	
		
		String v = ab.get(0); // To get value with respect to index
		System.out.println("The value of 0 th index is :- "+ v);
		
		System.out.println("The value of 5th index is :- "+ ab.get(5));
		
		//ab.remove(0); // value remove at 0 th index
		//ab.remove("Siya"); // 
		//ab.remove("Rashami");
		//ab.remove(7);
		
		System.out.println(ab.contains("Dipali")); // To search any value 
		System.out.println(ab.contains("Rashami"));
		
		System.out.println("Index of value is:- "+ ab.indexOf("Poonam")); // To get index w.r t. value
		//ab.clear(); // To remove all values in list
		
		System.out.println("The size of Arraylist is:- "+ ab.size()); // to get size of list
		
		System.out.println("Is List empty :- "+ ab.isEmpty());
		
		ab.add("Jyoti Jiwtode");
		System.out.println(ab);// to Print all values in list
		System.out.println(ab.clone()); // create duplicate copy of arraylist
		
		
		// 
		
		
	
		
		
		
		

	}

}
