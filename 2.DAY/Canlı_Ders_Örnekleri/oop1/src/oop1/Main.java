package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("delongikahvemakinesi.png");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(3);
		product2.setImageUrl("smegkahvemakinesi.png");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(2);
		product3.setImageUrl("kitchenaidkahvemakinesi.png");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		individualCustomer Individualcustomer = new individualCustomer();
		Individualcustomer.setId(1);
		Individualcustomer.setCustomerNumber("10");
		Individualcustomer.setPhone("911");
		Individualcustomer.setFirstName("hasan");
		Individualcustomer.setLastName("zeyrek");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("ZEYREKLER AŞ");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("34343434111");
		corporateCustomer.setCustomerNumber("5234");
		
		Customer[] customers= {Individualcustomer,corporateCustomer};
		
		
		
		
		
		
	}

}
