package website.business;

import java.util.ArrayList;
import java.util.List;

import website.coreLogging.BaseLogger;
import website.dataAccess.TeacherDao;
import website.entities.Teacher;

public class TeacherManager {
	
	private TeacherDao teacherDao;
	private BaseLogger[] logger;
	
	List<Teacher> teachers = new ArrayList<>();
	
	public TeacherManager(TeacherDao teacherDao,BaseLogger[] loggers) {
		this.teacherDao=teacherDao;
		this.logger = loggers;
	}
	
	public void add(Teacher teacher) throws Exception {
		
		if(teacher.getPrice()<0) {
			throw new Exception("Fiyat 0 dan küçük olamaz");
		}
		
		for (Teacher teacherr : teachers) {
			
			if(teacher.getCourseName()==teacherr.getCourseName()) {
				throw new Exception("Kurs adı aynı olamaz");
			}
			if(teacher.getCategory()==teacherr.getCategory()) {
				throw new Exception("Kategori adı ayni olamaz");
			}
		}
		
		teachers.add(teacher);
		System.out.println("Eklendi. ");
		teacherDao.add(teacher);
		for (BaseLogger baseLogger : logger) {
			baseLogger.log(" Mesaj yeri ");
		}
	}

}
