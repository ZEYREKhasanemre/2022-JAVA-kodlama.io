package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayiler = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayiler)
		{
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj="";
		if(varMi) {
			mesaj="Sayı mevcutdur : "+aranacak;
			mesajVer(mesaj);
		}
		else {
			mesajVer("Sayı mevcut değildir : "+aranacak);
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
