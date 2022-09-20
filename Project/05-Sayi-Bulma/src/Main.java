
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int arananSayi =13;
		boolean varMi = false;
		
		for(int i=0; i< sayilar.length;i++) {
			if(sayilar[i] == arananSayi) {
				varMi = true;
			}
		}
		
		if(varMi == true) {
			System.out.println("Aranan sayı mevcut!");
		}
		else {
			System.out.println("Aranan sayı mevcut DEĞİL!");
		}
		

	}

}
