package com.cg.EmployeeEnquiryApplication.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.EmployeeEnquiryApplication.bean.EmployeeDetails;
import com.cg.EmployeeEnquiryApplication.dao.EmployeeEnquiryDaoImpl;
import com.cg.EmployeeEnquiryApplication.dao.IEmployeeEnquiryDao;

public class EmployeeEnquiryServiceImpl implements IEmployeeEnquiryService
{

     IEmployeeEnquiryDao dao = new EmployeeEnquiryDaoImpl() ; 
	
	public int addEmployeeDetails(EmployeeDetails e)
	{
		dao = new EmployeeEnquiryDaoImpl();
		return dao.addEmployeeDetails(e);
	}

	@Override
	public ArrayList<EmployeeDetails> retrieveDetails(int eid) throws IOException, SQLException {
		dao = new EmployeeEnquiryDaoImpl();
		return dao.retrieveDetails(eid);
	}

	@Override
	public boolean validateName(String name) {
		String pattern ="[A-Z]{1}[a-zA-Z]{2,10}";
		 if(Pattern.matches(pattern, name))
		 {
			 return true;
		 }
		 else
		 {
			 System.out.println("Please enter the valid name");
			 return false;
		 }
		
	}

	@Override
	public boolean validateContact(String phoneNo) {
		String phnPatt ="[0-9]{9}";
		if(Pattern.matches(phnPatt, toString()))
		 {
			 return true;
		 }
		 else
		 {
			 System.out.println("Please enter the valid Phone number");
	    	 return false;
		 }		
	}

	@Override
	public boolean validateDomain(String doamin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateLocation(String Location) {
		// TODO Auto-generated method stub
		return false;
	}

	





}
