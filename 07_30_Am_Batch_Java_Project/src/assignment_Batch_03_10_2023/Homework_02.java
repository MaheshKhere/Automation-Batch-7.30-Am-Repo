package assignment_Batch_03_10_2023;

public class Homework_02 extends Homework_01{
// Savita Mam
	int ab = 001;
	float v= 02.02f;
	
	int a=100; //super keyword
	public void display () {
		System.out.println(super.a);
	}
	public static void work() {
		System.out.println("work from home");}
	
	public void c(String n){
		
	}
	
	
	{System.out.println(" c method from child class");
	System.out.println(this.i);
	this.work();// invoke  current class method
	
           this.c();}// parent class instance method
	public int city ( int q) {System.out.println("city from child class");
	return q;
	}
	
	
		public static void main(String[] args) {
	
   Homework_02  ho = new Homework_02();
   ho.get(44);//parent class
    ho.c();//parent class
    ho.work();//child class
    ho.c();//child class
    ho.city(7);
    ho.c();
    ho.display();//super key
    
    // singel dimensional array
    int a []=new int[3];
     a[0]=1;
     a[1]=2;
     a[2]=3;
     System.out.println(a[1]);
     for(int c:a) {
    	 System.out.println(c);
     }
     //length of array
     int b[]=new int[5];
     System.out.println("length is"+b.length);
     
     //without memory allocation
     int c[]= {2,5,9};
     for ( int k=0;k< c.length;k++) {
    	 System.out.println(c[k]);}
    	 
    	//multi dimentional
    	 int[][]table =new int[3][2];
    	 table [0][0]=44;
    	 table [0][1]=99;
    	 
    	 table [1][0]=22;
    	 table [1][1]=33;
    	 
    	 table [2][0]=11;
    	 table [2][1]=77;
    	 for(int r=0; r<3;r++) {
    		 for (int s=0;s<1;s++) {
    			 System.out.println(table[r][s]+" ");}
    	 
    		 System.out.println();
    	 
     }
    	//without memory allocation
    		//  3 6 2
    		//	5 8 9
    		int [] [] ab= {{3,6,2},{5,8,9}};
    		
    		for (int x=0; x<2; x++) {
    			for (int j=0; j<3; j++) {
    		System.out.print("ab ["+ x + "][" + j + "]= "+ ab [x][j]  );
    			}
    		System.out.println();
    			}
    
		}
}
