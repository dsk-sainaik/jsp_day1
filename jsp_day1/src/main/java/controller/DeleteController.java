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
@WebServlet("/delete")
public class DeleteController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//		PrintWriter o=resp.getWriter();
//		o.println("sai");
	
	int id=Integer.parseInt(req.getParameter("id"));
	 StudentDao dao=new StudentDao();
	 boolean res=dao.delete(id);
	 if(res)
	 {
		 List<Student> list=dao.getallstudents();
		 req.setAttribute("stu", list);
		 RequestDispatcher dispatcher=req.getRequestDispatcher("disply.jsp");
			dispatcher.forward(req, resp);
		 
	 }
	
	
	
	
	
		
		
	}

	
}
