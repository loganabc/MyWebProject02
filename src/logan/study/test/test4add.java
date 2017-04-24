package logan.study.test;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

public class test4add {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setGrade(10);
		student.setIdcard("7777");
		student.setLocation("北京");
		student.setName("王六");
		
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.add(student);
		System.out.println("添加成功");

	}

}
