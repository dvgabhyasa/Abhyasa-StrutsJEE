package edu.abhyasa.strutsops.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Action("/loginController")
// @Results - allow to define more than one result annotation
@Results({
	@Result(name = "success", location = "/LoginSuccess.jsp"),
	@Result(name = "error", location = "/LoginFailure.jsp")
})
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		System.out.println("From execute method");
		
		if ("test".equals(getTxtUsername()) && "test".equals(getTxtPassword())) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	// Form properties
	private String txtUsername;
	private String txtPassword;

	// Generated Setters & Getters
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

	@Override
	public String toString() {
		return "LoginAction [txtUsername=" + txtUsername + ", txtPassword=" + txtPassword + "]";
	}

}