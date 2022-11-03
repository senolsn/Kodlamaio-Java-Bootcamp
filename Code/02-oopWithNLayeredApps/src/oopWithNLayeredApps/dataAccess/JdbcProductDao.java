package oopWithNLayeredApps.dataAccess;
import oopWithNLayeredApps.entities.*;

public class JdbcProductDao implements ProductDao {
	
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

	
}
