
public class Main {

	public static void main(String[] args) {
		int mukemmelSayi = 6;
		int toplam = 0;

		for (int i = 1; i < mukemmelSayi; i++) {
			if (mukemmelSayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (mukemmelSayi == toplam) {
			System.out.println(mukemmelSayi + " " + "mükemmel sayıdır!");
		}

	}

}
