package website.dataAccess;

import website.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Jdbs ye eklendi. ");
		
	}

}
