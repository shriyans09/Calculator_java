import java.util.Scanner;

class Input {
	int[] input() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter 2nd number: ");
		int num2 = scan.nextInt();

		int[] numbers = new int[2];
		numbers[0] = num1;
		numbers[1] = num2;

		return numbers;
	}
}
