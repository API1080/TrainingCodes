package com.mysqldemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class mysqldemo1 {
	public static void main(String[] args) {
	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM details");
			while(rs.next())
			{
				System.out.println("\n"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" ");
			}
			con.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}