package controller;

import java.io.IOException;

import dao.StudentDao;
import dto.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Object idAttribute = req.getAttribute("id");
//		 int id = Integer.parseInt((String) idAttribute);
//		
	
	int id=Integer.parseInt(req.getParameter("id"));
		
		

		StudentDao dao=new StudentDao();
		Student student=dao.getStudentsById(id);
		if(student!=null)
		{
			req.setAttribute("stu", student);
			RequestDispatcher dispatcher=req.getRequestDispatcher("edit.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
