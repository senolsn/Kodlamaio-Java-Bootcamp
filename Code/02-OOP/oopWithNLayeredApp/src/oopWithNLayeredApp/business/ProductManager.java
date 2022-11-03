package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	public ProductDao productDao;
	
	public ProductManager (ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception { // Response Request
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan kücük olamaz");
		}
	

	}

}
