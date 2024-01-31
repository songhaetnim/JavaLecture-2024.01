package Qq;

public class q1 {

	public static void main(String[] args) {

		int threeSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				threeSum += i;
			}
		}
		System.out.println("1에서 100까지의 3의 배수의 합: " + threeSum);


		int oddNum = 0;
		for (int i = 1; i <= 20; i += 2) {
			oddNum += i * i;
		}
		System.out.println("1에서 20까지 홀수의 제곱의 합: " + oddNum);


		int number = 5;
		boolean result = isPrime(number);
		if (result) {
			System.out.println(number + "소수입니다.");
		} else {
			System.out.println(number + "소수가 아닙니다.");
		}

		int resultSum = 0;
		for (int i = 2; i <= 100; i++) {
			result = isPrime(i);
			if (result) {
				resultSum += i;
			}
		}
		System.out.println(resultSum);

	}


	static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}