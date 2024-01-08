package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDao;
import dto.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sig")
public class InsertStudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String f=req.getParameter("fname");
		String l=req.getParameter("lname");
		String a=req.getParameter("age");
		String e=req.getParameter("email");
		String add=req.getParameter("address");
		
		String phno=req.getParameter("phno");
		String pwd=req.getParameter("password");
		
		
//		PrintWriter printWriter=resp.getWriter();
//		printWriter.println(f);
//		printWriter.println(l);
//		printWriter.println(a);
//		printWriter.println(e);
//		printWriter.println(add);
//		printWriter.println(phno);
//		printWriter.println(pwd);
		
		
		Student student=new Student();
		student.setFirstName(f);
		student.setLastName(l);
		student.setAge(a);
		student.setEmail(e);
		student.setAddress(add);
		student.setPhno(phno);
		student.setPassword(pwd);
		StudentDao dao=new StudentDao();
		Student student2=dao.save(student);
		if(student2!=null)
		{
			req.setAttribute("message", "sucessfully data stored in db");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
	}

}
