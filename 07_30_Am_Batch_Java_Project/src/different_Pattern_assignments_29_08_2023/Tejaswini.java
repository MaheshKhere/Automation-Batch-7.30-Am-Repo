package different_Pattern_assignments_29_08_2023;

public class Tejaswini {

	public static void main(String[] args) {

		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		for (int i = 5; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {

				System.out.print(j + " ");
			}

			System.out.println(" ");
		}

	}

}
