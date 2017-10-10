package com.cg.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jboss.logging.Logger;

import com.cg.dbutil.DbUtil;
import com.cg.student.bean.StudentDetail;





public class StudentDaoImpl implements IStudentDao 
{

	Logger log=Logger.getLogger(StudentDaoImpl.class);
	public StudentDetail addStudentDetails(StudentDetail bean) 
	{
		Connection conn=null;
		int row = 0;
		int value = 0;
		try
		{
			conn=DbUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Student_Detail values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, bean.getStudentId());
			ps.setString(2, bean.getSubject());
			ps.setInt(3, bean.getTheoryMarks());
			ps.setInt(4, bean.getMcqMarks());
			ps.setInt(5, bean.getLabScore());
			ps.setInt(6, bean.getTotalScore());
			ps.setString(7,bean.getGrade());
	
			row=ps.executeUpdate();
			log.info(row+" Inserted");
			
			if(row>0)
			{
				PreparedStatement pst=conn.prepareStatement("Select student_Name from stud where student_Id=?");
				pst.setInt(1, bean.getStudentId());
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					bean.setStudentName(rs.getString(1));
				}
			}
			
			System.out.println(bean.getStudentName());
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			log.info(e.getMessage());
		}
		return bean;
	
	}
	public ArrayList<Integer> getId()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Connection con=DbUtil.getConnection();
		try 
		{
			String sql="select student_Id from Stud";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				int id=rs.getInt(1);
	
				list.add(id);
			}
			
			System.out.println("in dao" +list);
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
			log.info(e.getMessage());
		}
		
		return list;
		
	}
	
	
	

}
