package oopKodlamaIO.dataAccess;

import java.util.ArrayList;

import oopKodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	ArrayList<Category> categories = new ArrayList<Category>();

	public JdbcCategoryDao() {
		categories.add(new Category("145z161-4124-x5", "Front-End"));
		categories.add(new Category("144c5fz161c-4v1x24-zx51", "Back-End"));
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("New Category Added with JDBC!");

	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Category Deleted with JDBC!");

	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Category Updated with JDBC!");

	}

	

}
