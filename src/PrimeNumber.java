
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, count = 0;
		for (int i = 1; i <= 10; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number");

		} else {
			System.out.println("Not a prime number");
		}
	}

}
