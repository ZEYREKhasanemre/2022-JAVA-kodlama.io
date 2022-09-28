package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("FOR Döngü Bitti");
		
		//while
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("WHİLE Döngü Bitti");
		
		//do while
		int j=2;
		do {
			System.out.println(j);
			j+=2;
		}
		
		while(j<10);
		System.out.println("DO-WHİLE Döngü Bitti");

	}

}
