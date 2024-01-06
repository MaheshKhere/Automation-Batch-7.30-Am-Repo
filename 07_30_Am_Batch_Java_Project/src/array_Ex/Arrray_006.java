package array_Ex;

public class Arrray_006 {

	int y = 78;

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 6;
		num[1] = 60;
		num[2] = 50;

		// System.out.println(num[2]);
		// for loop
//	for(int x=0 ; x<3; x++) {
//		System.out.println(num[x]);
//	}

		// for each loop
//	for(int v : num) {
//		System.out.println(v);
//	}

		// without memory allocation
		int[] b = { 2, 3, 5, 6, 7 };

		// To Print one value of Array
		System.out.println(b[1]);

		// To get array length
		System.out.println(b.length);

		// To Access all values of array using for loop 
		for (int x = 0; x < b.length; x++) {
			System.out.println(b[x]);
		}
		
		//To Access all values of array using for each loop 
		for (int p : b) {
			System.out.println(p);
		}
	}
}
