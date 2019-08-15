package controller;

import java.util.Scanner;

import pojo.ATMUser;
import service.RegService;
import service.RegServiceImpl;

public class RegController {
	
	
	ATMUser ref = new ATMUser();
	RegService refRegService = new RegServiceImpl();
	
	Scanner sc = new Scanner(System.in);
	
	public void userRegController() {
		inputEmail(); }
	
		
		public void inputEmail() {  //method to register email address
		System.out.println("Enter email address");
		
		String userEmail = sc.next();
		ref.setUserEmail(userEmail); 
	
			inputPassword(); 
			}

		
		
		
		public void inputPassword() { //method to register password and retype password
		System.out.println("Enter your password");
		String userPassword = sc.next();
		ref.setUserPassword(userPassword);
			
		System.out.println("Retype your password");
		String rePassword = sc.next();
		ref.setRePassword(rePassword);

		//password and retype password have to match
				if (userPassword.equals(rePassword)) { 
					inputSecurity();
				}
				else {
					System.out.println("Password does not match!"); 
					inputPassword(); }}
		
		
		public void inputSecurity() { 	//method to register security answer 
		System.out.println("What is your favourite color?");
		String userSecurity = sc.next();
		ref.setSecurity(userSecurity);
		System.out.println(userSecurity+" is your security key, incase if you forget your password.");
		refRegService.callAddUser(ref);  
		}


	
		
			
	}
		
		
	

