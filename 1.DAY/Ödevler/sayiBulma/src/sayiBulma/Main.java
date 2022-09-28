package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayiler = new int[] {1,2,5,7,9,0};
		int aranacak =5;
		boolean varMi=false;
		
		for(int sayi:sayiler) {
			if(sayi==aranacak) {
				varMi=true;
			}
		}
		
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}
		else  {
			System.out.println("Sayi mevcut değil");
		}

	}

}
