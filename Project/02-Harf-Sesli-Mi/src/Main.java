
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character='i';
		
		switch (Character.toLowerCase(character)) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println(character+" "+"kalın sesli harftir.");
			break;
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println(character+" "+"ince sesli harftir.");
			break;
			

		default:
			System.out.println("Girilen karakter sesli bir harf değildir!");
			break;
		}
	}

}
