package coreJava2;
// Inserting data into our table
import java.sql.*;
public class JDBC_part3 {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/student_db";
		String uname="root";
		String pass="password";
		
		//String name="Neha";
		//String major="Physics";
		//String query="INSERT INTO student(name, major) VALUES (?,?)";
		
		String query="INSERT INTO student(name, major) VALUES ('Panda','EEE Eng.')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		
		//st.setString(1,name);
		//st.setString(2,major);
		//int count = st.executeUpdate();
		
		int count = st.executeUpdate(query);
		
		System.out.println(count + "row/s affected");				
		
		st.close();
		con.close();
	}

}
