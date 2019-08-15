package service;

import dao.LogonDAOImpl;
import pojo.ATMUser;

public class LogonServiceImpl implements LogonService{


	public void callLoginUser(ATMUser ref) {
		
		LogonDAOImpl refLogonDAO = new LogonDAOImpl();
		refLogonDAO.loginUser(ref);
		
	}	
}
