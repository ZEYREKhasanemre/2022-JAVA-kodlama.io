package oopWithNLayeredAppDataAccess;

import oopWithNLayeredAppEntities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product)
	{
		System.out.println("JDBS ile veritabanına eklendi."+product.getName());
	}

}
