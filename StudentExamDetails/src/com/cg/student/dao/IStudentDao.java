package com.cg.student.dao;

import java.util.ArrayList;

import com.cg.student.bean.StudentDetail;

public interface IStudentDao 
{

	StudentDetail addStudentDetails(StudentDetail bean);

	ArrayList<Integer> getId();

}
