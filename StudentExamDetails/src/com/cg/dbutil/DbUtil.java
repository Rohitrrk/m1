package com.cg.dbutil;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbUtil 
{
	static Connection con=null;
	public static Connection getConnection()
	{
		try
		{
			InitialContext it= new InitialContext();
			DataSource ds= (DataSource) it.lookup("java:/jdbc/OracleDS");
			con=ds.getConnection();
			
		}
		catch(SQLException e)
		{
			
		}
		catch(NamingException e)
		{
			
		}
		return con;
	}


}
