class Calculator {

	int[] input_nums = {};

	Calculator() {
		Input in = new Input();
		input_nums = in.input();
	}

	int calcSum() {
		return input_nums[0] + input_nums[1];
	}

	int calcDiff() {
		return input_nums[0] - input_nums[1];
	}

	int calcProd() {
		return input_nums[0] * input_nums[1];
	}

	double calcDiv() {
		if (input_nums[1] == 0) {
			System.out.println("Division by zero is not allowed!");
			return -9999;
		}
		return (double) input_nums[0] / input_nums[1];
	}

	double calcSqrt() {
		return Math.sqrt(input_nums[0]);
	}

	int calcFib(int num) {
		if (num == 0) {
			return 0;
		}

	if (num == 1) {
		return 1;
	}

	int a = 0, b = 1;
	for (int i = 2; i <= num; i++) {
		int temp = a + b;
		a = b;
		b = temp;
		}
		return b;
	}

	double calcMean(int[] arr) {
		int sum = 0;
		for (int value : arr) {
			sum += value;
		}
		return (double) sum / arr.length;
	}

	int calcMode(int[] arr) {
		int mode = arr[0];
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int currentCount = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
				currentCount++;
				}
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
				mode = arr[i];
			}
		}

		return mode;
	}
}