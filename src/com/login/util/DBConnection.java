//DBConnection.java
package com.login.util;
import java.sql.Connection;
import com.email.notification.*;
import java.sql.DriverManager;
public class DBConnection {
	public static Connection createConnection()
	{
		//test comment
		Connection con = null;
		String url = "jdbc:mysql://192.168.30.104:3306/customers";
		String username = "priyanka";
		String password = "Datamato@123";
		String ConnectionDriver ="com.mysql.jdbc.Driver";
		//String password = "root";
		try
		{
			try
			{
				Class.forName(ConnectionDriver);
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}

			con = DriverManager.getConnection(url, username, password);
			System.out.println("Post establishing a DB connection - "+con);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}