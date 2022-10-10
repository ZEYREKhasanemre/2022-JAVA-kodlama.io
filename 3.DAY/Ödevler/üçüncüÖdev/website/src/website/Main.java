package website;

import website.business.TeacherManager;
import website.coreLogging.BaseLogger;
import website.coreLogging.EmailLogger;
import website.coreLogging.FileLogger;
import website.dataAccess.HibernateTeacherDao;
import website.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Teacher teacher = new Teacher(1,"Hasan Emre","Zeyrek","Javaya giriş","Java",100);
		
		BaseLogger[] loggers ={new EmailLogger(),new FileLogger()};
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(),loggers);
		teacherManager.add(teacher);
		

	}

}
