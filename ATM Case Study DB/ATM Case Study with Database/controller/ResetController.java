package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.ResetService;
import service.ResetServiceImpl;

public class ResetController {

	ATMUser ref = new ATMUser();

	
	Scanner sc = new Scanner(System.in);
	
	public void userResetController() {
		verifyEmail(); }
	
		
		public void verifyEmail() {  //method for verification of email for password reset
			
		System.out.println("Enter email address");
		String userEmail = sc.next();
		ref.setUserEmail(userEmail);
		
		//check if user email is correct 
		if (userEmail.equals("opt@gmail.com")) {
			verifySecurity();
		}
		else {
			System.out.println("Wrong Email Address!"); 
			verifyEmail(); }
	
		}
	
		
		public void verifySecurity() { //method for verification of security for password reset
			
	
		System.out.println("Enter security key");
		String userSecurity = sc.next();
		
		//check if security key is correct
		if (userSecurity.equals("black")) {
			resetPassword();
		}
		else {
			System.out.println("Wrong security key!"); 
			verifySecurity(); }
	
		}
	
		public void resetPassword() { //method to reset password
			
		
		System.out.println("Enter new password");
		String userPassword = sc.next();
		ref.setUserPassword(userPassword);
		
		
		System.out.println("Retype password");
		String rePassword = sc.next();
		ref.setRePassword(rePassword); 
		
		//password and retype password have to match
		if (userPassword.equals(rePassword)) { 
			resetSecurity();
		}
		else {
			System.out.println("Password does not match!"); 
			resetPassword(); }}
		
		public void resetSecurity() { //method to reset security answer
		System.out.println("What is your favourite color?");
		String userSecurity = sc.next();
		ref.setSecurity(userSecurity);
		System.out.println(userSecurity+" is your security key, incase if you forget your password."); 
		
		ResetService refResetService = new ResetServiceImpl();
		
		refResetService.callResetUser(ref);  }
		
			}
		
		
			
	
		
