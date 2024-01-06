package assignment_Batch_03_10_2023;

import java.util.Scanner;

public class Homework_01 implements Interface{
// Savita Mam
	//instance variable
		int a=10;
		//static variable
		static double d = 10.20;
		
		//static method
		
		public static void b() {
			byte b= 20;
		}
		//instance method
		public void c() {
			long l= 789;
			System.out.println("instance method " + 789);
		}
		//method arrgument
		int i;
		public void get (int a) {
			i=a;
			this.i=a;
			System.out.println(this.i);
			System.out.println( "the value of a"+i);}
		
		//poly method n signature same /overloadding
	      public void np( String n) {
	    	  System.out.println("String method from parent class");}
	       //overriding
	      public int city(int q) {
	    	  System.out.println("city from parent class");
	    	  return q;
	      }
	    	  //  this keyword invoke current class constructor
	      
	     // public Homework_01(int f)
	      //this();
	     // {System.out.println("one arrgument constructor");
	      // public Homework_01 (long k, float f,string s)
	     // this.(7);
	     // System.out.println("three parameterized constructor");}
	      
	      
	      

	      
	      
	    	  public static void np(long n,float f, double d) {
	      
	    	  System.out.println("long /float/doublrmethod from parent class");}
	      //constructor paremeterrized
	     // public Homework_01( int w,double y) {
	    	//  System.out.println(" value of w"+w);
	    	//  System.out.println("value of y"+y);}
	      
		 
		public static void main(String[] args) {
			
			
		Homework_01  abc = new Homework_01 ();
		//Homework_01 abc1 = new Homework_01(20,20.6);
		System.out.println(abc.a);
		System.out.println(abc.d);
		    abc.get(100);
			abc.b();
			b();
			abc.c();
			abc.np(9, 010.10f, 10.20);
			
			abc.park();
			abc.gardern(90);
			// if statment
			int y =40;
			if (y>30) {
				System.out.println("condtion is true" );
			}
			 // if else
			int b= 40;
			if(b<=30) {
				System.out.println("no. is greater");
			}else {System.out.println("no. is less ");}
			
			//if else if
			int o =70;
			if (o<60) {
				System.out.println("good speed");}
			else if (o < 90 || o<=80 ) {
				System.out.println(" max speed ");}
				else {System.out.println( "speed");
				
			}
			
	      // nested if
			long l= 500;
			if (l ==500) {System.out.println("equal value");}
			if (l>400) {System.out.println("greater");}
			if (l<300) {System.out.println("lesser");}
			if (l>=800) {System.out.println(" value");}
			else {System.out.println("nothing");
			}
			
			// switch stetment
			int colour= 0;
			 switch (colour) {
			 case 1:
				 System.out.println("green");
				 break;
			 case 2:
				 System.out.println("red");
				 break;
			 case 3:
				 System.out.println("orange");
				 break;
				 default:
					 System.out.println("none");}
			 
				 
			 //for loop

			 for (int b1=1; b1<=5;b1++) {
				   if(b1%2==0) {
				   System.out.println("even number is "+b1 );}
			 
			 //while loop
			 int c= 10;
			 while (c<=20) {
				 System.out.println(c);
				 c++;}
			 
			 //do while loop
			 int a= 10;
			 do {System.out.println(a);
			 a--;
			 } while (a>=0);}
			 
			 //scanner and switch
			 int day;
			 Scanner tc =new Scanner (System.in);
			 System.out.println( "enter your number");
			 day = tc.nextInt();
			 switch (day){
			 case 1: System.out.println("happy day");
			 break;
			 case 2: System.out.println("rose day");
			 break;
			 case 3:System.out.println("friendship day");
			 break;
			 default : System.out.println("none");}
			 
			 
				 
			 }
		@Override
		public void park() {
			System.out.println("from class");
			
		}
		@Override
		public void gardern(int j) {
			System.out.println("from Homework_01");
			
		}
	
}
