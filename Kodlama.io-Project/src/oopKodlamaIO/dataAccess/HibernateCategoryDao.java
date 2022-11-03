package oopKodlamaIO.dataAccess;

import oopKodlamaIO.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("New Category Added with Hibernate!");
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Category Deleted with Hibernate!");
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Category Updated with Hibernate!");
		
	}

	

}
