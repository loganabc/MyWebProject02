package logan.study.test;

import logan.study.dao.impl.StudentDaoImpl;

public class test4delete {
	public static void main(String[] args) throws Exception{
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.delete("����");
		System.out.println("�ɹ�");
	}


	
	

}
