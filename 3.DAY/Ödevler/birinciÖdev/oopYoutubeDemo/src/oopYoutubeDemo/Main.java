package oopYoutubeDemo;

import oopYoutubeDemo.business.CustomerManager;
import oopYoutubeDemo.business.TeacherCreditManager;
import oopYoutubeDemo.entities.Company;
import oopYoutubeDemo.entities.Person;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setFirstName("Engin");
		person.setLastName("Demiroğ");
		person.setNationalİdentity("987654321");
		person.setCity("Ankara");
		
		Company company = new Company();
		company.setId(2);
		company.setTaxtNamber("123456789");
		company.setCompanyName("Kodlamaio");
		company.setCity("İstanbul");
		
		
		
		

		
		CustomerManager customerManager = new CustomerManager(person, new TeacherCreditManager());
		customerManager.save();
		customerManager.save();
		customerManager.giveCredit();
		
		
		
		
		
	}

}
