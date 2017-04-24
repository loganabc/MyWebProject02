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
 * Servlet implementation class find
 */
public class find extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public find() {
        super();
        // TODO Auto-generated constructor stub
    }
    String charset = "UTF-8";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idcard = request.getParameter("idcard");
		
		OutputStream outputStream = response.getOutputStream();
		response.setHeader("content-type", "text/html;charset=utf-8");
		
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		try {
			Student student = daoImpl.find(idcard);
			outputStream.write("查询成功，学生信息如下：<br/>".getBytes(charset));
			outputStream.write(("学生姓名："+student.getName()).getBytes(charset));
			outputStream.write("<br/>".getBytes(charset));
			outputStream.write(("学生地址："+student.getLocation()).getBytes(charset));
			outputStream.write("<br/>".getBytes(charset));
			outputStream.write(("学生成绩："+student.getGrade()).getBytes(charset));
			outputStream.write("<br/>".getBytes(charset));
			outputStream.write(("学生身份编号："+student.getIdcard()).getBytes(charset));
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
