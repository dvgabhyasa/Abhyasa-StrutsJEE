/**
 * 
 */
package edu.abhyasa.strutsops.actions;

import com.opensymphony.xwork2.ActionSupport;

import edu.abhyasa.strutsops.models.SimpleFormOpsModel;

/**
 * 
 */
public class SimpleFormOpsAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SimpleFormOpsModel simpleFormBean;

	@Override
	public String execute() throws Exception {
		System.out.println("In Action execute method");
		//htmlformBean = new HtmlFormBean();
		//return super.execute();
		System.out.println(getSimpleFormBean().toString());
		return SUCCESS;
	}

	/**
	 * @return the simpleFormBean
	 */
	public SimpleFormOpsModel getSimpleFormBean() {
		return simpleFormBean;
	}

	/**
	 * @param simpleFormBean the simpleFormBean to set
	 */
	public void setSimpleFormBean(SimpleFormOpsModel simpleFormBean) {
		this.simpleFormBean = simpleFormBean;
	}

	
}