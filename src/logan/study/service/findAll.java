package logan.study.service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Element;

import logan.study.dao.impl.StudentDaoImpl;
import logan.study.domain.Student;

/**
 * Servlet implementation class findAll
 */
public class findAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findAll() {
        super();
        // TODO Auto-generated constructor stub
    }
    String charset = "UTF-8";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OutputStream outputStream = response.getOutputStream();
		response.setHeader("content-type", "text/html;charset=utf-8");
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		
		try {
			List list = daoImpl.findAll();
			for(int i = 0;i<list.size();i++){
				Student student = (Student) list.get(i);
				
				outputStream.write("<hr/>".getBytes(charset));
				outputStream.write(("学生姓名："+student.getName()).getBytes(charset));
				outputStream.write("<br/>".getBytes(charset));
				
				outputStream.write(("学生身份编号："+student.getIdcard()).getBytes(charset));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
