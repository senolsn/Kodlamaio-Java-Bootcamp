
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 42;
		boolean isPrime = true;
		// Sayi asal mı
		for (int i = 2; i < number; i++) {
			if (number % i == 0 && i != 2) {
				isPrime = false;
			}
		}

		if (isPrime == true || number == 2) {
			System.out.println(number + " " + "bir asal sayıdır!");
		} else {
			System.out.println("Maalesef" + " " + number + " " + "asal bir sayı değil!");

		}

	}

}
