package jump_statement;

abstract class Continue_Statement {
	 
public int x=30;
int y=40;
protected long l=900;
private short s=3;

	   protected void add() {
		 
	 }
	   
	   private void sum() {
		   
	   }
	   
	   
	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			if(i==3) {
			continue;
			}	
			System.out.println(i);
		}

	}

}
