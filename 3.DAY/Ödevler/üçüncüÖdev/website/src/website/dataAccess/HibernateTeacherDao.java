package website.dataAccess;

import website.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("hibernat e eklendi. ");
		
	}

}
