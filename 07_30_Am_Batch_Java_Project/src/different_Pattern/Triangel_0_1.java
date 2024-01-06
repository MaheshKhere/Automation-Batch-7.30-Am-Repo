package different_Pattern;

public class Triangel_0_1 {

	public static void main(String[] args) {
//		1 
//		0 1
//		1 0 1      row+col=1+1(1,1)=2 
//		0 1 0 1    2+1=3 2+2=4 sum is even = 1
//		1 0 1 0 1  3+1 =4      sum is odd = 0
		
		for(int i=1; i<=6;i++) {
			for(int j=1; j<=i; j++) {
				int sum= i+j;
				if(sum%2==0){
					System.out.print(" 1 ");
					
				}else {
					System.out.print(" 0 ");
				}			
			}
			System.out.println();
		}

	}

}
