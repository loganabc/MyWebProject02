package logan.study.test;

import java.util.List;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

public class test4findAll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		List list = daoImpl.findAll();
		for(int i = 0;i<list.size();i++){
			Student student = (Student) list.get(i);
			System.out.println(student.getName());
		}
	}
}
