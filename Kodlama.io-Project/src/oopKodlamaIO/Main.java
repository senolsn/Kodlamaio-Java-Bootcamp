package oopKodlamaIO;

import oopKodlamaIO.business.CategoryManager;
import oopKodlamaIO.business.CourseManager;
import oopKodlamaIO.business.InstructorManager;
import oopKodlamaIO.core.logging.DatabaseLogger;
import oopKodlamaIO.core.logging.FileLogger;
import oopKodlamaIO.core.logging.Logger;
import oopKodlamaIO.core.logging.MailLogger;
import oopKodlamaIO.dataAccess.*;
import oopKodlamaIO.entities.Category;
import oopKodlamaIO.entities.Course;
import oopKodlamaIO.entities.Instructor;

public class Main {

    public static void main(String[] args) throws Exception {
        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

       // Instructor instructor1 = new Instructor("47xs1s-132", "Engin", "Demirog", "img.url/engin", "Best Seller","Eğitmeniniz");
        

        //InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        //instructorManager.add(instructor1);

        
        //Aynı kategori ismi ekleme testi:
        
        //Category category1 = new Category("41xv1x-1f-s", "Web");
        //Category category2 = new Category("4121x3v14x-1f-s4s41", "Web");
        //CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        //categoryManager.add(category1);
        //categoryManager.add(category2);
        
        //Negatif Fiyatlı Kurs ekleme testi:
        
        //Course course = new Course("1163x-1xc1-cr51-r51uu", "Full-Stack Web Developer", "1", "ABC", "ABVC","Engin Demirog", -10);
        //CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        //courseManager.add(course);
        
        
        //Aynı isimde kurs ekleme testi :
        
        //Course course2 = new Course("1163x-1xc1-cr51-r51uu", "Full-Stack Web Developer", "1", "ABC", "ABVC","Engin Demirog", 0);
        //courseManager.add(course2);
    }

}
