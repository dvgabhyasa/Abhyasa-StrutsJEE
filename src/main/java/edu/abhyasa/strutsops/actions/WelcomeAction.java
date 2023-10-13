package edu.abhyasa.strutsops.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/welcome")
@Result( name="success", location="/welsome.jsp")
public class WelcomeAction {

	/**
	 * Variable for accepting field values
	 */
	private String firstName;
	
	/**
	 * A mandatory method execute() to process data
	 * @return
	 */
	public String execute() {
		
		System.out.println("value of Firstname : " + firstName);
		return "success";
	}

	/**
	 *  Following have Getters & Setters for defined variables in the order they appeared above
	 *   
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}