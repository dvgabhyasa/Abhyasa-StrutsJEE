package edu.abhyasa.strutsops.actions;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleSelectAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String selectedClass;
	private String selectedSubject;
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}


	/**
	 * @return the selectedClass
	 */
	public String getSelectedClass() {
		return selectedClass;
	}


	/**
	 * @param selectedClass the selectedClass to set
	 */
	public void setSelectedClass(String selectedClass) {
		this.selectedClass = selectedClass;
	}


	/**
	 * @return the selectedSubject
	 */
	public String getSelectedSubject() {
		return selectedSubject;
	}


	/**
	 * @param selectedSubject the selectedSubject to set
	 */
	public void setSelectedSubject(String selectedSubject) {
		this.selectedSubject = selectedSubject;
	}
	
	
	
	
	
	
	
	

}
