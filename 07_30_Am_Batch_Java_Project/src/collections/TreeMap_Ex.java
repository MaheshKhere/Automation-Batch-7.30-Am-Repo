package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Ex {

	public static void main(String[] args) {
		TreeMap<Integer, String> tp = new TreeMap<Integer, String>();

		// To add Values
		tp.put(0, "ab");
		tp.put(1, "cd");
		tp.put(3, "ef");
		tp.put(4, "gh");
		tp.put(5, "ij");
		tp.put(2, "lm");
		tp.put(1, "op");

		// To remove value
		// tp.remove(2);
		// tp.remove(0, "ab");

		// To replace value
		tp.replace(4, "xy");
		tp.replace(5, "ij", "uv");

		// To get value with respect to Index
		System.out.println("The value of Index is:-" + tp.get(4));

		// To get size
		System.out.println("The size of Map is:- " + tp.size());

		// To search any key which is present or not
		System.out.println("Is key present or not:- " + tp.containsKey(2));

		// To search any Value which is present or not
		System.out.println("Is Value present or not:- " + tp.containsValue("ab"));

		// To remove all values
		// tp.clear();

		// To create copy of treemap
		// System.out.println(tp.clone());

		// To separate value
		// System.out.println(tp.values());
		Collection<String> c = tp.values();
		System.out.println(c);
		System.out.println(tp);

		// to add new value
		tp.computeIfAbsent(7, k -> "12");
		System.out.println(tp);

		// Iterator interface
		// 1. Convert map into set- use entryset();
		// 2. use iterator()and in one variable of iterator.
		// 3.

		Set<Entry<Integer, String>> s = tp.entrySet();
		
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry m = (Map.Entry) i.next();
			System.out.println("Key is:- " + m.getKey());
			System.out.println("Value is:- " + m.getValue());
		}
	}

}
