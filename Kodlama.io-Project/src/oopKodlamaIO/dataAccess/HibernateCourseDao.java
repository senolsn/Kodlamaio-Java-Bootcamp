package oopKodlamaIO.dataAccess;

import oopKodlamaIO.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("New Couse Added!");
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Course Deleted!");
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Course Updated!");
		
	}

	

}
