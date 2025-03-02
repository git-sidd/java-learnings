package com.student.manage;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentController {
	public static boolean insertStudent(Student st) {
		boolean f=false;
		try {
			//jdbc code
			Connection con=CP.createCon();
			//query
			String q="insert into stud (sname,division,cgpa) values(?,?,?);" ;
			
			PreparedStatement pstmt =con.prepareStatement(q);
			pstmt.setString(1, st.getStud_name());
			pstmt.setString(2, st.getStud_div());
			pstmt.setString(3, st.getStud_cgpa());
			
			//execute if  data is not fetch by the query
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	
	public static Boolean deleteStudent(int roll) {
		Boolean f=false;
		
		try {
			Connection con=CP.createCon();
			
			String q="delete from stud where sid=?;";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, roll);
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
	
	public static void displayStudents() {
		try {
			Connection con=CP.createCon();
			
			String q="select * from stud;";
			Statement stmt=con.createStatement();
			
			ResultSet set= stmt.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String division =set.getString(3);
				String cgpa  =set.getString(4);
				
				System.out.println("id:"+id);
				System.out.println("name:"+name);
				System.out.println("division:"+division);
				System.out.println("cgpa:"+cgpa);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
