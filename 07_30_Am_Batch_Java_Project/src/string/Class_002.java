package string;

public class Class_002 {

	public static void main(String[] args) {
		
		String s = new String ("    Table t      ");
		
		//System.out.print(s.trim());
		//System.out.print("hiiii");
		//System.out.println("");
		String s1 = new String ("How are you");
		
//		if(s1.contains("How are y")) {
//			System.out.println("Character present in String");
//		}
		
		String st = "CHEtan";
		String cd = "chetan";
		System.out.println(st.equals("Chetan"));
		System.out.println(st.equalsIgnoreCase(cd));
		
		String xy = "I-am-happy-today";
		String mn[] = xy.split("-");
		
		System.out.println(mn[0]);
		System.out.println(mn[1]);
		System.out.println(mn[2]);
		System.out.println(mn[3]);
		
		 // for each loop
		for(String op:mn) {
			System.out.println(op);
		}
		
		String a_1 ="Automation tesmting..........op";
		String s_2[]= a_1.split("m");
		System.out.println(s_2[0]);
		System.out.println(s_2[1]);
		System.out.println(s_2[2]);
	}

}
