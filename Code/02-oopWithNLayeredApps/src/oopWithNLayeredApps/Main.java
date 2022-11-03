package oopWithNLayeredApps;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApps.business.ProductManager;
import oopWithNLayeredApps.core.logging.DatabaseLogger;
import oopWithNLayeredApps.core.logging.FileLogger;
import oopWithNLayeredApps.core.logging.Logger;
import oopWithNLayeredApps.core.logging.MailLogger;
import oopWithNLayeredApps.dataAccess.*;
import oopWithNLayeredApps.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"iPhone XR",199999);
		
		
		//ProductManager productManager = new ProductManager();
		//productManager.add(product1);
		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}

}
