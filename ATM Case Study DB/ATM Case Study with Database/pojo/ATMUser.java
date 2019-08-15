package pojo;


public class ATMUser {

	private String userEmail;
	private String userPassword;
	private String rePassword;
	private String userSecurity;
	
	
	//getter and setter method to get user email
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//getter and setter method to get user password
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}	
	
	//getter and setter method to get retyped password
	public String getRePassword() {
		return rePassword;
	}
	
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	//getter and setter method to get security question
	public String getSecurity() {
		return userSecurity;
	}
	
	public void setSecurity(String userSecurity) {
		this.userSecurity = userSecurity;
	}

	
}
