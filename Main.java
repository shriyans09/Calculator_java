import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Scanner choice = new Scanner(System.in);

		System.out.println("\tMenu");
		System.out.println("---------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square Root (of the 1st number)");
		System.out.println("6. Fibonacci (of the 1st number)");
		System.out.println("7. Mean (of custom array)");
		System.out.println("8. Mode (of custom array)");
		System.out.println("9. Exit");

		while (true) {
			System.out.print("\nChoose an option: ");
			int option = choice.nextInt();

			switch (option) {
				case 1: {
					System.out.println("Sum = " + calculator.calcSum());
				break;
				}
				case 2: {
					System.out.println("Difference = " + calculator.calcDiff());
				break;
				}
				case 3: {
					System.out.println("Product = " + calculator.calcProd());
				break;
				}
				case 4: {
					try {
						System.out.println("Quotient = " + calculator.calcDiv());
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());
					}
					break;
				}
				case 5: {
					System.out.println("Square Root = " + calculator.calcSqrt());
				break;
				}
				case 6: {
					System.out.print("Enter a number for Fibonacci: ");
					int num = choice.nextInt();
					System.out.println("Fibonacci(" + num + ") = " + calculator.calcFib(num));
					break;
				}
				case 7: {
					System.out.print("Enter the size of the array: ");
					int size = choice.nextInt();
					int[] arr = new int[size];
					System.out.println("Enter the numbers:");
					for (int i = 0; i < size; i++) {
						arr[i] = choice.nextInt();
					}
					System.out.println("Mean = " + calculator.calcMean(arr));
					break;
				}
				case 8: {
					System.out.print("Enter the size of the array: ");
					int size = choice.nextInt();
					int[] arr = new int[size];
					System.out.println("Enter the numbers:");
					for (int i = 0; i < size; i++) {
						arr[i] = choice.nextInt();
					}
					System.out.println("Mode = " + calculator.calcMode(arr));
					break;
				}
				case 9: {
					System.out.println("Exiting program. Goodbye!");
					choice.close();
					System.exit(0);
				}
				default: {
					System.out.println("Invalid option. Please try again.");
					break;
				}
			}
		}
	}
}