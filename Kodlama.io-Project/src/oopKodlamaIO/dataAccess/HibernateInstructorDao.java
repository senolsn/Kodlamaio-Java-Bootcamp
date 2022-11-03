package oopKodlamaIO.dataAccess;


import oopKodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("New Instructor Added with Hibernate!");
		
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Instructor Deleted with Hibernate!");
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Instructor Updated with Hibernate!");
		
	}

	
	

}
