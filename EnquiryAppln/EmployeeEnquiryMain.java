package com.cg.EmployeeEnquiryApplication.UI;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.EmployeeEnquiryApplication.bean.EmployeeDetails;
import com.cg.EmployeeEnquiryApplication.dao.IEmployeeEnquiryDao;
import com.cg.EmployeeEnquiryApplication.dbutil.DBUtil;
import com.cg.EmployeeEnquiryApplication.service.EmployeeEnquiryServiceImpl;
import com.cg.EmployeeEnquiryApplication.service.IEmployeeEnquiryService;



public class EmployeeEnquiryMain 
{
	static Scanner sc = new Scanner(System.in);
	static EmployeeDetails details = null;
	static IEmployeeEnquiryService service =  new EmployeeEnquiryServiceImpl();
   	
  
	public static void main(String[] args) throws IOException, SQLException 
	{

		System.out.println("       Employee Enquiry Application       ");
		System.out.println("------------------------------------------");
		while(true)
		{
			System.out.println("1.Enter Enquiry  Details");
			System.out.println("2.Get Enquiry  Details by ID ");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				addEmployeeDetails();
				break;
			case 2:
				getEmployeeDetailsByID();
				break;
			
			case 3:
				System.exit(0);
				break;
			
			}
		
	     }

    }

	private static void getEmployeeDetailsByID() throws IOException, SQLException {
		
		System.out.println("Enter the id ");
     	int eid = sc.nextInt();
     	ArrayList<EmployeeDetails> list;
    	list= service.retrieveDetails(eid);
    	
    	for(EmployeeDetails out:list)
    	{
    		System.out.println(out.getEmpId());
    		System.out.println(out.getFname());
    		System.out.println(out.getLname());
    		System.out.println(out.getPhoneNo());
    		System.out.println(out.getLocation());
    		System.out.println(out.getDomain());
    	}
    	

	}


	private static void addEmployeeDetails()
	{
		service = new EmployeeEnquiryServiceImpl();
		
		System.out.println("Enter first Name");
	    String fname= sc.next();
	    if(service.validateName(fname))
	    {
	    	System.out.println("Enter Last Name");
		    String lname=sc.next();
		    if(service.validateName(lname))
		    {
		       System.out.println("Enter Contact number");
		       String phoneNo=sc.next();
		       if(service.validateContact(phoneNo))
		       {
                    System.out.println("Enter Perffered Domain");
		             String domain=sc.next();
		             
		System.out.println("Enter Perffered Location");
		String location=sc.next();
		
		details = new EmployeeDetails(fname,lname,phoneNo,domain,location);
		
		int res =  service.addEmployeeDetails(details);
		
		System.out.println("Thankyou "+fname + lname + " " + ".Your Unique is "+res+" .We will contact you shortly");
		
		if(res == 1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}

	
	}
}
