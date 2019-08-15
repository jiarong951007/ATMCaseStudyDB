package application;

import java.util.Scanner;

import controller.LogonController;
import controller.RegController;
import controller.ResetController;


public class Mainpage {

	static RegController refRegController = new RegController();
	static ResetController refResetController = new ResetController();
	static LogonController refLogonController = new LogonController();
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("User Home Page:");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Forget Password");
			System.out.println("4.Logout (exit)");
			
			System.out.println("\nEnter Your Choice:");

			int n = sc.nextInt(); //to enter the options 1,2,3 or 4. 
			
			switch(n)
			{
			case 1: //if option 1 is selected, the userRegisterController method under RegisterController() class is called. 
		
			refRegController.userRegController(); 
			break;
			
			case 2: //if option 2 is selected, the userLogonController method under LogonController() class is called. 
			refLogonController.userLogonController(); 
				
			case 3: //if option 3 is selected, the userResetController method under ResetController() class is called. 
			refResetController.userResetController(); 
			break;
				
			case 4: //if option 4 is selected, the user will be logout from the ATM application. 
			System.out.println("Logout Successfully!");
			System.exit(0);
			break;
				
				
		}
		}
	}

	
	
		
	}

	

