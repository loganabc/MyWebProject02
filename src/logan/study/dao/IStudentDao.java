package logan.study.dao;

import java.util.List;

import logan.study.domain.Student;

public interface IStudentDao {
	//连接xml的接口
	//根据身份证号查询学生
	Student find(String idcard) throws Exception;
	
	//根据学生姓名删除学生
	void delete(String name)throws Exception;
	
	//增加学生
	void add(Student student)throws Exception;
	
	//返回所有学生
	List<Student> findAll()throws Exception;

}
