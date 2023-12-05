/**
 * 
 */
package edu.abhyasa.strutsops.models;

/**
 * 
 */
public class SimpleFormOpsModel {

	
	private String txtFirstname;
	private String txtLastname;
	private String txtEmail;
	// For age there need a clarity about data type, whether to make it integer or string
	private int txtAge;
	//private String txtAge;
	
	/**
	 * @return the txtFirstname
	 */
	public String getTxtFirstname() {
		return txtFirstname;
	}
	
	/**
	 * @param txtFirstname the txtFirstname to set
	 */
	public void setTxtFirstname(String txtFirstname) {
		this.txtFirstname = txtFirstname;
	}
	
	/**
	 * @return the txtLastname
	 */
	public String getTxtLastname() {
		return txtLastname;
	}
	
	/**
	 * @param txtLastname the txtLastname to set
	 */
	public void setTxtLastname(String txtLastname) {
		this.txtLastname = txtLastname;
	}
	
	/**
	 * @return the txtEmail
	 */
	public String getTxtEmail() {
		return txtEmail;
	}
	
	/**
	 * @param txtEmail the txtEmail to set
	 */
	public void setTxtEmail(String txtEmail) {
		this.txtEmail = txtEmail;
	}
	
	/**
	 * @return the txtAge
	 */
	public int getTxtAge() {
		return txtAge;
	}
	
	/**
	 * @param txtAge the txtAge to set
	 */
	public void setTxtAge(int txtAge) {
		this.txtAge = txtAge;
	}
	
	/**
	 * @return the txtAge
	 */
//	public String getTxtAge() {
//		return txtAge;
//	}

	/**
	 * @param txtAge the txtAge to set
	 */
//	public void setTxtAge(String txtAge) {
//		this.txtAge = txtAge;
//	}
	
	@Override
	public String toString() {
		return "HtmlFormModel [txtFirstname=" + txtFirstname + ", txtLastname=" + txtLastname + ", txtEmail=" + txtEmail
				+ ", txtAge=" + txtAge + "]";
	}

}