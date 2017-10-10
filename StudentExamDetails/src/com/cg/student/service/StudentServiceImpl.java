package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentDetail;
import com.cg.student.dao.IStudentDao;
import com.cg.student.dao.StudentDaoImpl;




public class StudentServiceImpl implements IStudentService 
{
	IStudentDao dao= new StudentDaoImpl();
	public ArrayList<Integer> getId() {
		ArrayList<Integer> list = dao.getId();
		System.out.println("in service" +list);
		return list;
	}

	
	public StudentDetail addStudentMarks(StudentDetail bean) {
		int th=bean.getTheoryMarks();
		int theory=(70*th)/100;
		int prac=bean.getMcqMarks();
		int mcq=(15*prac)/100;
		int assgn=bean.getLabScore();
		int lab=(15*assgn)/100;
		int total= theory+mcq+lab;
		bean.setTotalScore(total);
		String grade;
		if(total>90)
		{
			grade="S";
			bean.setGrade(grade);
		}
		if(total>80 && total<=90)
		{
			grade="A";
			bean.setGrade(grade);
		}
		if(total>70 && total<=80)
		{
			grade="B";
			bean.setGrade(grade);
		}
		if(total>60 && total<=70)
		{
			grade="C";
			bean.setGrade(grade);
		}
		if(total>50 && total<=60)
		{
			grade="D";
			bean.setGrade(grade);
		}
		if(total<=49)
		{
			grade="U";
			bean.setGrade(grade);
		}
	
		return dao.addStudentDetails(bean);
	}

}
