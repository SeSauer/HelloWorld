
public class HelloWorld {

	public static void main(String[] args) {
		long timer=System.nanoTime();
		
		for (int number = 3; number <= 100000; number++) {
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
		timer=System.nanoTime()-timer;
		System.out.println("Laufzeit: "+timer/1000000+" ms");
	}
}