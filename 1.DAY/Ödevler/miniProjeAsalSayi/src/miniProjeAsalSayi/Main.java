package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number =25;
		int remainder=number%2;
		System.out.println(remainder);
		boolean isPrime =true;
		
		if(number==2) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı.");
		}
		
		for(int i=2;i<number;i++) {
			if(number%2==0) {
				isPrime = false;
			}
		}
		
		if(isPrime==true) {
			System.out.println("Sayı asal dır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}

	}

}
