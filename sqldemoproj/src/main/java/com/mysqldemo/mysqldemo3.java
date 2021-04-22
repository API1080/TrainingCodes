package com.mysqldemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class mysqldemo3 {
	public static void main(String[] args) {
	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			Statement st=con.createStatement();
			st.executeUpdate("CREATE DATABASE student");
			con.close();
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement stmt=con.createStatement();
			String sql="CREATE TABLE REGISTRATION ( " +
	                   " id INTEGER(12), " +
	                   " first VARCHAR(30), " + 
	                   " last VARCHAR(30), " + 
	                   " age INTEGER, " + 
	                   " address VARCHAR(100) );";
			stmt.executeUpdate(sql);
			stmt.execute("INSERT INTO registration(first,last,age,address,id) VALUES('manish','shao',35,'Mumbai',72438)");
			stmt.execute("INSERT INTO registration(first,last,age,address,id) VALUES('harish','sharma',45,'Bangalore',72488)");
			stmt.execute("INSERT INTO registration(first,last,age,address,id) VALUES('satish','shinde',31,'Pune',38264)");
			stmt.execute("INSERT INTO registration(first,last,age,address,id) VALUES('munna','rao',37,'Jaipur',301634)");
			stmt.execute("INSERT INTO registration(first,last,age,address,id) VALUES('raju','thapa',55,'Delhi',196311)");
			ResultSet rs=stmt.executeQuery("SELECT * FROM registration");
			while(rs.next())
			{
				System.out.println("\n"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" ");
			}
			con.close();
		

		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
