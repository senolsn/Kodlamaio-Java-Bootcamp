package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		
		//Değişken isimlendirmeleri java'da camelCase yazılır.
		
		String ortaMetin = "İlginizi Çekebilir";
		
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//Integer
		int vade =12;
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if(dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}
		else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını xBanktan Alan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
