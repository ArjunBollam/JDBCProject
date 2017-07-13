package com.cubic.jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
       JDBCConnection jc = new JDBCConnection();
       Connection con = jc.getConnection();
       if(con !=null)
    	   System.out.println("Connection succeeded");
       else
    	   System.out.println("Connection failed");
       
         //Statement st =  con.createStatement();
         PreparedStatement pst = con.prepareStatement("INSERT INTO CUSTOMERS values(?,?,?)");
         BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
         //Scanner sc = new Scanner(System.in);
         System.out.println("Enter id :");
         int id = Integer.parseInt(br.readLine());
         System.out.println("Enter name:");
         String name = br.readLine();
         System.out.println("Enter favtitem :");
         String favtitem = br.readLine();
         pst.setInt(1, id); // 1 means 1st parameter
         pst.setString(2, name);
         pst.setString(3, favtitem);
         int n = pst.executeUpdate();
         System.out.println(n + " row/s affected");
         con.close();
 
	}

}
