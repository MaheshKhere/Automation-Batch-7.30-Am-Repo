package different_Pattern_assignments_29_08_2023;

public class Chetan {

	public static void main(String[] args) {
		// inverted pyramid using number
		
		 int row=5;
		 int col=5;
		 int number =1;
	   for (int i=1;i<=row;i++) { 
		   for (int j=1;j<=col;j++)
		   {
			   if (i == 1 ) 
			   {
				System.out.print(number+"  ");
				number++;
			} else if (i==2 && j<col) 
			    {
					System.out.print(number+"  ");
					number++;
				}else if (i==3 && j<col-1)
				{
					System.out.print(number+" ");				
	                                number++;
				}else if (i==4 && j<col-2)			   {
				   System.out.print(number+" ");
				   number++;
			   }else if (i==5 && j<col-3)
			   {
				   System.out.print(number+" ");
				   number++;
			   }		
		   }
		System.out.println();
	   }
	  System.out.println("-------------------------------"); 
// inverted pyramid using star
	   
	   int row1=5;
		 int col1=5;
	   for (int i=1;i<=row;i++) { 
		   for (int j=1;j<=col;j++)
		   {
			   if (i == 1 ) 
			   {
				System.out.print(" * ");
			} else if (i==2 && j<col) 
			    {
				System.out.print(" * ");
				}else if (i==3 && j<col-1)
				{
					System.out.print(" * ");
				}else if (i==4 && j<col-2)
			   {
					System.out.print(" * ");
			   }else if (i==5 && j<col-3)
			   {
				   System.out.print(" * ");
			   }		
		   }
		System.out.println();
	   }	
	}

}
