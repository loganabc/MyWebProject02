package logan.study.service;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

/**
 * Servlet implementation class add
 */
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }
    String charset = "UTF-8";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = new String(request.getParameter("name").getBytes("ISO8859-1"));
		String location = new String(request.getParameter("location").getBytes("ISO8859-1"));
		String idcard = new String(request.getParameter("idcard").getBytes("ISO8859-1"));
		String grade_str = new String(request.getParameter("grade").getBytes("ISO8859-1"));
		Double grade = Double.parseDouble(grade_str);
		
		
		
		OutputStream outputStream = response.getOutputStream();
		response.setHeader("content-type", "text/html;charset=utf-8");
		
		Student student = new Student();
		student.setGrade(grade);
		student.setIdcard(idcard);
		student.setLocation(location);
		student.setName(name);
		
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		try {
			daoImpl.add(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		outputStream.write("Ìí¼Ó³É¹¦£¡".getBytes(charset));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
