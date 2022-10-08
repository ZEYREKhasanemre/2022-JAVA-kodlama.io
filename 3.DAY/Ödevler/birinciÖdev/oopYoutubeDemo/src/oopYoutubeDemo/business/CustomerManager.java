package oopYoutubeDemo.business;

import oopYoutubeDemo.entities.Customer;

public class CustomerManager { 
	private Customer customer;
	private CreditManagerr creditManagerr;
	
	public CustomerManager(Customer customer,CreditManagerr creditManagerr) {
		this.customer = customer;
		this.creditManagerr = creditManagerr;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi."+customer.getCity());
	}
	
	public void delete() {
		System.out.println("Müşteri silindi."+customer.getCity());
	}
	
	public void giveCredit() {
		creditManagerr.calculate();
		System.out.println("Kredi verildi.");
	}

}
