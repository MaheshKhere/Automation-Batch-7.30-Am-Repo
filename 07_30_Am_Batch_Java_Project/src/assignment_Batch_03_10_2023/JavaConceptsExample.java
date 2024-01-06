package assignment_Batch_03_10_2023;

public class JavaConceptsExample extends AbstractJavaConceptsExample{
 
	//Jyoti Assignment
	// Instance variables (encapsulation)
		private int instanceVariable;
		private static int staticVariable = 42;

		// Constructors
		public JavaConceptsExample() {
			instanceVariable = 0;
		}

		public JavaConceptsExample(int instanceVariable) {
			this.instanceVariable = instanceVariable;
		}
		
		// Abstraction (implementation of abstract method)
	    @Override
	    public void abstractMethod() {
	        System.out.println("Abstract method implementation called.");
	    }
		// Methods
		public void instanceMethod() {
			System.out.println("Instance method called.");
		}

		public static void staticMethod() {
			System.out.println("Static method called.");
		}

		// Inheritance and Polymorphism
		static class ChildClass extends JavaConceptsExample {
			public ChildClass() {
				super(10);
			}

			@Override
			public void instanceMethod() {
				System.out.println("Child class's overridden method called.");
			}
		}
		


		// Control statements
		public void controlStatementsDemo(int[] numbers) {
	        for (int number : numbers) {
	            if (number > 0) {
	                System.out.println("Number is positive.");
	            } else if (number < 0) {
	                System.out.println("Number is negative.");
	            } else {
	                System.out.println("Number is zero.");
	            }
	        }

	        for (int i = 1; i <= 3; i++) {
	            System.out.println("Iteration " + i);
	        }
		int[] numbers1 = {1, 2, 3, 4, 5};
	    for (int num : numbers1) {
	        System.out.println("Array element: " + num);}
	    }

		

		public static void main(String[] args) {
			// Creating an object
			JavaConceptsExample object = new JavaConceptsExample(10);

			// Accessing instance variables and methods (encapsulation)
			System.out.println("Instance variable: " + object.instanceVariable);
			object.instanceMethod();

			// Accessing static variables and methods
			System.out.println("Static variable: " + staticVariable);
			staticMethod();

			// Inheritance, Polymorphism
			JavaConceptsExample childObject = new ChildClass();
			System.out.println("Child class instance variable: " + childObject.instanceVariable);
			childObject.instanceMethod();

			// Abstraction
	        object.abstractMethod();

			// Control statements
			int[] numbers = { 5, -2, 0, 3, -1 };
			object.controlStatementsDemo(numbers);
}}
