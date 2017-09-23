package com.cg.EmployeeEnquiryApplication.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.EmployeeEnquiryApplication.bean.EmployeeDetails;

public interface IEmployeeEnquiryService 
{
	public int addEmployeeDetails(EmployeeDetails e);

	public ArrayList<EmployeeDetails> retrieveDetails(int eid) throws IOException, SQLException;

	public boolean validateName(String name);
	
	public boolean validateContact(String phoneNo);
	
	public boolean validateDomain (String doamin);
	
	public boolean validateLocation (String Location);
	
	
	

}