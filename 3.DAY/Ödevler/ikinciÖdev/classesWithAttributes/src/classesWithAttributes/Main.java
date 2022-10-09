package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"laptop","asus leptop",3000,2,"siyah");
		
		//Product product2 = new Product();
		//product2.set_name("Laptop");
		//product2.set_id(1);
		//product2.set_description("Asus Leptop");
		//product2.set_price(5000);
		//product2.set_stockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		System.out.println(product.get_kod());
		

	}

}
