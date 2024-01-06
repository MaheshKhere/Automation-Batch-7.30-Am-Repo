package loops;

import base_Class.Base_Test;

public class Continue_Keyword {

	public static void main(String[] args)  {
		
		for(int i=1; i<=3;i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-------------------------");
		for(int i = 0; i<= 2; i++) {  
			  
			for (int j = i; j<=5; j++) {  
			  
			if(j == 4) {  
			continue;  
			}  
			System.out.println(j);
		
			}  
			System.out.println("------");
			}  
		
	}

}
