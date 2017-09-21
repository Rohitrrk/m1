package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dbutil.DBUtil;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileDaoImpl implements IMobileDAO
{
	
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException 
	{
		int result = 0; 
		Connection conn=null;
		try
		{
			conn=DBUtil.getConnection();
			
			String insertQuery = "Insert into PurchaseDetails values(purchase_seq_id.nextval,?,?,?,sysdate,?)";
			
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setString(1,p.getcName());
			ps.setString(2,p.getMailId());
			ps.setLong(3,p.getPhoneNo());
			
			
			String sql ="select mobileid from mobiles where mobileid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, p.getMobileId());
			
			ResultSet rs   = pst.executeQuery();
			
			while(rs.next())
			{
				ps.setInt(4,rs.getInt(1));
				result = ps.executeUpdate();
				System.out.println(result);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			throw new MobileApplicationException(e.getMessage());
		}
		return result;
		}

}
