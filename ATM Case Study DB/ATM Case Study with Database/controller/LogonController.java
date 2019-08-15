package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.LogonService;
import service.LogonServiceImpl;

public class LogonController {
	
	ATMUser ref = new ATMUser();
	LogonService refLogonService = new LogonServiceImpl();
	
	Scanner sc = new Scanner(System.in);
	
	public void userLogonController() {
		loginEmail(); }
	
		
		public void loginEmail() {  //method to register email address
		System.out.println("Enter email address");
		
		String userEmail = sc.next();
		ref.setUserEmail(userEmail); 
		loginPassword();
		}
		
		public void loginPassword() {  //method to register email address
			System.out.println("Enter your password");
			
			String userPassword = sc.next();
			ref.setUserPassword(userPassword); 
			refLogonService.callLoginUser(ref); 
			}
		

}
