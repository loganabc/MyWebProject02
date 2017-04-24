package logan.study.test;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

public class test4find {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		Student student =  daoImpl.find("5555");
		System.out.println(student.getName());

	}

}
