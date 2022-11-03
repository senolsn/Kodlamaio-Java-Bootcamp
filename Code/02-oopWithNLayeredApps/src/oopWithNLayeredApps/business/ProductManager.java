package oopWithNLayeredApps.business;
import java.util.List;

import oopWithNLayeredApps.core.logging.Logger;
import oopWithNLayeredApps.dataAccess.*;
import oopWithNLayeredApps.entities.*;

public class ProductManager {

	private ProductDao productDao;
	private List<Logger> loggers;

	public ProductManager(ProductDao productDao, List <Logger> loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// Business Rule's
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		
		//JdbcProductDao productDao = new JdbcProductDao();
		//HibernateProductDao productDao = new HibernateProductDao();
		
		/*Burada mesela add dışında 1000 tane daha method olduğunu düşünelim ve bu 1000 tane işlem için yukarıdaki JdbcProductDao dan türetilen nesneleri
		 * tek tek değiştirmem gerekicek fakat bunu Interface yapısında yaparsak ve interface'e gönderirsek tek bir işlemde halletmiş olacağız.
		 */
		productDao.add(product);
		
		
		
	for (Logger logger : loggers) {
			
			logger.log(product.getName());
			
		}
	}

}
