package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.ATMUser;


public class LogonDAOImpl implements LogonDAO{

	
	Connection conRef;
	PreparedStatement psRef;
	ResultSet rs;
	boolean status;
	
	void getConnection() {
		try {
			conRef = ATMConnection.prepareConnection();
		} catch  (ClassNotFoundException | SQLException e) {
			System.out.println("Connection Error..."); }
			
	}

	public void loginUser(ATMUser ref) {
		getConnection();
		
		try { 
			psRef= conRef.prepareStatement("SELECT * FROM atmuser where userEmail = ? AND userPassword = ?");
			psRef.setString(1,ref.getUserEmail());
			psRef.setString(2,ref.getUserPassword());
			
			ResultSet rs = psRef.executeQuery();
			
		     if(rs.next()) {
		    	 do {
		     
		    	  if ((rs.getString(1).equals(ref.getUserEmail()))) {
 
		    	  if (rs.getString(2).equals(ref.getUserPassword())) {
		    		  System.out.println("Login successful!");
		    		  
		    		  
		    	}
		    	  }
		    	  
		    	 }       
		    	  while(rs.next());  {
	
		    	  }
		                
		    	 }
		
		  
		}

		
		catch (SQLException e) {
			System.out.println("Exception caught!!");
		}
		finally {
			try {
				conRef.close();
			} catch (SQLException e) {
				System.out.println("Exception caught");
			}
		}
		
		
	}

	
}