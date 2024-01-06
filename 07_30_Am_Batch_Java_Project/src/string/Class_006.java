package string;

public class Class_006 {

	public static void main(String[] args) {

		String s = "Hey,Pranjali,Whats,Up,?";
		String ab[] = s.split(",");
		//System.out.println(ab[0]);
		//System.out.println(ab[1]);
//		System.out.println(ab[2]);
//		System.out.println(ab[3]);
//		System.out.println(ab[4]);

		// Access all Values from array
//		for(int x=0; x<2; x++) {
//			System.out.println(ab[x]);
//		}

		// for each
      for(String p:ab) {
    	  System.out.println(p);
      }
	}

}
