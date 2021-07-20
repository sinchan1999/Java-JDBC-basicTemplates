# Java-JDBC-basicTemplates
This repo helps in establishing JDBC connections with mySQL in very less time.

Just one need to change the url,uname,pass accroding to their own mySql details.

In this Example (JDBC_part2.java) I had 3 columns so used pointer rs.next() three times .... You can  use the correct dataType and reapte the same as many times required!


## 7 Steps to remember in JDBC:
/*1. import ---> java.sql

 *2. load and register the driver -->com.mysql.jdbc.Driver
 
 *3. Create connection --> Connection con= DriverManager.getConnection(url,uname,pass);
 
 *4. Create statement --> Statement st = con.createStatement();
 
 *5. Execute the query --> st.executeQuery(query);
 
 *6. Process the results -->rs.next();    String name=rs.getString("name");
 
 *7. Close statement & connection -->st.close();           con.close();		                   
 */

