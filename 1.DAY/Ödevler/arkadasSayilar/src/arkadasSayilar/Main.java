package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int sayi1=220;
		int sayi2=284;
		int toplam=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam  +=i;
			}
		}
		
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2  +=i;
			}
	    }
		
		if(sayi1==toplam2 && sayi2==toplam) {
			System.out.println("Bu iki sayı arkadaş");
			
		}
		else {
			System.out.println("Bu iki sayı arkadaş değil");
		}

	}

}
