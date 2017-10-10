package com.cg.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.student.bean.StudentDetail;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;




@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out= response.getWriter();
		StudentDetail bean= new StudentDetail();
		IStudentService service=new StudentServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		String target = null;
		int res=0;
		int flag=0;
		
		switch(path)
		{
			case "/add.obj":
			{
				HttpSession session=request.getSession();
				ArrayList<Integer> listId= new ArrayList<Integer>();
				listId=service.getId();
				System.out.println("in controler"+listId);
				session.setAttribute("list",listId);
				target="AddStudentExamDetails.jsp";
				break;
			}
			case "/details.obj":
			{
				String sid=request.getParameter("studentId");
			
				int id=Integer.parseInt(sid);
				String sub=request.getParameter("subjectName");
				String theory=request.getParameter("theoryMarks");
				int theoryScore=Integer.parseInt(theory);
				String practical=request.getParameter("practicalMarks");
				int practicalScore=Integer.parseInt(practical);
				String lab=request.getParameter("labMarks");
				int labScore=Integer.parseInt(lab);
				
				bean.setStudentId(id);
				bean.setSubject(sub);
				bean.setTheoryMarks(theoryScore);
				bean.setMcqMarks(practicalScore);
				bean.setLabScore(labScore);
				
				bean=service.addStudentMarks(bean);
				
				System.out.println(bean);
				
				HttpSession session=request.getSession(true);
				session.setAttribute("data",bean);
				target="resultScore.jsp";
			
				break;
			}
			
		}
		RequestDispatcher rd= request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

	
}
