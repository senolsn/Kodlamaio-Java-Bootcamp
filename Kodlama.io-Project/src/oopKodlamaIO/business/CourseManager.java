package oopKodlamaIO.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import oopKodlamaIO.core.logging.Logger;
import oopKodlamaIO.dataAccess.CourseDao;
import oopKodlamaIO.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private static final List<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		
		if(course.getPrice() < 0) {
			throw new Exception("Course price must be bigger that zero.");
		}

		for (Course _course : courses) {

			if (Objects.equals(course.getName(), _course.getName())) {
				throw new Exception("You cannot enter same course twice.");
			}
		}
		this.courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {

			logger.log(course.getName());
		}

	}

}
