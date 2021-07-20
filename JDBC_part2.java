// Fetching all data from the table

package coreJava2;

import java.sql.*;
public class JDBC_part2 {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/student_db";
		String uname="root";
		String pass="password";
		String query="SELECT *FROM student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		
		String allData=" ";
		
		while(rs.next())
		{
			allData=rs.getInt(1)+" : "+rs.getString(2)+"   : "+rs.getString(3);		
			System.out.println(allData);
			
		}				
		
		st.close();
		con.close();
	}

}
