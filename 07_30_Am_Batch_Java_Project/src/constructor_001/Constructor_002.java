package constructor_001;

 class Constructor_002 {

	// 
	int b;
	Constructor_002(char c) {
	b=10;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Constructor_002 c2 = new Constructor_002('v');
		System.out.println(c2.b);
	}

}
