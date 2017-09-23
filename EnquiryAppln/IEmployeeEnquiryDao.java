package com.cg.EmployeeEnquiryApplication.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.EmployeeEnquiryApplication.bean.EmployeeDetails;

public interface IEmployeeEnquiryDao {

	public ArrayList<EmployeeDetails> retrieveDetails(int eid) throws IOException, SQLException;

	public int addEmployeeDetails(EmployeeDetails e);



	

}
