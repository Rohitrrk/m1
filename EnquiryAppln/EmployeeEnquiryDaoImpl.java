package com.cg.EmployeeEnquiryApplication.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.EmployeeEnquiryApplication.bean.EmployeeDetails;
import com.cg.EmployeeEnquiryApplication.dbutil.DBUtil;

public class EmployeeEnquiryDaoImpl implements IEmployeeEnquiryDao 
{

	Connection con = null;
	int res=0;
	 int result = 0;
	public int addEmployeeDetails(EmployeeDetails e) 
	{
		try {
			
			Connection con = DBUtil.getConnection();
			String insertQuery = "INSERT INTO EmployeeDetail Values(empid_seq.nextval,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(insertQuery);

			ps.setString(1,e.getFname());
			ps.setString(2,e.getLname());
			ps.setString(3,e.getPhoneNo());
			ps.setString(4, e.getDomain());
			ps.setString(5, e.getLocation());

			 res =ps.executeUpdate();
			 
			 if(res == 1)
			 {
				 String sql = "Select EmpId From EmployeeDetail where fname = ? AND lname = ?";
				 PreparedStatement pst=con.prepareStatement(sql);
				 pst.setString(1,e.getFname());
				 pst.setString(2,e.getLname());
				 
				 ResultSet rs=pst.executeQuery();
				 while(rs.next())
				 {
					result = rs.getInt(1);
				 }
			 }
			 else
			 {
				 return 0;
			 }
		}
		
		catch (IOException e1) 
		{
			
			e1.printStackTrace();
		}
		
		catch (SQLException e1) 
		{
			
			e1.printStackTrace();
		}
	
		return result;
	}



	@Override
	public ArrayList<EmployeeDetails> retrieveDetails(int eid)
			throws IOException, SQLException 
			
	{
		con=DBUtil.getConnection();
		ArrayList<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		try
		{
			
		String sql = "Select * from EmployeeDetail where empid = ?";
	
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, eid);
		ResultSet rs = pst.executeQuery();
	
			while(rs.next())
			{
				int eid1 = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String phoneNo = rs.getString(4);
				String domain = rs.getString(5);
				String location = rs.getString(6);
				
				list.add(new EmployeeDetails(eid1,fname,lname,phoneNo,domain,location));
			}
		}
		
	  catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		
		return list;

		
	}


}
	


