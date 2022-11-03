package oopKodlamaIO.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import oopKodlamaIO.core.logging.Logger;
import oopKodlamaIO.dataAccess.CategoryDao;
import oopKodlamaIO.entities.Category;

public class CategoryManager {

	private CategoryDao _categoryDao;
	private Logger[] loggers;
	private static final List<Category> categories = new ArrayList<>();
	

	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this._categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category)throws Exception {
		
		for (Category _category : categories) {
			
			if(Objects.equals(category.getName(), _category.getName())) {
				throw new Exception("You cannot enter the same Category name more than one!");
			}
			
		}
		//Kategori eklendikçe list'e gönderiyorum sonra döngü ile sorguluyorum aynı isimde kategori var mı diye yoksa zaten dao'ya gönderiyorum. Eğer Var ise hata fırlatıyor.
		categories.add(category);
		this._categoryDao.add(category);
		
		
		
		
		for (Logger logger : loggers) {
			
			logger.log(category.getName());
			
		}

	}
	
	public void delete(Category category) {
		this._categoryDao.delete(category);
	}
	
	public void update(Category category) {
		this._categoryDao.update(category);
	}
	
	

}
