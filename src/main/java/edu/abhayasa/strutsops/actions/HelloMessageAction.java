/**
 * 
 */
package edu.abhayasa.strutsops.actions;

import com.opensymphony.xwork2.ActionSupport;

import edu.abhayasa.strutsops.models.HelloMessageModel;

/**
 * 
 */
public class HelloMessageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7257415540269966970L;
	
	// Model variable
	private HelloMessageModel helloMessageModel;

	// Property tag to 
	private static int count = 0;
	
	/**
	 * 
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("Action class");
		helloMessageModel = new HelloMessageModel();
		count++;
		return SUCCESS;
	}

	/**
	 * @return the helloMessageModel
	 */
	public HelloMessageModel getHelloMessageModel() {
		return helloMessageModel;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	
}
