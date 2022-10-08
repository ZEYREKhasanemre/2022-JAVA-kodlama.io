package oopWithNLayeredAppDataAccess;

import oopWithNLayeredAppEntities.Product;

public class HibernateProductDao implements ProductDao{

	public void add(Product product)
	{
		System.out.println("Hibernate ile veritabanına eklendi."+product.getName());
	}
}
