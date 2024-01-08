package controller;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;

import dao.StudentDao;
import dto.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/log")
public class LoginController  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pas=req.getParameter("password");
		
		StudentDao dao=new StudentDao();
		Student studentdb=dao.fetchByEmail(email);
		if(studentdb.getEmail().equals(email)&&studentdb.getPassword().equals(pas))
		{
//			req.setAttribute("data","login sucess");
//			RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
//			dispatcher.forward(req, resp);
			
			List<Student> students=dao.getallstudents();
			req.setAttribute("stu", students);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("disply.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			req.setAttribute("message","login faild");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}	
		
	}
}
