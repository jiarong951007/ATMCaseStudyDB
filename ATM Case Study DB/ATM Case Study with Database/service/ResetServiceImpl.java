package service;


import controller.ResetController;
import dao.ResetDAOImpl;
import pojo.ATMUser;

public class ResetServiceImpl implements ResetService {
	
	

	public void callResetUser(ATMUser ref) {
		
		ResetDAOImpl refResetDAO = new ResetDAOImpl();
		refResetDAO.resetUser(ref);
		
	}	

}
