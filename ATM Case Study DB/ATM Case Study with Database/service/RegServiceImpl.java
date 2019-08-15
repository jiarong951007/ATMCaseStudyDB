package service;


import controller.RegController;
import dao.RegDAOImpl;
import pojo.ATMUser;

public class RegServiceImpl implements RegService {
	 
	RegDAOImpl refRegDAO = new RegDAOImpl();	
	
	/*public void checkEmail(ATMUser ref) {

		RegController refRegController = new RegController();
		 
			if(ref.getUserEmail().equals("opt@gmail.com")) {
				
				 refRegController.inputPassword();
				 refRegController.inputRePassword();
			} else {
				System.out.println("Email already exists!");
			refRegController.inputEmail(); 
	
				
				}
		} */

	
			
	public void callAddUser(ATMUser ref) {
				refRegDAO.addUser(ref);
				
					}
					
	
		
	}


