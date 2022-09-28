package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacakSayi=2;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacakSayi) {
				varMi=true;
				break;
			}
		}
		
		String mesaj;
		
		if(varMi) {
			mesaj="Sayı mevcuttur: " + aranacakSayi;
			mesajVer(mesaj);
			//System.out.println("Sayı mevcuttur: " + aranacakSayi);
		}
		else { 
			mesaj="Sayı mevcut değildir: " + aranacakSayi;
			mesajVer(mesaj);
			//System.out.println("Sayı mevcut değildir: " + aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
