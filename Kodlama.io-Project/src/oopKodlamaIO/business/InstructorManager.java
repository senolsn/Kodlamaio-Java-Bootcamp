package oopKodlamaIO.business;



import oopKodlamaIO.core.logging.Logger;
import oopKodlamaIO.dataAccess.InstructorDao;
import oopKodlamaIO.entities.Instructor;

public class InstructorManager {

	private InstructorDao _instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructerDao,Logger[] loggers ) {
		this._instructorDao = instructerDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {

		this._instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
			
		}

	}

	public void delete(Instructor instructor) {
		this._instructorDao.delete(instructor);
	}

	public void update(Instructor instructor) {
		this._instructorDao.update(instructor);
	}
	
	

}
