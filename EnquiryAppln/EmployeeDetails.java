package com.cg.EmployeeEnquiryApplication.bean;

public class EmployeeDetails 
{
	private int EmpId;
	private String fname;
	private String lname;
	private String phoneNo;
	private String domain;
	private String location;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getFname() {
		return fname;
	}
	

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	public EmployeeDetails(String fname, String lname, String phoneNo,
			String domain, String location) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.domain = domain;
		this.location = location;
	}
	public EmployeeDetails(int empId, String fname, String lname,
			String phoneNo, String domain, String location) {
		super();
		EmpId = empId;
		this.fname = fname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.domain = domain;
		this.location = location;
	}
	
	

	

	
	

}
