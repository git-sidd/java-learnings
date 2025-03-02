package com.student.manage;

import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createCon() {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			//create the connection
			String user="root";
			String password="2112";
			String url="jdbc:mysql://localhost:3306/student_management";
			con=DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;

	} 
}
