package com.cubic.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
       JDBCConnection jc = new JDBCConnection();
       Connection con = jc.getConnection();
       if(con !=null)
    	   System.out.println("Connection succeeded");
       else
    	   System.out.println("Connection failed");
       
         Statement st =  con.createStatement();
         int rs = st.executeUpdate("delete customers where custid IN(1009,10002,10000,10090,10091,123,1234)");
         System.out.println(rs + " rows affected");
 
	}

}
