package controller;

import java.io.IOException;
import java.util.List;

import dao.StudentDao;
import dto.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String f=req.getParameter("fname");
		String l=req.getParameter("lname");
		String a=req.getParameter("age");
		String e=req.getParameter("email");
		String add=req.getParameter("address");
		String phno=req.getParameter("phno");
		String pwd=req.getParameter("password");
		Student student=new Student();
		student.setId(id);
		student.setFirstName(f);
		student.setLastName(l);
		student.setAddress(add);
		student.setAge(a);
		student.setEmail(e);
		student.setPhno(phno);
		student.setPassword(pwd);
		StudentDao dao=new  StudentDao();
		Student updatedstudent=dao.update(student);
		if(updatedstudent!=null)
		{
			List<Student> list=dao.getallstudents();
			req.setAttribute("stu", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("disply.jsp");
			dispatcher.forward(req, resp);
			
		}
	}
}
