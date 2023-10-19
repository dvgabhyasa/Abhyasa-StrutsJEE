package edu.abhyasa.strutsops.actions;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	@Override
	public String execute() throws Exception {
		
		System.out.println("Execute in LoginAction");
		
		if("test".equals(getTxtUsername()) && "test".equals(getTxtPassword())) {
			return "SUCCESS";
		}else {
			return "FAILURE";
		}
	}
	
	// Java bean holds the form parameters defined in name attribute
	private String txtUsername;
	private String txtPassword;
	
	//Generated Setters & Getters
	public String getTxtUsername() {
		return txtUsername;
	}
	public void setTxtUsername(String txtUsername) {
		this.txtUsername = txtUsername;
	}
	public String getTxtPassword() {
		return txtPassword;
	}
	public void setTxtPassword(String txtPassword) {
		this.txtPassword = txtPassword;
	}	

}