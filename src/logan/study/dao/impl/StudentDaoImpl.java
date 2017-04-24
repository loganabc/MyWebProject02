package logan.study.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.ElementHandler;

import logan.study.dao.IStudentDao;
import logan.study.domain.Student;
import logan.study.utils.XmlUtils;

/*
 * <student idcard="5555">
		<name>张三</name>
		<location>上海</location>
		<grade>10</grade>
	</student>
 */
public class StudentDaoImpl implements IStudentDao {

	@Override
	public Student find(String idcard) throws Exception{
		// TODO Auto-generated method stub
		Document document = XmlUtils.getDocument();
		Element root = document.getRootElement();
		
		Student student = new Student();
		List list = root.elements("student");
		
		for(int i = 0;i<list.size();i++){
			Element student_element = (Element) list.get(i);
			if(student_element.attributeValue("idcard").equalsIgnoreCase(idcard)){
				student.setName(student_element.element("name").getText());
				student.setLocation(student_element.element("location").getText());
				student.setGrade(Double.parseDouble(student_element.element("grade").getText()));
				student.setIdcard(idcard);
				return student;
			}
		}
		return null;
	}

	@Override
	public void delete(String name) throws Exception {
		// TODO Auto-generated method stub
		Document document = XmlUtils.getDocument();
		Element root = document.getRootElement();
		
		List list = root.elements("student");
		for(int i = 0;i<list.size();i++){
			Element student_element = (Element) list.get(i);
			if(student_element.element("name").getText().equalsIgnoreCase(name)){
				root.remove(student_element);
				XmlUtils.write2Xml(document);
			}
		}

	}

	@Override
	public void add(Student student) throws Exception {
		// TODO Auto-generated method stub
		Document document = XmlUtils.getDocument();
		Element root = document.getRootElement();
		
		Element student_element = DocumentHelper.createElement("student");
		Element name_element = DocumentHelper.createElement("name");
		Element location_element = DocumentHelper.createElement("location");
		Element grade_element = DocumentHelper.createElement("grade");
		
		name_element.setText(student.getName());
		location_element.setText(student.getLocation());
		grade_element.setText(student.getGrade()+"");
		student_element.addAttribute("idcard", student.getIdcard());
		
		student_element.add(name_element);
		student_element.add(location_element);
		student_element.add(grade_element);
		
		root.add(student_element);
		
		XmlUtils.write2Xml(document);
		
		

	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		List list = new ArrayList<Student>();
		Document document = XmlUtils.getDocument();
		Element root = document.getRootElement();
		List Student_list = root.elements("student");
		for(int i = 0;i<Student_list.size();i++){
			Student student = new Student();
			Element student_element = (Element) Student_list.get(i);
			
			student.setName(student_element.element("name").getText());
			student.setLocation(student_element.element("location").getText());
			student.setGrade(Double.parseDouble(student_element.element("grade").getText()));
			student.setIdcard(student_element.attributeValue("idcard"));
			list.add(student);
		}
		return list;
	}

}
