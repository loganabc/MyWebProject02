package logan.study.test;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

public class test4add {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setGrade(10);
		student.setIdcard("7777");
		student.setLocation("����");
		student.setName("����");
		
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.add(student);
		System.out.println("��ӳɹ�");

	}

}
