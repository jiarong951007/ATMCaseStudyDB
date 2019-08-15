package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.ATMUser;


public class RegDAOImpl implements RegDAO {
	
	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection() {
		try {
			conRef = ATMConnection.prepareConnection();
		} catch  (ClassNotFoundException | SQLException e) {
			System.out.println("Connection Error..."); }
			
		}

	public void addUser(ATMUser ref) {
		getConnection(); 
		
		try {
			psRef = conRef.prepareStatement("INSERT into atmuser(userEmail, userPassword, rePassword, userSecurity) values (?,?,?,?) ");
			psRef.setString(1,ref.getUserEmail());	
			psRef.setString(2,ref.getUserPassword());
			psRef.setString(3,ref.getRePassword());
			psRef.setString(4,ref.getSecurity());
			
			psRef.executeUpdate();
			System.out.println("Registration successful!!\n\n");
		}
		catch (SQLException e) {
			System.out.println("Unable to register user, please try again..\n\n");
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