package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ATMConnection {

	public static Connection prepareConnection() throws SQLException, ClassNotFoundException
	{
		//database url
		// 3306 is the default port for my sql
		
		String connectionURL ="jdbc:mysql://localhost:3306/clt6"; //core is database name
		
		//database credentials
		String uname = "root";
		String pwd = "root";
		
		//Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection ref = DriverManager.getConnection(connectionURL,uname,pwd);
		return ref;
	}
}
