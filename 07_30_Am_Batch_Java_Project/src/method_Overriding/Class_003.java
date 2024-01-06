package method_Overriding;

class Class_004{
	public Number workhard() 	{
		System.out.println("wakeup early,gotocollege Parent");
		return 10;
	}
}


public class Class_003 extends Class_004{
	public Number workhard() 	{
		System.out.println("wakeup early,gotocollege Child ");
		return 10;
	}

	public static void main(String[] args) {
		Class_003 c3= new Class_003();
		c3.workhard();
		Class_004 c4= new Class_004();
		c4.workhard();
		
		Class_004  c5 = new Class_003();
		c5.workhard();
		

	}

}
