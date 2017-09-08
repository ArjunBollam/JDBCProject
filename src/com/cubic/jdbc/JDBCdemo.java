package com.cubic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCdemo {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Arjun1234");
		return conn;
		//Commented by bibek
	}
}
