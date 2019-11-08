
public class HelloWorld {

	public static void main(String[] args) {
		for (int number = 3; number <= 1000000000; number++) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(number) && isPrime; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
				// System.out.println(i);
			}
			if (isPrime) {
				System.out.println(number + " ");
			}
		}
	}
}