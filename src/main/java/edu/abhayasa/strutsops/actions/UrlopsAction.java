package edu.abhayasa.strutsops.actions;

import com.opensymphony.xwork2.ActionSupport;

import edu.abhayasa.strutsops.models.HelloMessageModel;

public class UrlopsAction extends ActionSupport {
	
	/**
	 * param name value
	 */
	private String queryName;
	private String queryCity;
	
	// Model variable
	private HelloMessageModel helloMessageModel;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action class UrlopsAction");
		helloMessageModel = new HelloMessageModel();
		
		if(queryName != null) {
			helloMessageModel.setHelloMessage( helloMessageModel.getHelloMessage() + " "+ queryName + queryCity);
		}
		
		return SUCCESS;
	}
	
	
	/**
	 * @return the queryName
	 */
	public String getQueryName() {
		return queryName;
	}
	/**
	 * @param queryName the queryName to set
	 */
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	/**
	 * @return the queryCity
	 */
	public String getQueryCity() {
		return queryCity;
	}
	/**
	 * @param queryCity the queryCity to set
	 */
	public void setQueryCity(String queryCity) {
		this.queryCity = queryCity;
	}
	
	

}
