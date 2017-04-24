package logan.study.dao;

import java.util.List;

import logan.study.domain.Student;

public interface IStudentDao {
	//����xml�Ľӿ�
	//�������֤�Ų�ѯѧ��
	Student find(String idcard) throws Exception;
	
	//����ѧ������ɾ��ѧ��
	void delete(String name)throws Exception;
	
	//����ѧ��
	void add(Student student)throws Exception;
	
	//��������ѧ��
	List<Student> findAll()throws Exception;

}
