package oopKodlamaIO.dataAccess;


import oopKodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	


	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("New Instructor Added with JDBC!");
		
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Instructor Deleted witch JDBC!");
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Instructor Updated with JDBC!");
		
	}


}
