package oopWithNLayeredApp;

import oopWithNLayeredAppCore.logging.Logger;
import oopWithNLayeredAppBusiness.ProductManager;
import oopWithNLayeredAppCore.logging.DatabaseLogger;
import oopWithNLayeredAppCore.logging.FileLogger;
import oopWithNLayeredAppDataAccess.HibernateProductDao;
import oopWithNLayeredAppEntities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1," Iphone Xr ",9);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		

		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		
		productManager.add(product1);
	}

}
 