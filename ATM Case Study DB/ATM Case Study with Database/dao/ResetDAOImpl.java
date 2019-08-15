package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pojo.ATMUser;

public class ResetDAOImpl implements ResetDAO {
	

	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		try {
			conRef = ATMConnection.prepareConnection();
		} catch  (ClassNotFoundException | SQLException e) {
			System.out.println("Connection Error..."); }
			
		}

	public void resetUser(ATMUser ref) {
		getConnection(); 
		
		try {
			psRef = conRef.prepareStatement("UPDATE atmuser SET userPassword = ?, rePassword = ?, userSecurity = ? where userEmail = ?");
			psRef.setString(1,ref.getUserPassword());
			psRef.setString(2,ref.getRePassword());
			psRef.setString(3,ref.getSecurity());
			psRef.setString(4,ref.getUserEmail());
			
			psRef.executeUpdate();
			System.out.println("Your password has been reset successfully");
		}
		catch (SQLException e) {
			System.out.println("Unable to reset password");
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


