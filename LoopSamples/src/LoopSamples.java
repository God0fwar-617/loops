
public class LoopSamples
{	
	public static void main(String[] args) {
		System.out.println("\n\nTEST LOOP 1");
		testLoop1();

		System.out.println("\n\nTEST LOOP 2");
		testLoop2();

		System.out.println("\n\nEVAL");
		System.out.println(85 % 10 + 4 % 10 - 17 %3);
		System.out.println(482/10/5/2.0 + 4/5);

		System.out.println("\n\nRANGE-OF-NUMBERS");
		rangeOfNumbers(2, 8);
		System.out.println();
		rangeOfNumbers(18,  11);
		System.out.println();
		rangeOfNumbers(42,  42);
		System.out.println();

		System.out.println("\n\nCOMPARE");
		compare(3, 3);
		compare(5, 3);
		compare(3, 43);


		System.out.println("\n\nprintln w/ FOR-LOOP");

		// prints war 3-times
		for (int i = 1; i <= 3; ++i) {
			System.out.println("war");
		}

		System.out.println("\n\nprintln w/ WHILE-LOOP");

		// same as above but as while loop
		int i = 1;
		while (i <= 3) {
			System.out.println("bar");
			++i;
		}			
	}

	public static void compare(int a, int b) {
		if (a == b) {
			System.out.println("a and b are same");
		} else {
			System.out.println("a and b are different");
		}

		if (b == 43) {
			System.out.println("b is 43");
		} else {
			System.out.println("b is NOT 43");
		}
	}

	public static void testLoop1() {
		for (int i = 0; i<4 ; ++i) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + "\t+   " + j + "\t=" + (i+j));
			}
			System.out.println("out");
		}
		System.out.println("done");
	}

	public static void testLoop2() {
		for (int i = 1; i<3 ; ++i) {
			for (int j = i; j < 5; j++) {
				if (j % 2 == 0) {
					System.out.print("even ");
				} else {
					System.out.print(" odd ");
				}
				System.out.println(j);
			}
		}
	}

	public static void rangeOfNumbers(int a, int b) {
		if (a == b) {
			System.out.print(b);
		} else {
			for (int i = a; i <= b; ++i) {
				System.out.print(i + " ");
			}
			for (int i = a; i >= b; --i) {
				System.out.print(i + " ");
			}
		}
	}
}
