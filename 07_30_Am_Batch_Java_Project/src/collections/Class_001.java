package collections;

import java.util.ArrayList;

public class Class_001 {

	public static void main(String[] args) {

		ArrayList<String> cd = new ArrayList<String>();
		cd.add("ab");
		cd.add(1, "xy");
		cd.add(2, "op");
		cd.add("op");
		
		//cd.remove(0); 
		//cd.remove("xy");
		// to get value with respect to index
		System.out.println(cd.get(1));
		
		// To get index with respect to value
		System.out.println(cd.indexOf("op"));
		System.out.println(cd); // print all values 
	}

}
