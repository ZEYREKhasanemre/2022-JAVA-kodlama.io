package oopYoutubeDemo.business;

abstract public class BaseCreditManager implements CreditManagerr{
	public abstract void calculate();
	
	public  void save() {
		System.out.println("Kaydedildi");
	}

}
